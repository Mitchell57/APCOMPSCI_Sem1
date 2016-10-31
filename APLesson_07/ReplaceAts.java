import java.util.Scanner;

public class ReplaceAts{
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Sentence: ");
		String sentence = kb.nextLine();
		replace(sentence);
	}
	
	public static void replace(String sent){		
		//while(sent.contains("a")){
			sent = sent.replaceAll("a", "@");
		//}
		System.out.print(sent);
	}
}