public class Toyota extends Car{
	
	public Toyota(String location){
		loc[0] = Double.parseDouble(location.substring(0,1));
		loc[1] = Double.parseDouble(location.substring(location.length()-1));
	}
	
}