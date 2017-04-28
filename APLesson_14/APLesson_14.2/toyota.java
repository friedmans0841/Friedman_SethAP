import java.util.ArrayList;
import java.util.Arrays;

public class toyota extends car
{	
	public toyota(String inp)
	{
		ArrayList<String> coorz = new ArrayList<>(Arrays.asList(inp.split(", ")));
		location[0] = Double.parseDouble(corz.get(0));
		location[1] = Double.parseDouble(corz.get(1));
	}
}