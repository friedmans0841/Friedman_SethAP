import java.util.Scanner;

public class APLab_03_Ex_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi my name is RudeAI.");
		
		System.out.println("I'd like to ask you a few questions.");
		
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		
		System.out.println("Really? " + name + " is such a lame name you should be ashamed.");
		
		System.out.println("Hopefully your age isnt as bad as your name is.");
		
		System.out.println("So what is is im waiting?");
		
		String age = keyboard.next();
		
		System.out.println("wow! " + age + " is old.");
		
		System.out.println("What do you do for fun? I bet its something boring.");
		
		String fun = keyboard.next();
		
		System.out.println("Of corse " + fun + " is what you do for fun.");
		
		System.out.println("How about music what do you like?");
		
		String music = keyboard.next();
		
		System.out.println("I knew you would have a good taste of music since you listen to " + music);
		
		System.out.println("How about siblings?");
		
		String siblings = keyboard.next();
		
		System.out.println("I bet your " + siblings + " siblings don't like you becuase I don't.");
		
		System.out.println("What do you want to be when you grow up?");
		
		String grow = keyboard.next();
		
		System.out.println("I was really rooting for you to say something cool but instead you said " + grow + " you could have said any thing and it would have been way better."); 
		
		System.out.println("So " + name + " You're " + age + " you like to " + fun + " and listen to " + music);
		
		System.out.println("good luck with you life long goal of becoming a lame " + grow);
		
		System.out.println(" I'm only kidding " + name);
	}
}