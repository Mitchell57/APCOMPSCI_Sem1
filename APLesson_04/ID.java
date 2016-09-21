import java.util.Scanner;

public class ID {
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String first = kb.nextLine();
		System.out.println("Enter your last name:");
		String last = kb.nextLine();
		System.out.println("Enter your title:");
		String title = kb.nextLine();
		System.out.println("Enter your school:");
		String school = kb.nextLine();
		System.out.println("Enter the school year;");
		String year = kb.nextLine();
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		System.out.println("***********************************");
		ID.printLine(school, year);
		ID.printLine(first, last);
		ID.printLine(title, subject);
		System.out.println("***********************************");
	}
	
	public static void printLine(String a, String b){
		System.out.printf("*%15s  %15s*\n", a, b);
	}
}