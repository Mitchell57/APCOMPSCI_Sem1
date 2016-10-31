import java.util.Scanner;

public class AverageDigits{
	static int digits = 0;
	static int average = 0;
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = kb.nextInt();
		System.out.println("The average of the digits in "+number+" is "+avDigits(number));
	}
	
	public static int avDigits(int number){
		int num = number;
		while(num>0){
			digits += 1;
			average += num%10;
			num = num/10;
		}
		return average/digits;
	}
}