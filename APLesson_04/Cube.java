import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter one side of your cube:");
		side = kb.nextDouble();
		calcSurf();
		print();
		print1();
	}
	
	public static void calcSurf()
	{
		sa = (6 * (side * side));
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube whose sides are " + side + " in legnth is %.5f", sa);
	}
	
	public static void print1()
	{
		int num = 7 % 3;
		System.out.println(num);
	}
	
}