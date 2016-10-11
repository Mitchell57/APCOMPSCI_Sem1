import java.util.Scanner;

public class Receipt2 {
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Item 1: ");
		String item1 = kb.nextLine();
		System.out.println("Item 1 price: ");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Item 2: ");
		String item2 = kb.nextLine();
		System.out.println("Item 2 price: ");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Item 3: ");
		String item3 = kb.nextLine();
		System.out.println("Item 3 price: ");
		double price3 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Item 4: ");
		String item4 = kb.nextLine();
		System.out.println("Item 4 price: ");
		double price4 = kb.nextDouble();
		kb.nextLine();
		
		double subtotal = price1+price2+price3+price4;
		double discount = discount(subtotal)*subtotal;
		double tax = (subtotal-discount)*.08;
		double total = (subtotal-discount)+tax;
		
		format(item1, price1, item2, price2, item3, price3, item4, price4, subtotal, discount, tax, total);
	}
	
	public static double discount(double total){
		if(total>=2000) return 0.15;
		return 0;
	}
	
	public static void format(String item1, double price1, String item2, double price2, 
	String item3, double price3, String item4, double price4, double subtotal, double discount, double tax, double total){
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		
		System.out.printf("*\n* %18s ........    %3.2f\n", item1, price1);
		System.out.printf("*\n* %18s ........    %3.2f\n", item2, price2);
		System.out.printf("*\n* %18s ........    %3.2f\n", item3, price3);
		System.out.printf("*\n* %18s ........    %3.2f\n", item4, price4);
		
		System.out.printf("*\n* %18s ........    %3.2f\n", "Subtotal", subtotal);
		System.out.printf("*\n* %18s ........    %3.2f\n", "Discount", discount);
		System.out.printf("* %18s ........    %3.2f\n", "Tax", tax);
		System.out.printf("* %18s ........    %3.2f\n", "Total", total);
		System.out.println("__________________________________________\n");
		System.out.println("* Thank you for your support *");
	}

}