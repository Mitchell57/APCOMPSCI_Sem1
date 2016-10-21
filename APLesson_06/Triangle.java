import java.util.Scanner;

public class Triangle{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("String: ");
		String in = kb.next();
		for(int i=in.length(); i>=0; i--){
			System.out.println(in.substring(0, i));
		}
	}
	
}