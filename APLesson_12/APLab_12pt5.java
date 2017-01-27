import java.lang.Math;

public class APLab_12pt5
{
	private String firstName, lastName, avatar;
	private int UserID;
	
	public User(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "undefined";
		UserID = (int)(Math.random() * 1000000) + 1; 
	}
	
	public User()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		UserID = 0;
	}
	
	public User(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		UserID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void setAvatar(String a)
	{
		avatar = a;
	}
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName +
                           "\nLast Name: " + lastName +
                           "\nAvatar : " + avatar +
                           "\nUser ID# : " + UserID;
	}
	
	
	
	public String getAvatar()
	{
		return avatar;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public int getID()
	{
		return UserID;
	}
	public String getLastName()
	{
		return lastName;
	}
}