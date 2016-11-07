import java.util.Scanner;
public class APLab_06pt2
{
	static Scanner kb;
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Please enter a int: ");
		int num = kb.nextInt();
		System.out.println(calcNum(num));
	}
	
	public static int calcNum(int num)
	{
		int fac = 1;
		for (int i = 1; i <=num; i++)
		{
			fac = fac * i;
		}
		return fac;
	}
}