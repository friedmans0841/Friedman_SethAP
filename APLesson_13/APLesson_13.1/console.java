public abstract class console extends gameSystem
{
	public console()
	{
		super();
	}
	
	public console(String n)
	{
		super(n);
	}
	
	public abstract String getcontroller();
	
	public String toString()
	{
		return "Platform: " + getPlatform() + "\nserial #: " + super.getSerialNo() + "\nController " + getcontroller();
	}
}