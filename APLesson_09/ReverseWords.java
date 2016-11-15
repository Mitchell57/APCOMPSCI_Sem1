import java.util.Scanner;

public class ReverseWords {
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		String[] words = new String[5];
		
		for(int i=0; i<words.length; i++){
			System.out.println("Enter Word "+(i+1)+": ");
			words[i] = kb.next();
		}
		
		System.out.println("In Order...");
		for(String word : words){
			System.out.println(word);
		}
		
		System.out.println("In Reverse...");
		for(String word : reverse(words)){
			System.out.println(word);
		}
		
	}
	
	public static String[] reverse(String[] words){
		String[] reverseWords = new String[5];
		int count = 0;
		for(int i=words.length-1; i>=0; i--){
			reverseWords[count] = words[i];
			count++;
		}
		return reverseWords;
	}
	
}