public abstract class car implements location
{
	private int ID;
	public double[] location;
	
	public car()
	{
		ID = (int)(Math.random() * 999999) + 1;
		location = new double[2];
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public int getID()
	{
		return ID;
	}
		
	public double[] getLoc()
	{
		return location;
	}
}