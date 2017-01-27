import java.util.Scanner;

	public class APLab_11pt6
{
	static Scanner kb;
	static String [] health = new String[6];
	static int HEALTHLOAD = 6;
	static int healthCount = 6;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		
		while (!turn.equals("Q") && healthCount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = kb.nextLine();
			damage = 1 + (int)((Math.random()*6));
			amount = 1 + (int)((Math.random()*6));
			takeDamage(damage, amount);
			printClip();
		}
		System.out.println("You died!");
	}
	
	public static void printClip()
	{
		String output = "Health: \t";
		for (int i = 0; i < HEALTHLOAD; i++)
		{
			if (i < healthCount)
			{
				health[i] = "@";
			}
			else
			{
				health[i] = "[]";
			}
			output += health[i];
		}
		System.out.println(output);
	}
	
	public static String takeDamage(int dmg, int amt)
	{
		if (dmg == 1)
		{
			healthCount -= amt;
			System.out.println("Taking " + amt + " damage!");
		}
		else
		{
			if (healthCount + dmg < HEALTHLOAD)
			{
				healthCount += HEALTHLOAD;
			}
			else
			{
				healthCount = HEALTHLOAD;	
			}
		}
		return ("Power Up" + amt + "!");
	}
}