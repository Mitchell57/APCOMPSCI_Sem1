import java.util.Scanner;

public class UserRunner{
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("First Name: ");
		String first = kb.next();
		System.out.println("Last Name: ");
		String last = kb.next();
		
		System.out.println("Would you like an avatar? (y / n)");
		if(kb.next().equals("y")){
			System.out.println("Avatar: ");
			String avatar = kb.next();
			User me = new User(first, last, avatar);
			System.out.println(me.toString());
		}
		else{
			User me = new User(first, last);
			System.out.println(me.toString());
		}
		
		
	}
}