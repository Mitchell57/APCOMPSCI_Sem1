import java.util.Scanner;

public class Ex_02{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to the BMI Calculator");
		System.out.println("How tall are you? (in)");
		int height = kb.nextInt();
		System.out.println("How much do you weigh? (lbs)");
		int weight = kb.nextInt();
		int bmi = (weight / (height*height))*703;
		System.out.println("Your BMI is: "+bmi);
		
	}
}