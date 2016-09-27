import java.util.Scanner;

public class Rectangle {
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Length:");
		double length = kb.nextDouble();
		System.out.println("Width:");
		double width = kb.nextDouble();
		print(calcPerim(length, width));
	}
	
	public static double calcPerim(double l, double w){
		return l*2 + w*2;
	}
	
	public static void print(double p){
		System.out.printf("Your rectangle is %.5f ft around", p);
	}
	
}