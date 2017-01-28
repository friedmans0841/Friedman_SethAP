import java.lang.Math.*;

public class APLab_12pt1
{
	private int distance, hours, minutes;
	private double MilesPerH;
	
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		MilesPerH = 0;
	}
	
	public MilesPerHour(int dis, int hou, int min)
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
} 