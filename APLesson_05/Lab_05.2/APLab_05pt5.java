import java.util.Scanner;
public class APLab_05pt5
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Let's start an adventure where you are the star.");
		System.out.println("You are a knight set out to slay a dragon thats causing terror in your kingdom.");
		System.out.println("Would you like to play?");
		String play = kb.nextLine();
		if(play.equals("Y") || play.equals("yes") || play.equals("Yes"))
		{	
			System.out.println("Sweet!! Lets play!!");
			adven();
		}
		else 
		{
			System.out.println("Thats to bad. I'll be here when you are ready to play.");
		}
	}
	
	public static void adven()
	{
		System.out.println("Your king tells you there is a dragon that you need to kill to free the kingdom.");
		System.out.println("What weapon are you going to take with you to the cave? Bow & Arrow or Spear?");
		String weapon = kb.nextLine();
		if(weapon.equals("Bow & arrow") || weapon.equals("bow"))
		{
			System.out.println("You took the bow & arrow which means you need to keep your distance from the dragon.");
			System.out.println("You arive at the cave and feel your heart pounding of excitement and fear. You enter the cave and see the dragon!");
			System.out.println("Do you want to \n1. attack while he is alseep from afar.\n2. Sneak up and stab his head with your dagger. ");
			int attack = kb.nextInt();
			if(attack == 1)
			{
				System.out.println("You shoot aiming at his heart but miss.");
				System.out.println("The dragon wakes in a furious rage.");
				System.out.println("Do you\n1. Fire while moving but with less accuracy\n2. Fire while standing still and have more accurcy.");
				int fire = kb.nextInt();
				if(fire == 1)
				{
					System.out.println("You got lucky and hit him directly in the heart.");
					win();
				}
				else
				{
					System.out.println("Direct impact!");
					win();
				}
			}
			else
			{
				System.out.println("As you are sneaking up you step on a twig and wake the dragon up.");
				System.out.println("You are now to close to attack with the bow but to far to stab him with your daggar.");
				System.out.println("Game over! You lose!");
			}
		}
		else
		{
			System.out.println("You took the spear which means you will be fighting close to the dragon.");
			System.out.println("Do you\n1.Throw the spear at him\n2.Sneak up while he is sleeping and stab him with your spear");
			int sneak = kb.nextInt();
			if(sneak == 1)
			{
				System.out.println("You throw the spear at him and miss!");
				System.out.println("luckly the miss does not wake him so you run up grab the spear and stab him.");
				win();
			}
			else
			{
				System.out.println("You sucessfully snuck up on him and stabed him.");
				win();
			}
		}
	}
	
	public static void win()
	{
		System.out.println("Game over! You killed the dragon! You win!");
	}
	
	
}