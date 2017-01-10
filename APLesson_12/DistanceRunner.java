import java.util.Scanner;

public class DistanceRunner{
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		
		//First Point
		System.out.println("Enter first point (X, Y)");
		String point1 = kb.nextLine();
		int i = 1;
		while(point1.charAt(i) != ','){
			x1 *= 10;
			x1 += testNum(point1.charAt(i));	
			i++;
		}

		while(i<point1.length()){
			if(y1 != 0 && testNum(point1.charAt(i)) != 0) y1 *= 10;
			y1 += testNum(point1.charAt(i));
			i++;
		}
		
		//Second Point
		System.out.println("Enter second point (X, Y)");
		String point2 = kb.nextLine();
		i = 1;
		while(point2.charAt(i) != ','){
			x2 *= 10;
			x2 += testNum(point2.charAt(i));	
			i++;
		}
		while(i<point2.length()){
			if(y2 != 0 && testNum(point2.charAt(i)) != 0) y2 *= 10;
			y2 += testNum(point2.charAt(i));
			i++;
		}
		
		Distance dist = new Distance(x1, y1, x2, y2);
		System.out.printf("The distance between "+point1+" and "+point2+" is: %4.2f \n", dist.getDist());
		
		//First Point
		System.out.println("Enter first point (X, Y)");
		point1 = kb.nextLine();
		i = 1;
		while(point1.charAt(i) != ','){
			x1 *= 10;
			x1 += testNum(point1.charAt(i));		
			i++;
		}

		while(i<point1.length()){
			if(y1 != 0 && testNum(point1.charAt(i)) != 0) y1 *= 10;
			y1 += testNum(point1.charAt(i));
			i++;
		}
		
		//Second Point
		System.out.println("Enter second point (X, Y)");
		point2 = kb.nextLine();
		i = 1;
		while(point2.charAt(i) != ','){
			x2 *= 10;
			x2 += testNum(point2.charAt(i));
			i++;
		}
		while(i<point2.length()){
			if(y2 != 0 && testNum(point2.charAt(i)) != 0) y2 *= 10;
			y2 += testNum(point2.charAt(i));
			i++;
		}
		
		dist.setValues(x1, y1, x2, y2);
		System.out.printf("The distance between "+point1+" and "+point2+" is: %4.2f \n", dist.getDist());
		
	}
	
	private static int testNum(char at){
		int num = Character.getNumericValue(at);
		if(num>=0)return num;
		else return 0;
	}
	
	
}