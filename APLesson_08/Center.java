import java.util.Scanner;

public class Center{
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter word 1: ");
		String word1 = kb.next();
		
		System.out.println("Enter word 2: ");
		String word2 = kb.next();
		
		System.out.println("Enter word 3: ");
		String word3 = kb.next();
		
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	}
	
	public static String makeCenter(String s){
		if(s.length() >= 20){
			return s;
		}
		
		else{
			return makeCenter(" "+s+" ");
		}
		
	}
}