import java.util.Scanner;

public class Circle {
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Radius:");
		double r = kb.nextDouble();
		print(r, calcArea(r));
	}
	
	public static double calcArea(double r){
		return r*r*Math.PI;
	}
	
	public static void print(double r, double area){
		System.out.printf("The area of a circle with a radius of %.5f is %.5f", r, area);
	}
	
}