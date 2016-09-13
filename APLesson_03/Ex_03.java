import java.util.Scanner;

public class Ex_03{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Tip Calculator");
		System.out.println("How was your service? (1-10)");
		double quality = 0.025*kb.nextInt();
		System.out.println("How much was your bill?");
		double bill = kb.nextDouble();
		double tip = quality*bill;
		System.out.println("You should leave a $"+tip+" tip.");
	}
	
}