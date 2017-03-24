public abstract class toyclass
{
	private String name;
	private int count;
	
	public toyclass()
	{
		this.name = "";
		this.count = 1;
	}
	
	public toyclass(String n)
	{
		this.name = n;
		this.count = 1;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCount(int c)
	{
		this.count = c;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public abstract String getType();
	
	public String toString()
	{
		return name + "..." + count;
	}
}