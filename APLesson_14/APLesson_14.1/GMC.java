public class GMC extends car
{
	private double corx, cory;
	
	public GMC()
	{
		super();
		corx = 0;
		cory = 0;		
	}
	
	public GMC(double x, double y)
	{
		super();
		corx = x;
		cory = y;
	}
	
	public void move(double x, double y)
	{
		corx += x;
		cory += y;
	}
	
	public double[] getLoc()
	{
		double location[] = new double[2];
		location[0] = corx;
		location[1] = cory;
		return location;
	}
	
	public int getID()
	{
		return ID;
	}
}