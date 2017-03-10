public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem objXBox = new XBox("XBox");
		GameSystem objPS = new PlayStation("PlayStation");
		GameSystem objPC = new PC("PC");
		
		System.out.println(objXBox);
		System.out.println();
		System.out.println(objPS);
		System.out.println();
		System.out.println(objPC);
		System.out.println();
	}
}