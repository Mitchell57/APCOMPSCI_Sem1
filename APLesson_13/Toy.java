public abstract class Toy{
	private String name;
	private int count;
	
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
	
	public void addCount(){
		count += 1;
	}
	
	abstract String getType();
	
	public String toString(){
		return name+" "+count;
	}
	
}