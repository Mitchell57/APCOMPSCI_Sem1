public class Toyota implements Location{
	double[] loc = {0, 0};
	
	public Toyota(String location){
		loc[0] = Double.parseDouble(location.substring(0,1));
		loc[1] = Double.parseDouble(location.substring(location.length()-1));
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