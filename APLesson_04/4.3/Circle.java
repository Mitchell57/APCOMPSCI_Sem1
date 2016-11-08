import java.util.Scanner;

public class Circle {
	static double r = 0;
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Radius:");
		r = kb.nextDouble();
		print(r, calcArea());
	}
	
	public static double calcArea(){
		return r*r*Math.PI;
	}
	
	public static void print(double r, double area){
		System.out.printf("The area of a circle with a radius of %.5f is %.5f", r, area);
	}
	
}