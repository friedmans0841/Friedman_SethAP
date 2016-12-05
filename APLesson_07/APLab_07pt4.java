import java.util.Scanner;
public class APLab_07pt4
{
	static Scanner kb;
	static String sentence;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Please enter a sentence.");
		sentence = kb.nextLine();
		replace();
		System.out.println(sentence);
	}
	
	public static void replace()
	{
		while(sentence.indexOf("a") >= 0)
		{
			sentence = sentence.substring(0,sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a") + 1);
		}
	}
}