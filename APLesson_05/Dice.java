import java.util.Random;

public class Dice{
	public static void main(String [] args){
		Random rand = new Random();
		int ai = rand.nextInt(5)+1;
		int p1 = rand.nextInt(5)+1;
		rollDice(ai, p1);
	}
	
	public static void rollDice(int ai, int p1){
		System.out.println("Your roll is "+p1);
		System.out.println("The computer's roll is "+ai);
		if(ai>p1) System.out.println("Computer Wins!");
		else System.out.println("You Win!");
	}
	
}