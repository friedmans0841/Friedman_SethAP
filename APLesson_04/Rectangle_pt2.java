import java.util.Scanner;
public class Rectangle_pt2
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length:");
		double l = kb.nextDouble();
		System.out.println("Enter the width:");
		double w = kb.nextDouble();
		double perim = calcPerim(l,w);
		print(perim);
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2 * (l + w);
	}
	
	public static void print(double perimeter)
	{
		System.out.println("Your rectangle is " + perimeter + " ft around.");
	}
}