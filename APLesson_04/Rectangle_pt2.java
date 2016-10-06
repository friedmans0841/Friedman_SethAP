import java.util.Scanner;
public class Rectangle_pt2
{
	Rectangle_pt2 form = new Rectangle_pt2();
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length:");
		double l = kb.nextInt();
		System.out.println("Enter the width:");
		double w = kb.nextInt();
		double perim = calcPerim(l,w);
		print(perimeter);
	}
	
	public static void calcPerim(int l, int w)
	{
		perimeter = 2 * (l + w);
	}
	
	public static void print(double perimeter)
	{
		System.out.println("Your rectangle is " + perimeter + " ft around.");
	}
}