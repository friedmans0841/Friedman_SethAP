import java.util.Scanner;
public class APLab_05pt6
{
	static Scanner kb;
	static String passCheck;
	static String pass;
	static String user;
	
	
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
		
	}
	
	public static void passCheck()
	{
		System.out.println("Please enter your username:");
		user = kb.nextLine();
		System.out.println("Please enter your password:");
		pass = kb.nextLine();
		
		if(user.equals("seth") && pass.equals("friedman"))
		{
			System.out.println("You are granted access!");
		}
		else 
		{
			if(user!=("seth") && pass.equals("friedman"))
			{
				System.out.println("Your username is incorrect!");
			}
			else if(user.equals("seth") && pass!=("friedman"))
			{
				System.out.println("Your password is incorrect!");
			}
			else if(user!=("seth") && pass!=("friedman"))
			{
				System.out.println("Your username and password are incorrect!");
			}
			passCheck();
		}
		
	}
}