import java.util.Scanner;

public class Table{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Integer: ");
		int integer = kb.nextInt();
		System.out.println("Size of Table: ");
		int size = kb.nextInt();
		System.out.printf("%5s | %6s\n", "Input", "Output");
		System.out.println("______|_______");
		for(int i=0; i<=size; i++){
			System.out.printf("%5d | %6d\n", i, i*integer);
		}
		
	}
	
}