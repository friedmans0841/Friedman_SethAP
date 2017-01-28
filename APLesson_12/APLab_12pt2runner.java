import java.util.Scanner;
public class APLab_12pt2runner
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("x-coordinate of first point:");
		int xin1 = kb.nextInt();
		System.out.println("y-coordinate of first point:");
		int yin1 = kb.nextInt();
		System.out.println("x-coordinate of second point:");
		int xin2 = kb.nextInt();
		System.out.println("y-coordinate of second point:");
		int yin2 = kb.nextInt();
		
		Distance obj = new Distance(5, 6, 6, 6);
		
		System.out.println("The distance between (" + obj.getX1() + ", " + obj.getY1() + ")and (" + obj.getX2() + ", " + obj.getY2() +") is " + obj.getDistance());
		
		obj.setCoordinates(xin1, yin1, xin2, yin2);
		System.out.println("\nUser Inputs:");
		System.out.println("The distance between (" + obj.getX1() + ", " + obj.getY1() + ")and (" + obj.getX2() + ", " + obj.getY2() +") is " + obj.getDistance());
	}
}