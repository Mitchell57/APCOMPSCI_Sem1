import java.util.Scanner;

public class DigitAdder{
	static int sum = 0;
	static int number, num;
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Number:");
		number = kb.nextInt();
		num = number;
		System.out.println("The sum of the digits in "+number+" is "+sumDigits());
	}
	
	public static int sumDigits(){
		while(num>0){
			sum+= num%10;
			num = num/10;
		}
		return sum;
	}
}