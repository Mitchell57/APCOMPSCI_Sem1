import java.util.Scanner;

public class GPACalc{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		String[] grades = new String[7];
		for(int i=0; i<7; i++){
			System.out.println("Grade "+(i+1)+":");
			grades[i] = kb.next().toUpperCase();
		}
		
		double sum = 0;
		
		for(int i=0; i<7; i++){
			sum += calcPoints(grades[i]);
		}
		
		System.out.printf("Your GPA is %1.2f", sum/7);
		
	}
	
	public static double calcPoints(String grade){
		if(grade.equals("A")) return 4;
		else if(grade.equals("B")) return 3;
		else if(grade.equals("C")) return 2;
		else if(grade.equals("D")) return 1;
		else return 0;
	}
}