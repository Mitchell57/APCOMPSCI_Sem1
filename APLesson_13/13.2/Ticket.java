import java.util.Random;

public abstract class Ticket{
	private int serial;
	
	public Ticket(){
	}
	
	public int getSerialNo(){
		Random rand = new Random();
		return rand.nextInt(9999999);
	}
	
	abstract int getPrice();
	
	public String toString(){
		return "Serial #: "+getSerialNo()+"\nPrice: "+getPrice();
	}
	
}