import java.util.Scanner;

public class Ex_01{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = kb.next();
		System.out.println("Ummm... "+name+"? What did you do to deserve a name like that?");
		System.out.println("How old are you, "+name+"?");
		int age = kb.nextInt();
		System.out.println("Wow! You're "+age+"! Do you remember your childhood in black and white?");
		System.out.println("What do you do for fun, "+name+"?");
		String hobby = kb.next();
		System.out.println("You still "+hobby+"? I thought that was for babies.");
		System.out.println("What kind of music do you like?");
		String music = kb.next();
		System.out.println("I think my ears are bleeding just from the mention of "+music+".");
		System.out.println("How many siblings do you have?");
		int sibs = kb.nextInt();
		if(sibs==0){
			System.out.println("I guess your parents learned their lesson after you.");
		}
		else{
			System.out.println("How does it feel being number "+(sibs+1)+" in the family?");
		}
		System.out.println("What do you want to be when you grow up?");
		String career = kb.next();
		System.out.println("Well, "+name+", I don't think you've got the brain for "+career);
		
		System.out.println("So "+name+", you're "+age+"...");
		System.out.println("You like to "+hobby+" and listen to "+music+"...");
		System.out.println("Good luck becoming a "+career+"!");
	}
}