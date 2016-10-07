import java.util.Scanner;

public class Ex_02{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the BMI Calculator");
		System.out.println("How tall are you? (in)");
		double height = kb.nextInt();
		System.out.println("How much do you weigh? (lbs)");
		double weight = kb.nextInt();
		double bmi = (weight / (height*height))*703;
		System.out.printf("Your BMI is: %3.0f", bmi);
		
	}
}