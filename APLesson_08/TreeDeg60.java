import java.util.Scanner;

public class TreeDeg60{
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Word: ");
		String word = kb.next();
		
		tree(word, 0, word.length());
	}
	
	public static void tree(String word, int start, int stop){
		String format = "%" + stop + "s\n";
		
		if(start <= stop){
			System.out.printf(format, word.substring(0, start));
			tree(word, start+1, stop);
		}
		
	}
}