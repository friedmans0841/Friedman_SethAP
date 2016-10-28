import java.util.Scanner;
public class APLab_06pt7
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = kb.next();
		
		for(int i = word.length(); i >= 1; i--)
		{
			System.out.println(word.substring(i));
		}
	}
}