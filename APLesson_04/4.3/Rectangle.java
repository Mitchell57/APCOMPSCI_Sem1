import java.util.Scanner;

public class Rectangle {
	static double length = 0;
	static double width = 0;
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Length:");
		length = kb.nextDouble();
		System.out.println("Width:");
		width = kb.nextDouble();
		print(calcPerim());
	}
	
	public static double calcPerim(){
		return length*2 + width*2;
	}
	
	public static void print(double p){
		System.out.printf("Your rectangle is %.5f ft around", p);
	}
	
}