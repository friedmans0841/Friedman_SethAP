public class APLab_12pt4
{
	private String hair, eyes, skin;
	
	public Human(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public Human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public void setAttributes(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	public String getSkin()
	{
		return skin;
	}
	public String getHair()
	{
		return hair;
	}
}