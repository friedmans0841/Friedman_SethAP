import java.util.Scanner;
public class APLab_05pt3
{
	static String grade1;
	static String grade2;
	static String grade3;
	static String grade4;
	static String grade5;
	static String grade6;
	static String grade7;
	static double gpa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first grade:");
		grade1 = kb.next();
		System.out.println("Please enter your second grade:");
		grade2 = kb.next();
		System.out.println("Please enter your third grade:");
		grade3 = kb.next();
		System.out.println("Please enter your fourth grade:");
		grade4 = kb.next();
		System.out.println("Please enter your fifth grade:");
		grade5 = kb.next();
		System.out.println("Please enter your sixth grade:");
		grade6 = kb.next();
		System.out.println("Please enter your seventh grade:");
		String grade7 = kb.next();
		double gPoints = calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7);
		gpa = gPoints / 7;
		System.out.printf("Your gpa is: %.1f", gpa);
		
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		if (grade.equals("F"))
			return 0.0;
		return 0.0;
	}
}