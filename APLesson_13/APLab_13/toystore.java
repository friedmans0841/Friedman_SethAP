import java.util.Arraylist;
import java.util.Arrays;
import java.util.Scanner;

public class toystore
{
	ArrayList<Toy> toyList;
	
	public void ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	
	public void ToyStore(String t)
	{
		loadToys(t);
	}
	
	public void loadToys(String ts)
	{
		toyList = new ArrayList<Toy>();
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(",")));
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			Toy t = getToy(name);
		}
		
		if (t == null)
		{
			if(type.equals("cars"))
			{
				toyList.add(new Car(name));
			}
			else
			{
				toyList.add(new AFigure(name));
			}
			
		}
		else
		{
			t.setCount(t.getCount()+1);
		}
	}
	public toy getThatToy(String nm)
	{
		for(Toy x : toyList)
		{
			if(x.getName().equals(nm))
			{
				return x;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		double max = Integer.MIN_VALUE;
		for(Toy x: toyList)
		{
			if(max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy x: toyList)
		{
			if(x.getType().equals("Car"))
				cars++;
			if(x.getType().equals("AF"))
				figures++;
		}
		if(cars > figures)
			return "Cars";
		else if(figures > cars)
			return "Action figures";
		else
			return "Equal amounts of actionfigures and cars.";
	}
	
	public String toString()
	{
		return toyList.toString();
	}
		
}