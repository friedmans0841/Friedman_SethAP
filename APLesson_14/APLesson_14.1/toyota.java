import java.util.ArrayList;
import java.util.Arrays;

public class toyota extends car
{	
	private String scor;
	private double corx;
	private double cory;
	
	public toyota(String inp)
	{
		super();
		ArrayList<String> coorz = new ArrayList<>(Arrays.asList(inp.split(", ")));
		double x = Double.parseDouble(coorz.get(0));
		double y = Double.parseDouble(coorz.get(1));
		move(x,y);
	}
		
	public void move(double x, double y)
	{
		corx += x;
		cory += y;
	}
	
	public double[] getLoc()
	{
		double[] location = {corx, cory};
		return location;
	}
	
	public int getID()
	{
		return ID;
	}
}