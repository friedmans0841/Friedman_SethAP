/**
 * This is a class that tests the Card class.
 */
public class CardTester 
{

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card C1 = new Card("Nine", "Hearts", 9);
		Card C2 = new Card("King", "Diamonds", 13);
		Card C3 = new Card("Queen", "Spades", 12);
		
		System.out.println(C1);
		System.out.println(C2);
		System.out.println(C3);
	}
}