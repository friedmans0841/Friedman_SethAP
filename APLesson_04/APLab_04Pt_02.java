import java.util.Scanner;

public class APLab_04Pt_02
{
	public static void main(String[]args)
	{
		APLab_04Pt_02 form = new APLab_04Pt_02();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String word1 = keyboard.next();
		System.out.println("Enter your last name:");
		String wordd2 = keyboard.next();
		System.out.println("Enter your title:");
		String word3 = keyboard.next();
		System.out.println("Enter your school site:");
		String blank4 = keyboard.nextLine();
		String word4 = keyboard.nextLine();
		System.out.println("Enter your school year:");
		String wordd5 = keyboard.next();
		System.out.println("What is your subject?");
		String blank6 = keyboard.nextLine();
		String wordd6 = keyboard.nextLine();
		System.out.println("*************************************");
		form.format(word4, wordd5);
		form.format(word1, wordd2);
		form.format(word3, wordd6);
		System.out.println("*************************************");
		
	}
	
	public void format(String word, String wordd)
	{
		System.out.printf("*%15s \t%15s*\n", word, wordd);
	}
}