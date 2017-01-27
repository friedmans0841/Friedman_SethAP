import java.util.Scanner;

public class APLab_09pt7
{
	static String Array = "";
	static Scanner kb;
	
	public static void main(String[]args)
	{
		String [] words = new String[5];

		fillArray(words);
		System.out.println("For the words... " + printArray(words));
		System.out.println(hasZs(words) + " ...contain(s) the letter z.");
	}
	
	public static void fillArray(String[] wordz)
	{
		kb = new Scanner(System.in);
		System.out.println("Please input five words:");
		for (int i = 0; i < wordz.length; i++)
		{
			wordz[i] = kb.next();
		}
	}
	
	public static String printArray(String[] WordWord)
	{
		for (String w: WordWord)
		{
			Array += w + " ";
		}
		return Array;
	}
	
	public static String hasZs(String[] worddd)
	{
		String zs = "";
		for (String wo: worddd)
		{
			if (wo.indexOf("z") >= 0)
			{
				zs += wo + " ";
			}
			else
			{
				zs += "";
			}
		}
		return zs;
	}
}