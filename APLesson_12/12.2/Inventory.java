public class Inventory{
	private String mfc, name, category;
	private int upc, price;
	
	public Inventory(String m, String n){
		mfc = m;
		name = n;
		category = "NA";
		upc = (int)(Math.random() * 1000000) + 1;
		price = 0;
	}
	
	public Inventory(String m, String n, String cat, int p){
		mfc = m;
		name = n;
		category = cat;
		upc = (int)(Math.random() * 1000000) + 1;
		price = p;
	}
	
	public String toString(){
		return name+" - "+mfc+"\n"+price+" - "+category+"\n"+upc;
	}
}