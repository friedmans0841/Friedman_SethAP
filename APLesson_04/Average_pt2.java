import java.util.Scanner;
public class Average_pt2
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter value one:");
		double num1 = kb.nextInt();
		System.out.println("Enter value two:");
		double num2 = kb.nextInt();
		System.out.println("enter value three:");
		double num3 = kb.nextInt();
		
		double average = ave(num1,num2,num3);
		
		print(num1, num2, num3, average);
		
	}
	public static double ave(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3;
	}
	public static void print(double one, double two, double three, double avg)
	{
		System.out.printf("The average of " + one + " , " + two + " , and " + three + " is %.5f", avg);
	}
}