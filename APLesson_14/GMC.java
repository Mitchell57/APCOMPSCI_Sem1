public class GMC extends Car{
	double[] loc;
	public GMC(int x, int y){
		loc = new double[2];
		loc[0] = x;
		loc[1] = y;
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