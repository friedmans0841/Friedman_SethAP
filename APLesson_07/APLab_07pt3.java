import java.util.Scanner;
public class APLab_07pt3
{
	static int rev = 0;
	static Scanner kb;
	static int num;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");	
		int number = kb.nextInt();
		num = number;
		getReverse();
		System.out.println(number + " reversed is " + rev);
	}
	
	public static void getReverse()
	{
		while(num > 0)
		{
			rev *= 10;
			rev += num % 10;
			num /= 10;
		}
		
	}
}