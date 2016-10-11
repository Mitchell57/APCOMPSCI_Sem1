import java.util.Scanner;

public class BMI2 {
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Height (in): ");
		double h = kb.nextDouble();
		System.out.println("Weight (lbs): ");
		double w = kb.nextDouble();
		double bmi = (w / (h*h))*703;
		String condition = calcBMI(bmi);
		System.out.printf("Your BMI is: %2.1f", bmi);
		System.out.println("\nYou are "+condition);
	}
	
	public static String calcBMI(double bmi){
		if(bmi<18.5) return "Underweight";
		else if(bmi<24.9) return "Normal";
		else if(bmi<29.9) return "Oveweight";
		else if(bmi<34.9) return "Obese";
		else if(bmi<39.9) return "Very Obese";
		else return "Morbidly Obese";
	}
	
}