import java.util.Scanner;

public class Receipt {
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("How many items do you have?");
		int num = kb.nextInt();
		String[] items = new String[num];
		double[] prices = new double[num];
		for(int i=0; i<num; i++){
			items[i] = addItem(i+1);
			prices[i] = addPrice(i+1);
		}
		Receipt.printReceipt(items, prices, Receipt.calcTotals(prices));
	}
	public static void printReceipt(String[] items, double[] prices, double[] totals){
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		for(int i=0; i<items.length; i++){
			System.out.printf("* %18s ........    %3.2f\n", items[i], prices[i]);
		}
		System.out.printf("* %18s ........    %3.2f\n", "Subtotal", totals[0]);
		System.out.printf("* %18s ........    %3.2f\n", "Tax", totals[1]);
		System.out.printf("* %18s ........    %3.2f\n", "Total", totals[2]);
		System.out.println("__________________________________________\n");
		System.out.println("* Thank you for your support *");
	}
	public static String addItem(int n){
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item "+n+":");
		String item = kb.nextLine();
		return item;
	}
	public static double addPrice(int n){
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter price "+n+":");
		double price = kb.nextDouble();
		return price;
	}
	public static double[] calcTotals(double[] prices){
		double sum = 0;
		double[] totals = new double[3];
		for(int i=0; i<prices.length; i++){
			sum += prices[i];
		}
		totals[0] = sum;
		totals[1] = sum*.08;
		totals[2] = totals[0] + totals[1];
		return totals;
	}
}