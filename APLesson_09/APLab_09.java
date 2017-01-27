import java.util.Scanner;

public class APLab_09
{
	static String newWord = "";
	static Scanner kb;
	
	public static void main(String[]args)
	{
		String [] words = new String[5];
		kb = new Scanner(System.in);
		System.out.println("Please input five words:");
		int numero = words.length;
		
		
		for (int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.println("In Order:");
		
		for (String word : words)
		{
			System.out.println(word);
		}
		
		System.out.println("");
		
		System.out.println("Reversed:");
		
		reverse(words, numero);
	}
	
	public static String reverse(String[] w, int num)
	{	
		for (int i = num - 1; i >= 0; i --)
		{
			newWord = w[i];
			System.out.println(newWord);
		}
		return "";
	}
}