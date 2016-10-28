import java.util.Scanner;
public class APLab_06pt5
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Please enter a int: ");
		int num = kb.nextInt();
		System.out.println("Please enter how much you want to go up by: ");
		int up = kb.nextInt();
		for(int i = 0; i <= num; i += up)
		{
			System.out.print(i + " ");
		}
	}
}