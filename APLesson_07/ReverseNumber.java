import java.util.Scanner;

public class ReverseNumber{
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = kb.nextInt();
		System.out.println(number+" reversed is "+getReverse(number));
	}
	
	public static int getReverse(int number){
		int rev = 0;
		while(number>0){
			rev *= 10;
			rev += number%10;
			number /= 10;
		}
		return rev;
	}
	
}