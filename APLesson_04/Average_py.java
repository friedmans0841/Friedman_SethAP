import java.util.Scanner;
public class Average_py
{
	static double num1;
	static double num2;
	static double num3;
	static double ave;
	
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter value one:");
		num1 = kb.nextInt();
		System.out.println("Enter value two:");
		num2 = kb.nextInt();
		System.out.println("enter value three:");
		num3 = kb.nextInt();
		ave(num1,num2,num3);
		print();
		
		
		
	}
	public static void ave(double num1, double num2, double num3)
	{
		ave = (num1 + num2 + num3)/3;
	}
	public static void print()
	{
		System.out.println("The average of " + num1 + " , " + num2 + " , and " + num3 + " is " + ave);
	}
}