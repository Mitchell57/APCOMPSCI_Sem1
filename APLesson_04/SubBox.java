import java.util.Scanner;

public class SubBox {
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Height:");
		double h = kb.nextDouble();
		System.out.println("Length:");
		double l = kb.nextDouble();
		System.out.println("Width:");
		double w = kb.nextDouble();
		System.out.printf("Your total available volume is %3.2f cubic feet", calcVol(h, l, w));
	}
	
	public static double calcVol(double h, double l, double w){
		return (h*l*w)/1728;
	}
}