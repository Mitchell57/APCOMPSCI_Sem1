import java.util.Scanner;

public class Underscores{
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Sentence: ");
		String sentence = kb.nextLine();
		System.out.println(replace(sentence));
	}
	
	public static String replace(String s){
		int space = s.indexOf(" ");
		//System.out.println(space);
		if(space < 0){
			//System.out.println("got in");
			return s;
		}
		else{
			//System.out.println(s.substring(0, space)+"_"+s.substring(space+1));
			return replace(s.substring(0, space)+"_"+s.substring(space+1));
		}
	}
}