public class GMC implements location
{
	private int corx, cory;
	
	public GMC()
	{
		corx = 0;
		cory = 0;		
	}
	
	public GMC(int x, int y)
	{
		corx = x;
		cory = y;
	}
	
	public double[] getLoc()
	{
		double location[] = new double[2];
		location[0] = coorx;
		location[1] = coory;
		return lcation;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 999999) + 1;
	}
}