import java.util.Scanner;

public class Loan {
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Interest Rate:");
		double rate = kb.nextDouble();
		System.out.println("Principal:");
		double p = kb.nextDouble();
		System.out.println("Compound Frequency:");
		double num = kb.nextDouble();
		System.out.println("Life of Loan:");
		double life = kb.nextDouble();
		System.out.printf("Your total monthly payment is $%4.2f", 
		calcMonthly(calcLoan(rate, p, num, life), life));
	}
	
	public static double calcLoan(double r, double p, double n, double t){
		return p*Math.pow((1+(r/n)), n*t);
	}
	public static double calcMonthly(double total, double t){
		return total/(t*12);
	}
}