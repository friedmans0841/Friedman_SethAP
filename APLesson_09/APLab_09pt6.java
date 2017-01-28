public class APLab_09pt6
{
	static String Array = "";
	
	public static void main(String[]args)
	{
		int [] numbers = new int[10];
		fillArray(numbers);
		
		System.out.println("For the following numbers... " + printArray(numbers));
		System.out.println("The biggest number is... " + getBiggest(numbers));
	}
	
	public static void fillArray(int[] nums)
	{
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = (int)((Math.random()*101));
		}
	}
	
	public static String printArray(int[] numeros)
	{
		for (int n: numeros)
		{
			Array += n + " ";
		} 
		return Array;
	}
	
	public static int getBiggest(int[] numberz)
	{
		int max = 0;
		for (int nu: numberz)
		{
			if (nu > max)
			{
				max = nu;
			}
			else
			{
				max = max;
			}
		}
		return max;
	}
}