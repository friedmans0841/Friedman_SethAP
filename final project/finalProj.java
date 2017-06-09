
 
 package require Tk
 array set opt {
   "stocks,watched" "SCOX NOVL IBM RHAT"
   "fetch,cycle" 10
   "display,cycle" 15
   "daylight,savings" "off"
   "gui,bg" "#000000"
   "clock,bg" "#000000"
   "clock,fg" "#ffd700"
   "title,bg" "#000000"
   "title,fg" "#ff0000"
   "ticker,bg" "#000000"
   "ticker,fg" "#ffd700"
   "title,font" "Helvetica 12"
 }
 
 array set bmp {
 "dot" "#define dot11_width 11 #define dot11_height 11
 static unsigned char dot11_bits[] = {
    0x00, 0x00, 0xf8, 0x00, 0xfc, 0x01, 0xfe, 0x03, 0xfe, 0x03, 0xfe, 0x03,
    0xfe, 0x03, 0xfe, 0x03, 0xfc, 0x01, 0xf8, 0x00, 0x00, 0x00};"
 }
 set stock(fields) "symbol price change volume low high open time"
 
 proc safe_exit {} {
   foreach id [after info] {
     catch {after cancel $id}
   }
   catch {destroy .s .}
   return
 }
 
 proc update_clock {} {
   ## sanity check
   if {![winfo exists .s]} {
     safe_exit
   } else {
     .s.ctrl.clock configure -text [clock format [clock seconds] -format "%H:%M:%S"]
     after 1000 update_clock
   }
   return
 }
 
 proc init_stock {s} {
   global stock
   foreach field $stock(fields) {
     set stock($s,$field) ""
   }
   return
 }
  proc geturl_followRedirects {url args} {
    array set URI [::uri::split $url] ;# Need host info from here
    while {1} {
        set token [eval [list http::geturl $url] $args]
        if {![string match {30[1237]} [::http::ncode $token]]} {return $token}
        array set meta [set ${token}(meta)]
        if {![info exist meta(Location)]} {
            return $token
        }
        array set uri [::uri::split $meta(Location)]
        unset meta
        if {$uri(host) == ""} { set uri(host) $URI(host) }
        # problem w/ relative versus absolute paths
        set url [eval ::uri::join [array get uri]]
    }
 }
 #"SCOX",14.37,"1/30/2004","3:58pm",-0.48,15.07,15.07,14.36,87362
 # ID    price  date        time    change open high low volume
 proc get_stocks {} {
   global opt stock
   set stock(fails) ""
   if {$opt(stocks,watched) == ""} {
     return 0
   }
   bimg(market,ud) configure -foreground #00ff00
   foreach symbol $opt(stocks,watched) {
             http::config -useragent "Mozilla/5.0 (Windows; U; Windows NT 5.2; en-US; rv:1.9.2.6) Gecko/20100625 Firefox/3.6.6"
        if {[catch {geturl_followRedirects http://finance.yahoo.com/d/quotes.csv?s=$symbol&f=sl1d1t1c1ohgv&e=.csv -timeout 30000} tok]} {
       lappend stock(fails) $symbol
     } else {
       # sanity check
       if {[http::status $tok] == "ok"} {
         set stock($symbol,raw) [split [http::data $tok] \n]
         set r [split [lindex $stock($symbol,raw) 0] ","]
         array set v {"symbol" 0 "price" 1 "change" 4 "volume" 8 "low" 7 "high" 6 "open" 5 "time" 3}
         foreach field [array names v] {
           set stock($symbol,$field) [string map {\" ""} [lindex $r $v($field)]]
         }
         http::cleanup $tok
       } else {
         http::cleanup $tok
         lappend stock(fails) $symbol
       }
     }
   }
   if {[llength $stock(fails)] > 0} {
     bimg(market,ud) configure -foreground #ffff00
     return 0
   } else {
     bimg(market,ud) configure -foreground #ff0000
     return 1
   }
 }
 
 proc cycle_fetch {} {
   global opt
   catch {after cancel $opt(fetch,after)}
   if {[is_market_open]} {
     set result [get_stocks]
     bimg(market,oc) configure -foreground #00ff00
   } else {
     bimg(market,oc) configure -foreground #ff0000
   }
   set opt(fetch,after) [after [expr {$opt(fetch,cycle)*60000}] cycle_fetch]
   return
 }
 
 proc is_market_open {} {
   global opt
   if {[string tolower $opt(daylight,savings)] == "off"} {
     set ts [expr {[clock scan "now" -base [clock seconds] -gmt 1]-18000}]
   } else {
     set ts [expr {[clock scan "now" -base [clock seconds] -gmt 1]-14400}]
   }
   set day [clock format $ts -gmt 1 -format "%w"]
   if {$day == 0 || $day == 6} {
     return 0
   } else {
     set hh [clock format $ts -gmt 1 -format "%H"]
     scan $hh %d hh
     set mm [clock format $ts -gmt 1 -format "%M"]
     scan $mm %d mm
   }
   if {$hh < 9 || $hh > 15} {
     return 0
   }
   if {$hh == 9 && $mm < 30} {
     return 0
   }
   return 1
 }
 
 proc change_display {dir} {
   global opt stock
   switch -- $dir {
     forward {
       if {$opt(display,cur) >= [expr {[llength $opt(stocks,watched)]-1}]} {
         set opt(display,cur) 0
       } else {
         incr opt(display,cur)
       }
     }
     back {
       if {$opt(display,cur) <= 0} {
         set opt(display,cur) [expr {[llength $opt(stocks,watched)]-1}]
       } else {
         incr opt(display,cur) -1
       }
     }
     default {}
   }
   foreach f $stock(fields) {
     .s.stocks.$f configure -text $stock([lindex $opt(stocks,watched) $opt(display,cur)],$f)
   }
   return
 }
 
 proc cycle_display {} {
   global opt
   catch {after cancel $opt(display,after)}
   if {[llength $opt(stocks,watched)] > 1} {
     change_display "forward"
   }
   set opt(display,after) [after [expr {$opt(display,cycle)*1000}] cycle_display]
   return
 }
 
 proc set_cycle {type} {
   global opt
   set w ".s.ctrl.$type"
   if {![string is integer [$w get]]} {
     bell
     return
   } else {
     set opt($type,cycle) [$w get]
   }
   focus .s
   if {$type == "display"} {
     set delay [expr {$opt($type,cycle)*1000}]
   } else {
     set delay [expr {$opt($type,cycle)*60000}]
   }
   catch {after cancel $opt($type,after)}
   after $delay cycle_$type
   return
 }
 
 proc init_widgets {} {
   global opt bmp stock
   frame .s.title
   foreach name $stock(fields) {
     label .s.title.$name \
       -bg $opt(title,bg) -foreground $opt(title,fg) \
       -font $opt(title,font) -height 1 -width 9 -text $name
     pack .s.title.$name -side left
   }
   pack .s.title -side top
   frame .s.stocks
   foreach field $stock(fields) {
     label .s.stocks.$field \
       -bg $opt(ticker,bg) -foreground $opt(ticker,fg) \
       -font $opt(title,font) -height 1 -width 9 -text ""
     pack .s.stocks.$field -side left
   }
   pack .s.stocks -side top
 
   set b(left) "<-"
   set b(right) "->"
   frame .s.ctrl -bg $opt(title,bg)
   foreach but {left right} {
     button .s.ctrl.$but \
       -activebackground #ffffff -activeforeground #0000ff \
       -background #eaeaea -foreground #0000ff \
       -borderwidth 1 -relief solid \
       -height 1 -width 2 \
       -font {Helvetica 10 bold} -text $b($but) \
       -command {}
     pack .s.ctrl.$but -side left -padx 3
   }
   .s.ctrl.left configure -command {change_display "back"}
   .s.ctrl.right configure -command {change_display "forward"}
 
   label .s.ctrl.displayHead \
     -background #000000 -foreground #ffff00 \
     -borderwidth 0 -relief solid \
     -font {Helvetica 10} -text "DISPLAY" -height 1 -width 7
   pack .s.ctrl.displayHead -side left
   entry .s.ctrl.display -relief sunken -bd 1 -width 3 \
     -background #ffffff -font {Helvetica 12}
   pack .s.ctrl.display -side left
   .s.ctrl.display insert 0 $opt(display,cycle)
   bind .s.ctrl.display <Key-Return> {set_cycle "display"}
   label .s.ctrl.displayTail \
     -background #000000 -foreground #ffff00 \
     -borderwidth 0 -relief solid \
     -font {Helvetica 10} -text "SEC" -height 1 -width 4
   pack .s.ctrl.displayTail -side left
 
   image create bitmap bimg(market,ud) -data $bmp(dot)
   bimg(market,ud) configure -foreground #ffff00
   label .s.ctrl.ud \
     -background #000000 -foreground #000000 \
     -borderwidth 1 -relief solid \
     -image bimg(market,ud) 
   pack .s.ctrl.ud -side left
 
   button .s.ctrl.update \
     -activebackground #ffffff -activeforeground #0000ff \
     -background #eaeaea -foreground #0000ff \
     -borderwidth 1 -relief solid \
     -font {Helvetica 10} -text "UPDATE"  -height 1 -width 6 \
     -command {get_stocks}
   pack .s.ctrl.update -side left -padx 5
 
   label .s.ctrl.fetchHead \
     -background #000000 -foreground #ffff00 \
     -borderwidth 0 -relief solid \
     -font {Helvetica 10} -text "FETCH" -height 1 -width 6
   pack .s.ctrl.fetchHead -side left
   entry .s.ctrl.fetch -relief sunken -bd 1 -width 2 \
     -background #ffffff -font {Helvetica 12}
   pack .s.ctrl.fetch -side left
   .s.ctrl.fetch insert 0 $opt(fetch,cycle)
   bind .s.ctrl.fetch <Key-Return> {set_cycle "fetch"}
   label .s.ctrl.fetchTail \
     -background #000000 -foreground #ffff00 \
     -borderwidth 0 -relief solid \
     -font {Helvetica 10} -text "MIN" -height 1 -width 4
   pack .s.ctrl.fetchTail -side left
 
   button .s.ctrl.edit \
     -activebackground #ffffff -activeforeground #0000ff \
     -background #eaeaea -foreground #0000ff \
     -borderwidth 1 -relief solid -font {Helvetica 10} \
     -text "ADD/DEL"  -height 1 -width 8 -command {pop_win "edit" "Add/Del Stocks"}
   pack .s.ctrl.edit -side left -padx 5
 
   image create bitmap bimg(market,oc) -data $bmp(dot)
   bimg(market,oc) configure -foreground #ff0000
   label .s.ctrl.market \
     -background #000000 -foreground #000000 \
     -borderwidth 1 -relief solid \
     -image bimg(market,oc) 
   pack .s.ctrl.market -side right -padx 5
 
   label .s.ctrl.clock \
     -bg $opt(clock,bg) -foreground $opt(clock,fg) \
     -font {Helvetica 14} -text "00:00:00"  -height 1 -width 8
   pack .s.ctrl.clock -side right
 
   pack .s.ctrl -side top -anchor w -fill x
   set opt(display,cur) 0
   return
 }
 
 proc edit_stock {t} {
   global opt
   set w .edit
   focus $w
   if {[$w.$t.$t get] == ""} {
     focus $w.$t.$t
     pop_win "error" "Illegal value!"
     return
   } else {
     set sym [string trim [string toupper [$w.$t.$t get]]]
     $w.$t.$t delete 0 end
   }
   switch -- $t {
     "add" {
       if {[lsearch $sym $opt(stocks,watched)] != -1} {
         focus $w.add.add
         pop_win "error" "$sym already being watched"
         return
       }
       if {[string first " " $sym] != -1} {
         focus $w.add.add
         pop_win "error" "Can only add one stock at a time."
         return
       }
       pop_win notice "$sym added to stocks watched"
       set result [init_stock $sym]
       lappend opt(stocks,watched) $sym
       set result [get_stocks]
     }
     "delete" {
       if {[lsearch -exact $opt(stocks,watched) $sym] == -1} {
         focus $w.add.add
         pop_win "error" "I don't see \"$sym\" among the stocks watched."
         return
       } else {
         set idx [lsearch -exact $opt(stocks,watched) $sym]
         set opt(stocks,watched) [lreplace $opt(stocks,watched) $idx $idx]
         catch {after cancel $opt(display,after)}
         set opt(display,cur) 0
         cycle_display
       }
     }
     default {}
   }
   return
 }
 
 array set win {
   "about,x" 220 "about,y" 100
   "about,bg" "#0000ff"
   "edit,bg" "#000000"
   "error,bg" "#eaeaea"
   "notice,bg" "#eaeaea"
 }
 
 proc pop_win {n txt} {
   global opt win
   set w .$n
   # Abort if window already exists
   if {[winfo exists $w]} {
     raise $w
     focus $w
     return
   }
   toplevel $w
   wm deiconify $w
   $w configure -background $win($n,bg)
   $w configure -cursor draft_small
 
   switch -- $n {
     "about" {
       wm geometry $w $win($n,x)x$win($n,y)+[expr {[winfo x .s]+50}]+[winfo y .s]
       wm title $w $txt
       label $w.title \
         -bg #0000ff -foreground #ffffff \
         -font {Helvetica 14 bold} -height 3 -width 30 \
         -text "Stock Watch was written by\nmoogyCode\[TM\] 2004\nMike Tuxford" 
       pack $w.title -side top
       button $w.close \
         -activebackground #ffffff -activeforeground #0000ff \
         -background #eaeaea -foreground #0000ff \
         -borderwidth 1 -relief solid -height 1 -width 20 \
         -font {Helvetica 14} -text "I knew that!" -command {destroy .about}
       pack $w.close -side top
       bind $w <Control-c> "destroy $w"
     }
     "edit" {
       wm geometry $w +[expr {[winfo x .s]+50}]+[winfo y .s]
       wm title $w $txt
       frame $w.add -relief groove -bd 5
       label $w.add.head \
         -background #eaeaea -foreground #000000 \
         -borderwidth 0 -relief flat \
         -font {Helvetica 12} -text "Add a Stock" -height 1 -width 15
       pack $w.add.head -side left -padx 10 -pady 5
       entry $w.add.add -relief sunken -bd 3 -width 6 \
         -background #ffffff -font {Helvetica 12}
       pack $w.add.add -side left -padx 10 -pady 5
       bind $w.add.add <Key-Return> {edit_stock "add"}
       pack $w.add -side top -padx 10 -pady 5
 
       frame $w.delete -relief groove -bd 5
       label $w.delete.head \
         -background #eaeaea -foreground #000000 \
         -borderwidth 0 -relief flat \
         -font {Helvetica 12} -text "Delete a Stock" -height 1 -width 15
       pack $w.delete.head -side left -padx 10 -pady 5
       entry $w.delete.delete -relief sunken -bd 3 -width 6 \
         -background #ffffff -font {Helvetica 12}
       pack $w.delete.delete -side left -padx 10 -pady 5
       bind $w.delete.delete <Key-Return> {edit_stock "delete"}
       pack $w.delete -side top -padx 10
 
       button $w.close \
         -activebackground #ffffff -activeforeground #0000ff \
         -background #eaeaea -foreground #0000ff \
         -borderwidth 1 -relief solid -height 1 -width 26 \
         -font {Helvetica 12} -text "CLOSE WINDOW" -command "destroy .$n"
       pack $w.close -side bottom -pady 5
       bind $w <Control-c> "destroy $w"
     }
     error - notice {
       wm geometry $w +[expr {[winfo x .s]+50}]+[winfo y .s]
       wm title $w "Error"
       label $w.msg \
         -background #eaeaea -foreground #000000 \
         -borderwidth 0 -relief flat -font {Helvetica 12} \
         -text $txt -width [expr {[string length $txt]+2}]
       pack $w.msg -side top -padx 10 -pady 5
       button $w.close \
         -activebackground #ffffff -activeforeground #0000ff \
         -background #eaeaea -foreground #0000ff \
         -borderwidth 1 -relief solid -height 1 -width 4 \
         -font {Helvetica 12} -text "OK" -command "destroy $w"
       pack $w.close -side bottom -pady 5
       bind $w <Control-c> "destroy $w"
     }
     default { destroy $w }
   }
   return
 }
 
 proc GUI {} {
   global opt
   wm withdraw .
   set w .s
   toplevel $w
   $w configure -background $opt(gui,bg)
   wm title $w "Stock Watcher"
   wm deiconify $w
   #####################
   # MAIN MENU
   menu $w.main -tearoff 0
   $w.main configure -font {Helvetica 10}
   set ma $w.main.file
   menu $ma -tearoff 0
   $ma configure -font {Helvetica 10}
   $w.main add cascade -label "Menu" -menu $ma
 
   $ma add separator
   $ma add command -label "About" -command {pop_win "about" "About"}
   $ma add command -label "Exit" -command {safe_exit}
   $ma add separator
   $w configure -cursor draft_small
   #
   # END MAIN MENU ###
   ####################
   # WIDGETS
   init_widgets
   ####################
   # bind some Hotkeys
   bind $w <Control-c> {safe_exit}
   bind $w <Key-q> {safe_exit}
   bind $w <ButtonPress-3> {tk_popup .s.main [expr [winfo pointerx .s] -5] [expr [winfo pointery .s] -5]}
 ### End GUI ##########
 }
 
 ####################
 # Get the show started
 package require http
 package require uri
 GUI
 update_clock
 #devp_init
 foreach stk $opt(stocks,watched) {
   init_stock $stk
 }
 foreach f $stock(fields) {
   .s.stocks.$f configure -text $stock([lindex $opt(stocks,watched) $opt(display,cur)],$f)
 }
 if {[is_market_open]} {
   bimg(market,oc) configure -foreground #00ff00
 } else {
   bimg(market,oc) configure -foreground #ff0000
   get_stocks 
 }
 cycle_fetch
 change_display forward
 set opt(display,after) [after [expr {$opt(display,cycle)*1000}] cycle_display]
 