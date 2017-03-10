public class PlayStation extends Console
{
	public PlayStation()
	{
		super();
	}
	
	public PlayStation(String n)
	{
		super(n);
	}
	
	public String getController()
	{
		return "PS DualShock 3";
	}
	
	public String getPlatform()
	{
		return "PlayStation";
	}
}