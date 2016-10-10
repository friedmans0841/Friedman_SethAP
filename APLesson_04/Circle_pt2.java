import java.util.Scanner;
public class Circle_pt2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius of your cicrle:");
		double r = kb.nextDouble();
		double area = calcArea(r);
		print(r, area);
	}
	public static double calcArea(double r)
	{
		return 3.14 * (r*r);
	}
	public static void print(double r, double area)
	{
		System.out.printf("The area of a circle with a radius of " + r + " is %.5f", area);
	}
}