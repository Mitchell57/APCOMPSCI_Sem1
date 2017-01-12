import java.util.Scanner;

public class HumanDriver{
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter hair: ");
		String h = kb.next();
		System.out.println("Enter eyes: ");
		String e = kb.next();
		System.out.println("Enter skin: ");
		String s = kb.next();
		
		Human example = new Human(h, e, s);
		
		System.out.println("Info:");
		System.out.printf("%7s : %8s\n", "Hair", example.getHair());
		System.out.printf("%7s : %8s\n", "Eyes", example.getEyes());
		System.out.printf("%7s : %8s\n", "Skin", example.getSkin());
		
		System.out.println("Enter hair: ");
		h = kb.next();
		System.out.println("Enter eyes: ");
		e = kb.next();
		System.out.println("Enter skin: ");
		s = kb.next();
		
		example.setHES(h, e, s);
		
		System.out.println("Info:");
		System.out.printf("%7s : %8s\n", "Hair", example.getHair());
		System.out.printf("%7s : %8s\n", "Eyes", example.getEyes());
		System.out.printf("%7s : %8s\n", "Skin", example.getSkin());
		
		
	}
}