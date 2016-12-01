import java.util.Scanner;
public class APLab_07pt2
{
	static Scanner kb;
	static int digits = 0;
	static int average = 0;
	static int num;
	static int ave;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = kb.nextInt();
		num = number;
		ave = average;
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + average);
	}
	
	public static void avDigits()
	{
		while(num > 0)
		{
			digits += 1;
			ave += num%10;
			num /= 10;
		}
		average = (ave / digits);
	}
}