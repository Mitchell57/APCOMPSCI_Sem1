import java.util.Scanner;

public class CarDriver{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter Paint: ");
		String p = kb.nextLine();
		System.out.println("Enter Interior: ");
		String i = kb.nextLine();
		System.out.println("Enter Engine: ");
		String e = kb.nextLine();
		System.out.println("Enter Tires: ");
		String t = kb.nextLine();
		
		Car coche = new Car(p, i, e, t);
		System.out.println("Your vehicle is ready......");
		System.out.printf("%10s : %15s\n", "Paint", coche.getPaint());
		System.out.printf("%10s : %15s\n", "Interior", coche.getInterior());
		System.out.printf("%10s : %15s\n", "Engine", coche.getEngine());
		System.out.printf("%10s : %15s\n", "Tires", coche.getTires());
		
	}
	
	
}