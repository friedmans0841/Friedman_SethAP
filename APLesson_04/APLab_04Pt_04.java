import java.util.Scanner;

public class APLab_04Pt_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		APLab_04Pt_04 cubic = new APLab_04Pt_04();
		System.out.println("Please enter height:");
		double height = keyboard.nextDouble();
		System.out.println("Please enter legnth:");
		double legnth = keyboard.nextDouble();
		System.out.println("Please enter width:");
		double width = keyboard.nextDouble();
		double cubein = cubic.calcVol(legnth, width, height);
		System.out.printf("your volume in cubic feet %.2f", cubein);
		
		
	}
	
	public double calcVol(double h, double l, double w)
	{
		return ((l * w * h)/1728);
	}
}