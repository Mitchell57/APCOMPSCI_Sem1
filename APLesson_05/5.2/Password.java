import java.util.Scanner;

public class Password{
	public static void main(String [] args){
		String user = "GenericUsername123";
		String pass = "password";
		
		passCheck(user, pass);
	}
	
	private static void passCheck(String user, String pass){
		Scanner kb = new Scanner(System.in);
		System.out.println("Username: ");
		String uInput = kb.next();
		System.out.println("Password: ");
		String pInput = kb.next();
		if(uInput.equals(user) && pInput.equals(pass)){
			System.out.println("You are granted access!");
		}
		else if(uInput.equals(user)){
			System.out.println("Your password is incorrect!");
			passCheck(user, pass);
		}
		else if(pInput.equals(pass)){
			System.out.println("Your username is incorrect!");
			passCheck(user, pass);
		}
		else{
			System.out.println("Your username & password are incorrect!");
			passCheck(user, pass);
		}
	}
}