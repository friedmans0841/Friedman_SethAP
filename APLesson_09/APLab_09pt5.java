public class APLab_09pt5
{
	static String numList = "";
	
	public static void main(String[]args)
	{
		int [] numbers = new int[10];
		fillArray(numbers);
		System.out.println("For the following numbers... " + printArray(numbers) + ".");
		System.out.println(getOdds(numbers) + " ...are all the odd numbers.");
	}
	
	public static void fillArray(int[] numz)
	{
		for (int i = 0; i < numz.length; i++)
		{
			numz[i] = (int)((Math.random()*101));
		}
	}
	
	public static String printArray(int[] numeros)
	{
		for (int n: numeros)
		{
			numList += n + " " ;
		} 
		return numList;
	}
	
	public static String getOdds(int[] numberz)
	{
		String odds = "";
		for (int nu: numberz)
		{
			if ((nu % 2) == 0)
			{
				odds += "";
			}
			else
			{
				odds += nu + " ";
			}
		}
		return odds;
	}
}