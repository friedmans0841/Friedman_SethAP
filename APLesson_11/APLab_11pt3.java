public class APLab_11pt3
{
	public static void main(String[]args)
	{
		String [][] xando = new String [4][4];
				
		for (int i = 0; i < xando.length; i ++)
		{
			for (int j = 0; j < xando[i].length; j++)
			{
				int pick = 1 + (int)((Math.random()*2));
				if (pick == 1)
				{
					xando[i][j] = "x";
				}
				if (pick == 2)
				{
					xando[i][j] = "o";
				}
				System.out.print(xando[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}