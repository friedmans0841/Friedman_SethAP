import java.lang.Math;

public class APLab_12pt6
{
	private String manufacturer, name, category;
	private int price;
	private long UPC;
	
	public Inventory()
	{
		manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price = 0;
	}
	
	public Inventory(String man, String nam)
	{
		manufacturer = man;
		name = nam;
		category = "UNDEFINED";
		price = 0;
		UPC = Math.abs((long)(Math.random() * 10000000000L) + 1);
	}
	
	public Inventory(String man, String nam, String cat, int p)
	{
		manufacturer = man;
		name = nam;
		category = cat;
		price = p;
		UPC = Math.abs((long)(Math.random() * 10000000000L) + 1);
	}
	
	public String toString()
	{
		return "\nInventory Items..." +
							"\nItem Name: " + name +
							"\nManufacturer: " + manufacturer +
                            "\nCategory: " + category +
                            "\nUPC: " + UPC +
							"\nPrice: " + price;
	}
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	public String getName()
	{
		return name;
	}
	public String getCategory()
	{
		return category;
	}
	public long getUPC()
	{
		return UPC;
	}
	public int getPrice()
	{
		return price;
	}
}