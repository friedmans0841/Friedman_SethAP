import java.util.Scanner;
public class APLab_06
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String word = kb.nextLine();
		int num = word.length();
		for(int i = 1; i <= num; i++)
		{
			System.out.println(word);
		}
	}
}