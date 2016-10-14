import java.util.Scanner;
public class APLab_05pt4
{
	static int height
	static int weight
	static double BMI
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your height in inches:");
		height = kb.nextInt();
		System.out.println("Please enter your weight in pounds:");
		weight = kb.nextInt();
		calcBMI();
		calcCondish();
		print();
	}
	
	public static double calcBMI();
	{
		BMI = ((weight * 703) / height)
	}
	
	public static void calcCondish()
	{
		
	}
	
	public static void print()
	{
		System.out.printf("Your BMI is: %.2f", BMI)
		System.out.println("Your condition is" + condish)
	}
	
	
}