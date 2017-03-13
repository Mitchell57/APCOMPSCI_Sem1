public class Honda extends Car{
	double[] loc = {0, 0};
	
	public Honda(double[] location){
		loc[0] = location[0];
		loc[1] = location[1];
	}
	
	public int getID(){
		return super.getID();
	}
	
	public void move(int x, int y){
		loc[0] += x;
		loc[1] += y;
	}
	
	public double[] getLoc(){
		return loc;
	}
}