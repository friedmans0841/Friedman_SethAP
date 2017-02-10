import java.util.Scanner;

public class APLab_12pt3driver
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		System.out.println("paint:");
		String inpaint = kb.nextLine();
		System.out.println("interior:");
		String ininterior = kb.nextLine();
		System.out.println("engine:");
		String inengine = kb.nextLine();
		System.out.println("tires:");
		String intires = kb.nextLine();
		
		Car obj = new Car(inpaint, ininterior, inengine, intires);
		System.out.println("Your vehicle is ready...");
		System.out.println("Paint:\t\t" + obj.getPaint());
		System.out.println("Interior:\t\t" + obj.getInterior());
		System.out.println("Engine:\t\t" + obj.getEngine());
		System.out.println("Tires:\t\t" + obj.getTires());
	}
}