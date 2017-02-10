public class APLab_12pt3
{
	private String paint, interior, engine, tires;
	
	public Car(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public void setCustom(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;		
	}
	
	public Car()
	{
		paint = "";
		interior = "";
		engine ="";
		tires = "";
	}
	
	public String getPaint()
	{
		return paint;
	}
	
	public String getEngine()
	{
		return engine;
	}
	public String getTires()
	{
		return tires;
	}
	
	public String getInterior()
	{
		return interior;
	}
}