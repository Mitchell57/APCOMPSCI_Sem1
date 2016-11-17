public class GetOdds{
	
	static int[] numbers = new int[10];
	
	public static void main(String [] args){

		fillArray();
		System.out.println("Original Array:");
		printArray(numbers);
		System.out.println("Odds:");
		printArray(getOdds(numbers));
	}
	
	public static void fillArray(){
		for(int i=0; i<numbers.length; i++){
			numbers[i] = (int)(Math.random()*100)+1;
		}
	}
	
	public static void printArray(int[] nums){
		for(int num : nums){
			System.out.print(num+" ");
		}
		System.out.println();
	}
	
	public static int[] getOdds(int[] numbers){
		int[] oddsInit = new int[10];
		int count = 0; 
		
		for(int num : numbers){
			if(num%2!=0){
				oddsInit[count] = num;
				count ++;
			}
		}
		
		int[] oddsReturn = new int[count];
		for(int i=0; i<count; i++){
			oddsReturn[i] = oddsInit[i];
		}
		
		return oddsReturn;
		
	}
}