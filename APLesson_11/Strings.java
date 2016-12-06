import java.util.Scanner;

public class Strings {
	
	public static void main(String [] args){
		String[][] words = new String[4][4];
		Scanner kb = new Scanner(System.in);
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.println("Please enter a word: ");
				words[i][j] = kb.next();
			}
		}
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.print(words[i][j]+" ");
			}
			System.out.println();
		}
	}
}