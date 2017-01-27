import java.util.Scanner;

public class APLab_12pt5runner
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("first name: ");
		String inFN = kb.nextLine();
		System.out.println("last name: ");
		String inLN = kb.nextLine();
		System.out.println("avatar? (y/n)");
		String inA = kb.nextLine();
		
		if (inA.equals("y"))
		{
			System.out.println("avatar: ");
			String AAA = kb.nextLine();
			User avU = new User(inFN, inLN, inA);
			avU.setAvatar(AAA);
			System.out.println(avU);
		}
		if (inA.equals("n"))
		{
			User noU = new User(inFN, inLN);
			System.out.println(noU);
		}
	}
}