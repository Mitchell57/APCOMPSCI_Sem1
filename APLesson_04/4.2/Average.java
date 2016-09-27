import java.util.Scanner;

public class Average {
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Num 1:");
		double num1 = kb.nextDouble();
		System.out.println("Num 2:");
		double num2 = kb.nextDouble();
		System.out.println("Num 3:");
		double num3 = kb.nextDouble();
		print(num1, num2, num3, average(num1, num2, num3));
	}
	
	public static double average(double num1, double num2, double num3){
		return (num1+num2+num3)/3;
	}
	
	public static void print(double num1, double num2, double num3, double ave){
		System.out.printf("The average of %f, %f, and %f is %f", num1, num2, num3, ave);
	}
	
}