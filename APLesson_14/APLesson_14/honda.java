public class honda implements location
{
	private double corx, cory;
	
	public honda()
	{
		corx = 0;
		cory = 0;		
	}
	
	public honda(double[] inpcor)
	{
		corx = inpcor[0];
		cory = inpcor[1];
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
		return (int)(Math.random() * 999999) + 1;
	}
}