public abstract class Ticket
{
	private int serialNo;
	
	public Ticket()
	{
		serialNo = 0;
	}
	
	public int getSerialNo()
	{
		return (int)(Math.random() * 10000000) + 1; 
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
}