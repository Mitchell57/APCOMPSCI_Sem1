import java.util.Scanner;

public class Count{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number to count to: ");
		int max = kb.nextInt();
		System.out.println("Enter number to count by: ");
		int iterator = kb.nextInt();
		for(int i=iterator; i<=max; i+=iterator){
			System.out.printf(i+"\t");
		}
	}
	
}