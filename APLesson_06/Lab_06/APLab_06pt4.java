import java.util.Scanner;
public class APLab_06pt4
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		
		kb = new Scanner(System.in);
		System.out.println("Please enter the size of the table 0-...: ");
		int size = kb.nextInt();
		System.out.println("Please enter input number");
		int input = kb.nextInt();
	

		for(int i = 0; i < size; ++i)
		{
			System.out.println(i + "\t|\t" + (input*i));
		}
		
	}
}
	