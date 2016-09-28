import java.util.Scanner; 

public class APLab_04Pt_03
{
	public static void main(String[]args)
	{
		APLab_04Pt_03 intrest = new APLab_04Pt_03();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Intrest rate in decimal form:");
		double rate = keyboard.nextDouble();
		System.out.println("Principle:");
		double princpl = keyboard.nextDouble();
		System.out.println("Number of times the loan is compounded per year:");
		double number = keyboard.nextDouble();
		System.out.println("life of the loan (in years):");
		double time = keyboard.nextDouble();
		double loan = intrest.irate(rate, princpl, number, time);
		System.out.printf("Your total monthly payment is %.2f", loan);
		
	}
	
	public double irate(double r, double p, double n, double t)
	{
		return (p*(Math.pow(1+r/n, n * t)))/(t*12); 
	}
}