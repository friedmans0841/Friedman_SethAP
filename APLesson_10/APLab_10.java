import java.util.ArrayList;
import java.util.Arrays;

public class APLab_10
{	
	public static void main(String[]args)
	{
		Integer [] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(numbers));
		int numsSize = nums.size();
		System.out.println(removePrimes(nums));
	}
	
	public static int gFactor(int n)
	{
		for (int i = 2; i < n; i++)
		{
			if ((n % i) == 0)
			{
				return 1;
			}
		}
		return 0;
	}
	
	public static ArrayList<Integer> removePrimes(ArrayList<Integer> numz)
	{
		for (int i = 0; i < numz.size(); i++)
		{
			if (gFactor(numz.get(i)) == 0)
			{
				numz.remove(i);
				i = i - 1;
			}
		}
		return numz;
	}
}