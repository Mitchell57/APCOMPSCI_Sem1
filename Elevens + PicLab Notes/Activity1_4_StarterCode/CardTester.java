/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card ace  = new Card("Ace", "Clubs", 1);
		Card ace2  = new Card("Ten", "Hearts", 10);
		Card ace3  = new Card("King", "Spades", 10);
		
		System.out.println(ace.toString());
		System.out.println(ace2.toString());
		System.out.println(ace3.toString());
	}
}
