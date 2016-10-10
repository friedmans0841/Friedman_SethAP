import java.util.Scanner;
public class Rectangle
{
	static double l;
	static double w;
	static double calcPerim;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length:");
		l = kb.nextDouble();
		System.out.println("Enter the width:");
		w = kb.nextDouble();
		calcPerim(l,w);
		print();
	}
	
	public static void calcPerim(double l, double w)
	{
		calcPerim = 2 * (l + w);
	}
	
	public static void print()
	{
		System.out.println("Your rectangle is " + calcPerim + " ft around.");
	}
}