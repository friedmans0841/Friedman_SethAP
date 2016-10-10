import java.util.Scanner;
public class Cube_pt2
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter one side of your cube:");
		double side = kb.nextDouble();
		double sa = calcSurf(side);
		print(side, sa);
	}
	
	public static double calcSurf(double side)
	{
		return (6 * (side * side));
	}
	
	public static void print(double side, double sa)
	{
		System.out.printf("The surface area of a cube whose sides are " + side + " in legnth is " + sa);
	}
	
	
}