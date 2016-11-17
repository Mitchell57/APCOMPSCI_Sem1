import java.util.Scanner;

public class FindTheZs{
	
	static String[] words = new String[5];
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		for(int i=0; i<words.length; i++){
			System.out.println("Word "+i+": ");
			words[i] = kb.next();
		}
		
		System.out.println("Words: ");
		printArray(words);
		
		System.out.println("Words with Zs: ");
		printArray(hasZs());
	}
	
	public static void printArray(String [] words){
		for(String word : words){
			System.out.print(word+" ");	
		}
		System.out.println();
	}
	
	public static String[] hasZs(){
		String[] zInit = new String[5];
		int count = 0; 
		
		for(String word : words){
			if(word.contains("z")){
				zInit[count] = word;
				count ++;
			}
		}
		
		String[] zReturn = new String[count];
		for(int i=0; i<count; i++){
			zReturn[i] = zInit[i];
		}
		
		return zReturn;
		
	}
	
}