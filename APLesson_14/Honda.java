public class Honda implements Location{
	double[] loc = {0, 0};
	
	public Honda(double[] location){
		loc[0] = location[0];
		loc[1] = location[1];
	}
	
	public int getID(){
		return (int)(Math.random()*1000000 + 1);
	}
	
	public void move(int x, int y){
		loc[0] += x;
		loc[1] += y;
	}
	
	public double[] getLoc(){
		return loc;
	}
}