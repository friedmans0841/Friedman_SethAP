import java.lang.Math.*;

public class APLab_12pt1
{
	private int distance, hours, minutes;
	private double MilesPerH;
	
	public void MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		MilesPerH = 0;
	}
	
	public void MilesPerHour(int dis, int hou, int min)
	{
		distance = dis;
		hours = hou;
		minutes = min;
		MilesPerH = 0;
	}
	
	public void setValues(int dis, int hou, int min)
	{
		distance = dis;
		hours = hou;
		minutes = min;
	}
	
	public int getDistance()
	{
		return distance;
	}
	public int getHours()
	{
		return hours;
	}
	public int getMinutes()
	{
		return minutes;
	}
	
	public double getMPH()
	{
		return (distance/(hours + (minutes / 60.0)));
	}
	
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