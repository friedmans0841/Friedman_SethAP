import java.util.Scanner;
public class Lab_04_2Ex_01
{
	static int l, w;
	static int perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length:");
		l = kb.nextInt();
		System.out.println("enter the width:");
		w = kb.nextInt();
		calcPerim(l,w);
		print();
	}
	public static void calcPerim(int l, int w)
	{
		perimeter = 2 * (l + w);
	}
	public static void print()
	{
		System.out.println("The perimeter of your rectangle is " + perimeter);
	}
}