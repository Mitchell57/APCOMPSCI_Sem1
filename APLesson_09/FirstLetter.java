import java.util.Scanner;

public class FirstLetter{
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		
		for(int i=0; i<words.length; i++){
			System.out.println("Enter Word "+(i+1)+": ");
			words[i] = kb.next();
		}
		
		first(words);
		
	}
	
	public static void first(String[] words){
		for(String word : words){
			if(word.length()>0){
				System.out.println(word.substring(0,1));
			}
		}
		
	}
}