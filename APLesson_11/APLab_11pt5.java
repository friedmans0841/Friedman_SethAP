import java.util.Scanner;

public class APLab_11pt5
{
	static Scanner kb;
	static int bulletCount = 96;
	static int CLIPSIZE = 16;
	static int shotCount = 16;
	static String [] clip = new String [16];
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Reload!");
		while (bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: ");
			String action = kb.nextLine();
			
			if (action.equals("R"))
			{
				reload();
			}
			if (action.equals("S"))
			{
				System.out.println(shoot());
			}
			printClip();
		}
	}
	
	public static String shoot()
	{
		if (shotCount > 0)
		{
			clip[shotCount-1] = "[]";
			shotCount -= 1;
			System.out.println("\nBoom!");
		}
		else
		{
			System.out.println("\nReload!");
		}
		return "";
	}
	
	public static void resetClip()
	{
		for (int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static void reload()
	{
		if (bulletCount >= CLIPSIZE)
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for (int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
		
	}
	
	public static void printClip()
	{
		String output = "";
		output = "Bullets: \t" + bulletCount + "\nClip:\t";
		for (int i = 0; i < CLIPSIZE; i++)
		{
			output += clip[i];
		}
		System.out.println(output);
	}
}