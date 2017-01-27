
import java.util.Scanner;

public class APLab_11pt2
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		String [][] words = new String[4][4];
		
		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words[i].length; j++)
			{
				System.out.println("Please enter a word:");
				words[i][j] = kb.nextLine();
			}
		}
		
		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words[i].length; j++)
			{
				System.out.print(words[i][j] + "\t\t");
			}
			System.out.println("");
		}
	}
}