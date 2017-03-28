public class StudentAdvance extends Advance
{
	public StudentAdvance(int DL)
	{
		super(DL);
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice() + "\nSTUDENT ID REQUIRED";
	}
}