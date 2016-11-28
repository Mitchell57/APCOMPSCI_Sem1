import java.util.Arrays;
import java.util.ArrayList;

public class KeepComps{
	
	public static void main(String [] args){
		Integer[] nums = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> numsList = new ArrayList<Integer>(Arrays.asList(nums));
		for(int i=0; i<numsList.size(); i++){
			if(gFactor(numsList.get(i))==0) numsList.remove(i);
		}
		System.out.println(numsList);
	}
	
	public static int gFactor(int n){
		for(int i=2; i<n-1; i++){
			if(n%i==0) return 1;
		}
		return 0;
	}
}