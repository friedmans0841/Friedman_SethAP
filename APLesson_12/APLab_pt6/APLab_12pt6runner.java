import java.util.Scanner;

public class APLab_12pt6runner
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("item name: ");
		String in = kb.nextLine();
		System.out.println("manufacturer: ");
		String m = kb.nextLine();
		
		System.out.println("will you be entering item category & price? (y/n)");
		String response = kb.nextLine();
		
		if (response.equals("y"))
		{
			System.out.println("category: ");
			String c = kb.nextLine();
			System.out.println("item price: ");
			int p = kb.nextInt();
			
			Inventory yre = new Inventory(m, in, c, p);
			System.out.println(yre);
		}
		if (response.equals("n"))
		{
			Inventory nre = new Inventory(m, in);
			System.out.println(nre);
		}
	}
}
