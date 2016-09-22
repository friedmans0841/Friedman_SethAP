import java.util.Scanner; 

public class APLab_04Pt_03
{
	public static void main(String[]args)
	{
		APLab_04Pt_03 intrest = new APLab_04Pt_03();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Intrest rate in decimal form:");
		double r = keyboard.nextDouble();
		System.out.println("Principle:");
		int p = keyboard.nextInt();
		System.out.println("Number of times the loan is compounded per year:");
		int n = keyboard.nextInt();
		System.out.println("life of the loan (in years):");
		int t = keyboard.nextInt();
		double loan = intrest.rate(r, p, n, t);
		System.out.println("Your total monthly payment is $", loan);
		
	}
	
	public double rate(double r, int p, int n, int t)
	{
		return (number3 * number4);
		double number1 = (1+(r / n));
		double number2 = (n * t);
		double number3 = (p);
		double number4 = Math.pow(number1, number2);
	}
}