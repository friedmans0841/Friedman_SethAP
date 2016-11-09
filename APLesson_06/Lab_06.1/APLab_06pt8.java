public class APLab_06pt8
{	
	static String word = "Na";
	public static void main(String[]args)
	{
		sing();
		System.out.println(" ");
		sing();
		System.out.println(" ");
		System.out.println("Hey Hey Hey");
		System.out.println("Goodbye");
	}
	
	public static void sing()
	{
		for (int i = 1; i <= 4; i++)
		{
			System.out.print(word + " ");
			
		}
	}
	
}