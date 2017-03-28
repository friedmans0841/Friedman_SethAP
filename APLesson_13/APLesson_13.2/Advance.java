public class Advance extends Ticket
{
	private int DaysLeft;
	
	public Advance(int DL)
	{
		super();
		DaysLeft = DL;
	}
	
	public double getPrice()
	{
		if (DaysLeft >= 10)
		{
			return 30.00;
		}
		else
		{
			return 40.00;
		}
	}
}