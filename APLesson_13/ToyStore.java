import java.util.ArrayList;

public class ToyStore{
	private ArrayList<Toy> toyList;
	
	public ToyStore(){
		loadToys("none");
	}
	
	public ToyStore(String n){
		loadToys(n);
	}
	
	private void loadToys(String ts){
		toyList = new ArrayList<Toy>();
		String[] toys = ts.split(", ");
		for(int i=0; i<toys.length; i+=2){
			String name = toys[i];
			String type = toys[i+1];
			if(getThatToy(name) == null){
				if(type.equals("Car")) toyList.add(new Car(name));
				else if(type.equals("AF")) toyList.add(new AFigure(name));
			}
			else{
				getThatToy(name).addCount();
			}
		}
		
	}
	
	public Toy getThatToy(String nm){
		if(toyList.size()>0){
			for(int i=0; i<toyList.size(); i++){
				Toy t = toyList.get(i);
				if(t.getName().equals(nm)){
					return t;
				}
			}
			return null;
		}
		return null;
		
	}
	
	public String getMostFrequentToy(){
		String name = "name";
		int max = Integer.MIN_VALUE;
		for(int i=0; i<toyList.size(); i++){
			Toy t = toyList.get(i);
			if(max<t.getCount()){
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType(){
		int cars = 0;
		int figures = 0;
		
		for(int i=0; i<toyList.size(); i++){
			Toy t = toyList.get(i);
			if(t.getType().equals("Car")) cars ++;
			if(t.getType().equals("AF")) figures ++;
		}
		
		if(cars>figures){
			return "Cars";
		}
		else if(cars<figures){
			return "Action figures";
		} 
		else{
			return "Equal amounts of action figures and cars!";
		} 
	}
	
	public String toString(){
		return toyList.toString();
	}
}