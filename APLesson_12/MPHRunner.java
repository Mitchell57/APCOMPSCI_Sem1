import java.util.Scanner;

public class MPHRunner{
	
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		
		//Round 1
		System.out.println("Distance: ");
		int dist = kb.nextInt();
		System.out.println("Hours: ");
		int hours = kb.nextInt();
		System.out.println("Minutes: ");
		int minutes = kb.nextInt();
		
		MilesPerHour mph = new MilesPerHour(dist, hours, minutes);
		
		printSpeed(dist, hours, minutes, mph.getSpeed());
		
		//Round 2
		System.out.println("Distance: ");
		dist = kb.nextInt();
		System.out.println("Hours: ");
		hours = kb.nextInt();
		System.out.println("Minutes: ");
		minutes = kb.nextInt();
		
		mph.setDist(dist);
		mph.setHours(hours);
		mph.setMinutes(minutes);
		
		printSpeed(dist, hours, minutes, mph.getSpeed());
	}
	
	public static void printSpeed(int dist, int hours, int minutes, double speed){
		if(minutes == 0){
			if(hours == 0){
				System.out.println("No time...");
			}
			else{
				System.out.println(dist+" miles in "+hours+" hours = "+speed+" mph");
			}
		}
		else{
			if(hours==0){
				System.out.println(dist+" miles in "+minutes+" minutes = "+speed+" mph");
			}
			else{
				System.out.println(dist+" miles in "+hours+" hours and "+minutes+" minutes = "+speed+" mph");
			}
			
		}
	}
}