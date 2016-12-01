import java.util.Scanner;
public class APLab_07
{
	static Scanner kb;
	static int num;
	static int sum = 0;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = kb.nextInt();
		num = number;
		sumDigits();
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	
	public static void sumDigits()
	{
		while(num > 0)
		{
			sum += num%10;
			num /= 10;
		}
	}
}