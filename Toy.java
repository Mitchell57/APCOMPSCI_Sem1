public abstract class Toy{
	String name;
	int count;
	
	public Toy(){
		count = 1;
		name = "null";
	}
	
	public Toy(String n){
		count = 1;
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public int getCount(){
		return count;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setCount(int n){
		count = n;
	}
	
	abstract String getType();
	
	public String toString(){
		return name+" "+count;
	}
	
}