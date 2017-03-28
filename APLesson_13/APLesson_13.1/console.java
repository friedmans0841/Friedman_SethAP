public abstract class console extends GameSystem
{
	public console()
	{
		super();
	}
	
	public console(String n)
	{
		super(n);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nserial #: " + getSerialNo() + "\nController " + getController();
	}
}