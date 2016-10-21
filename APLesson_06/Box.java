import java.util.Scanner;

public class Box{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Input: ");
		String in = kb.next();
		for(int i=0; i<in.length(); i++){
			System.out.println(in);
		}
	}
	
}