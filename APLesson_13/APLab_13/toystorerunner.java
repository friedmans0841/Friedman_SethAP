public class toystorerunner
{
	public static void main(String[]args)
	{
		ToyStore list = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(list);
		System.out.println("Most Frequent Toy: " + list.getMostFreqToy());
		System.out.println("Most Frequent Type: " + list.getMostFreqType());
	}
	
}