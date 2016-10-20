import java.util.Scanner;
public class APLab_05pt4
{
	static int height;
	static int weight;
	static double BMI;
	static String condish;
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
	
	public static double calcBMI()
	{
		return BMI = ((weight * 703) / (height * height));
	}
	
	
	public static void calcCondish()
	{
		if(BMI>39.9)
			condish = "Morbidly Obese";
		else if(BMI>35)
			condish = "Very Obese";
		else if(BMI>29.9)
			condish = "Obese";
		else if(BMI>25)
			condish = "Overweight";
		else if(BMI>18.5)
			condish = "Normal";
		if (BMI<18.5)
			condish = "Underweight";
	}
	
	public static void print()
	{
		System.out.printf("Your BMI is: %.2f\n", BMI);
		System.out.println("Your condition is " + condish);
	}
}