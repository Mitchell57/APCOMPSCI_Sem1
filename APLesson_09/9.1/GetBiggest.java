public class GetBiggest{
	
	static int[] numbers = new int[10];
	
	public static void main(String [] args){

		fillArray();
		System.out.println("For these numbers:");
		printArray(numbers);
		System.out.println("The biggest is "+getBiggest());
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
	
	public static int getBiggest(){
		int max = 0;
		
		for(int num : numbers){
			if(num>max){
				max = num;
			}
		}
		
		return max;
	}

}