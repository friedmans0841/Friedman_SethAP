public abstract class car implements location
{
	int ID;
	
	public Car()
	{
		ID = (int)(Math.random() * 999999) + 1;
	}
}