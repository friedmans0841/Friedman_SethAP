import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("This is a reqtangular prism area calculator. ");
		System.out.println("Please enter the legnth: ");
		int l = keyboard.nextInt();
		System.out.println("Please enter the width: ");
		int w = keyboard.nextInt();
		System.out.println("Please enter the height: ");
		int h = keyboard.nextInt();
		int area = (2*((w*l)+(h*l)+(h*w)));
		System.out.println("the area is: " + area);
		
		
	}
}