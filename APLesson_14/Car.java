public abstract class Car implements Location{
	int id;
	
	public Car(){
		id = makeID();
	}
	
	public int makeID(){
		return (int)(Math.random()*1000000 + 1);
	}
	
	public int getID(){
		return id;
	}
	
}