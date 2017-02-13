public class TicketDriver{
	
	public static void main(String [] args){
		Walkup w = new Walkup();
		Advance a = new Advance(15);
		StudentAdvance sa = new StudentAdvance(8);
		
		System.out.println(w.toString());
		System.out.println(a.toString());
		System.out.println(sa.toString());
		
	}
}