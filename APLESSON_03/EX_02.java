import java.util.Scanner;

public class EX_02 
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" this is a BMI calculator please enter you weight and height.");
		
		System.out.println("Enter weight in pounds: ");
		
		int num = keyboard.nextInt();
		
		System.out.println("Enter height in inches: ");
		
		int num1 = keyboard.nextInt();
		
		int bmi = ((num * 703)/(num1 * num1));
		
		System.out.println("Your BMI is: " + bmi);
		
		System.out.println("BMI VALUES");
        System.out.println("Underweight: Under 18.5");
        System.out.println("Normal: 18.5-24.9 ");
        System.out.println("Overweight: 25-29.9");
        System.out.println("Obese: 30 or over");
		
		
	}
}