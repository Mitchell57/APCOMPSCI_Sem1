import java.util.Scanner;

public class InventoryRunner{
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Will you be entering category and price info? (y / n)");
		if(kb.next().equals("y")){
			System.out.println("Name: ");
			String name = kb.next();
			System.out.println("Manufacturer: ");
			String mfc = kb.next();
			System.out.println("Category: ");
			String category = kb.next();
			System.out.println("Price: ");
			int price = kb.nextInt();
			Inventory item = new Inventory(mfc, name, category, price);
			System.out.println(item.toString());
		}
		else{
			System.out.println("Name: ");
			String name = kb.next();
			System.out.println("Manufacturer: ");
			String mfc = kb.next();
			Inventory item = new Inventory(mfc, name);
			System.out.println(item.toString());
		}
	}
}