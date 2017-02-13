public class StudentAdvance extends Advance{
	public StudentAdvance(int days){
		super(days);
	}
	
	int getPrice(){
		return super.getPrice()/2;
	}
	
	public String toString(){
		return super.toString()+"\n(STUDENT ID REQUIRED)";
	}
	
}