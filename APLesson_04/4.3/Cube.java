import java.util.Scanner;

public class Cube {
	
	static double side = 0;
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Side:");
		side = kb.nextDouble();
		print(side, calcSurf());
	}
	
	public static double calcSurf(){
		return side*side*6;
	}
	
	public static void print(double side, double surf){
		System.out.printf("The surface area of a cube with %.5f\" is %.5f", side, surf);
	}
	
}