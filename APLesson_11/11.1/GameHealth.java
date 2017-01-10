import java.util.Scanner;

public class GameHealth{
	
	static int HEALTHLOAD = 6, healthCount;
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = HEALTHLOAD; 

		
		while(!turn.equals("Q") && healthCount>0){
			System.out.println("Your Turn! Hit Enter when ready: ");
			turn = kb.nextLine();
			damage = (int)(Math.random()*2)+1;
			amount = (int)(Math.random()*6)+1;
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		
		System.out.println("You Died!");
	}
	
	public static void printClip(){
		String output = "Health:	";
		for(int i=0; i<HEALTHLOAD; i++){
			if(i<healthCount) output += " @ ";
			else output += " [] ";
		}
		System.out.println(output);
	}
	
	public static String takeDamage(int dmg, int amt){
		if(dmg==1){
			healthCount -= amt;
			return "Taking "+amt+" damage!"; 
		}
		else if(healthCount+amt<HEALTHLOAD){
			healthCount += amt;
			return "Power Up "+amt+"!";
		}
		else{
			healthCount = HEALTHLOAD;
			return "Power Up "+amt+"!";
		}
	}
}