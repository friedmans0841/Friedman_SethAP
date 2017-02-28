public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStoreClass list = new ToyStoreClass("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		
		System.out.println(list);
		
		System.out.println("Most Freqeunt Toy: " + list.getMFToy());
		System.out.println("Most Frequent Type: " + list.getMFType());
	}
}