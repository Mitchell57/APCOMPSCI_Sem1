public class GMC implements Location{
	double[] loc;
	public GMC(int x, int y){
		loc = new double[2];
		loc[0] = x;
		loc[1] = y;
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