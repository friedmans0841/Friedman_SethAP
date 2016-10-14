import java.util.Random;
public class APLab_05
{
	static int player;
	static int comp;
	static String winner;
	
	public static void main(String[]args)
	{
		Random rand = new Random();
		player = rand.nextInt(6) + 1;
		comp = rand.nextInt(6) + 1;
		System.out.println("You rolled a " + player);
		System.out.println("The computer rolled a " + comp);
		diceRoll();
		System.out.println("And the winner is " + winner);
	}
	
	public static void diceRoll()
	{
		boolean win = player > comp;
		
		if(player == comp)
		{
			winner = "no one! its a tie!";
		}
		
		if (win)
		{
			winner = "you";
		}
		
		if (!win)
		{
			winner = "computer";
		}
		
	}
} 