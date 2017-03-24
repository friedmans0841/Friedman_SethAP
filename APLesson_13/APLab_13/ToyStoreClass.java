import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ToyStoreClass
{ 
	ArrayList<toyclass> TList = new ArrayList<toyclass>();
	
	public ToyStoreClass()
	{
		TList = new ArrayList<toyclass>();
	}
	
	public ToyStoreClass(String t)
	{
		loadToys(t);
	}
	
	public void loadToys(String ts)
	{
		TList = new ArrayList<toyclass>();
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i+=2)	
		{
			String name = toys.get(i);
			String type = toys.get(i+1); 
			toyclass t = getToy(name);
			
			if (t == null)	
			{
				if(type.equals("Car"))
				{
					TList.add(new carclass(name));
				}
				
				else
				{
					TList.add(new Afigureclass(name));
				}
			}
			
			else
			{
				t.setCount(t.getCount()+1);
			}

		}
	}
	
	public toyclass getToy(String TJ)
	{
		for(toyclass x : TList)	
		{
			if(x.getName().equals(TJ))
			{
				return x;
			}
		}
		return null;
	}
	
	public String getMFToy()
	{
		String name = "";
		double max = Integer.MIN_VALUE;
		for(toyclass x: TList)	
		{
			if(max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}
		}
		return name;
	}
	
	public String getMFType()
	{
		int cars = 0;
		int figures = 0;
		for(toyclass x:TList)	
		{
			if(x.getType().equals("Car"))
				cars++;
			if(x.getType().equals("ActionFigure"))
				figures++;
		}
		
		if(cars > figures)
			return "Toy Cars.";
		
		else if(figures > cars)
			return "Action Figures.";
		
		else
			return "Same amount of both action figures and toy cars.";
		
	}
	
	public String toString()
	{
		return "" + TList;
	}	
}