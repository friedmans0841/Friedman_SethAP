import java.util.Scanner;

public class APLab_12pt1runner
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Distance in miles:");
		int dist = kb.nextInt();
		System.out.println("Hours:");
		int hour = kb.nextInt();
		System.out.println("Minutes:");
		int minu = kb.nextInt();
		
		MilesPerHour obj = new MilesPerHour(10, 2, 0);
		
		System.out.println(obj.getDistance() + " miles in " + obj.getHours() + " hours and " + obj.getMinutes() + " minutes = " + obj.getMPH() + " mph.");
		
		obj.setValues(dist, hour, minu);
		
		System.out.println("\nUser Input:");
		System.out.println(obj.getDistance() + " miles in " + obj.getHours() + " hours and " + obj.getMinutes() + " minutes = " + obj.getMPH() + " mph.");
	}
}