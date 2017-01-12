public class Car{
	private String paint, interior, engine, tires;
	
	public Car(){
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	public Car(String p, String i, String e, String t){
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public String getPaint(){
		return paint;
	}
	
	public String getInterior(){
		return interior;
	}
	
	public String getEngine(){
		return engine;
	}
	
	public String getTires(){
		return tires;
	}
	
	public void setPaint(String x){
		paint = x;
	}
	
	public void setEngine(String x){
		engine = x;
	}
	
	public void setInterior(String x){
		interior = x;
	}
	
	public void setTires(String x){
		tires = x;
	}
}