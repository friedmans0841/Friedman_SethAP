import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ExpressionSolver
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("Please input an equation:");
		String expression = kb.nextLine();
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
	
		int i = 0;
		while (i < equation.size())
		{
			if ((equation.get(i).equals("*")) || (equation.get(i).equals("/")))
			{
				if (equation.get(i).equals("*"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1)) ) );
				}
				if (equation.get(i).equals("/"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1)) ) );
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			else
			{
			i++;	
			}
		}
		
		i = 0;
		while(i < equation.size())
		{
			if ((equation.get(i).equals("+")) || (equation.get(i).equals("-")))
			{
				if (equation.get(i).equals("+"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1)) ) );
				}
				if (equation.get(i).equals("-"))
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1)) ) );
				}
				equation.remove(i-1);
				equation.remove(i);
			}
			else
			{
			i++;	
			}
		}
		
		System.out.println(equation);
	}
}