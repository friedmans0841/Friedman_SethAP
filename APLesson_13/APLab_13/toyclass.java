public abstract class toyclass
{
	private String name;
	private double count;
	
	public void Toy()
	{
		this.name = "";
		this.count = 1;
	}
	
	public void Toy(String n)
	{
		this.name = n;
		this.count = 1;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCount(double c)
	{
		this.count = c;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getCount()
	{
		return count;
	}
	
	public String toString()
	{
		return name + "\t...\t" + count;
	}
}