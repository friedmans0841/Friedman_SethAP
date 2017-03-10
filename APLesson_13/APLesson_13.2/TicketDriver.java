public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket objAdvDiscount = new Advance(15);
		Ticket objAdvNoDiscount = new Advance(5);
		Ticket objStudentAdv = new StudentAdvance(15);
		Ticket objWalkup = new Walkup();
		
		System.out.println("Advance Ticket w/ Discount (15 days before)");
		System.out.println(objAdvDiscount);
		System.out.println();
		System.out.println("Advance Ticket w/o Discount (5 days before)");
		System.out.println(objAdvNoDiscount); 
		System.out.println();
		System.out.println("Student Advance Ticket w/ Discount");
		System.out.println(objStudentAdv);
		System.out.println();
		System.out.println("Walkup Ticket");
		System.out.println(objWalkup);
	}
}