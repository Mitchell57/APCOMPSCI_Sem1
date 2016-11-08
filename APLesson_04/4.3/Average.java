import java.util.Scanner;

public class Average {
	static double num1 = 0;
	static double num2 = 0;
	static double num3 = 0;
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Num 1:");
		num1 = kb.nextDouble();
		System.out.println("Num 2:");
		num2 = kb.nextDouble();
		System.out.println("Num 3:");
		num3 = kb.nextDouble();
		print(num1, num2, num3, average());
	}
	
	public static double average(){
		return (num1+num2+num3)/3;
	}
	
	public static void print(double num1, double num2, double num3, double ave){
		System.out.printf("The average of %f, %f, and %f is %f", num1, num2, num3, ave);
	}
	
}