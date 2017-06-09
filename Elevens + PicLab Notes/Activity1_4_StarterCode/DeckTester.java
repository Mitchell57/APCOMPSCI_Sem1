/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Spades", "Diamonds", "Hearts", "Diamonds"};
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		Deck d = new Deck(ranks, suits, values);
		System.out.println("Size = "+d.size());
		System.out.println(d.toString());
		d.shuffle();
		System.out.println(d.toString());
	}
}
