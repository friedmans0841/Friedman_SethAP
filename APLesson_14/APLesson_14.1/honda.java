public class honda extends car
{
	private double corx, cory;
	
	public honda()
	{
		corx = 0;
		cory = 0;		
	}
	
	public honda(double[] inpcor)
	{
		super();
		corx = inpcor[0];
		cory = inpcor[1];
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