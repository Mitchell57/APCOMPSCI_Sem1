import static java.lang.Math.*;

public class MilesPerHour{
	private int dist, hours, minutes;
	private double speed;
	
	public MilesPerHour(){
		dist = 0;
		hours = 0;
		minutes = 0;
		speed = 0;
	}
	
	public MilesPerHour(int distance, int hrs, int min){
		dist = distance;
		hours = hrs;
		min = min;
		speed = 0;
	}
	
	public void setDist(int distance){
		dist = distance;
	}
	
	public void setHours(int hrs){
		hours = hrs;
	}
	
	public void setMinutes(int min){
		minutes = min;
	}
	
	public double getSpeed(){
		return Math.round(dist / (hours + minutes/60.0));
	}
}