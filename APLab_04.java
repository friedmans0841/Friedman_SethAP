import java.util.Scanner;

public class APLab_04
{
	public static void main(String[]args)
	{
		APLab_04 form = new APLab_04();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String word1 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double num1 = keyboard.nextDouble();
		
		
		System.out.println("Please enter item 2:");
		String blank1 = keyboard.nextLine();
		String word2 = keyboard.nextLine();
		System.out.println("Please enter price 2:");
		double num2 = keyboard.nextDouble();
		
		
		System.out.println("Please enter item 3:");
		String blank2 = keyboard.nextLine();
		String word3 = keyboard.nextLine();
		System.out.println("Please enter price 3:");
		double num3 = keyboard.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<<<_Receipt_>>>>>>>>>>>>>>>>>>>\t");
		
		form.format("* " + word1, num1);
		form.format("* " + word2, num2);
		form.format("* " + word3, num3);
		System.out.println(" ");
		System.out.println(" ");
		double sub = (num1 + num2 + num3);
		form.format("* " + " Subtotal: " + " ........ ", sub);
		double tax = (sub * .075);
		form.format("* " + " Tax: " + " ........ ", tax);
		double  total = (sub + tax);
		form.format("* " + " Total: " + " ........ ", total);
        System.out.println(" ");
		System.out.println("_________________________________________________");
		System.out.println("* Thank you for your support *");
		
		
		
		
		

		
		
	}
	
	public void format(String word, double num)
	{
		System.out.printf("\n%15s %15.2f", word, num);
	}
}