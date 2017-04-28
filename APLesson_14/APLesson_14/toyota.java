public class GMC implements Location
{
	private int coorx, coory;
	
	public GMC()
	{
		coorx = 0;
		coory = 0;		
	}
	
	public GMC(int x, int y)
	{
		coorx = x;
		coory = y;
	}
	
	public double[] getLoc()
	{
		double location[] = new double[2];
		location[0] = coorx;
		location[1] = coory;
		return loction;
	}	
	
	public int getID()
	{
		return (int)(Math.random() * 999999) + 1;
	}
}