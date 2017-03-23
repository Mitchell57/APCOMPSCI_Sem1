public class Car implements Location{
	int id;
	double[] loc = {0, 0};
	
	public Car(){
		id = makeID();
	}
	
	public int makeID(){
		return (int)(Math.random()*1000000 + 1);
	}
	
	public int getID(){
		return id;
	}
	
	public void move(double x, double y){
		loc[0] += x;
		loc[1] += y;
	}
	
	public double[] getLoc(){
		return loc;
	}
	
}