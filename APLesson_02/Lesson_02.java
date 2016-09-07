public class Lesson_02
{
	public static void main(String[] args)
	{
		multiply(2, 4);
		concate("Mitch", "1234 Streetroad Ln", "FakeTownville", 12345);
		surface(5, 4, 3);
	}
	
	public static void multiply(int a, int b){
		int product = a*b;
		System.out.println(a+" multiplied by "+b+" is "+product);
	}
	
	public static void concate(String name, String address, String city, int zip){
		System.out.println(name+"\n"+address+"\n"+city+", CA "+zip);
	}
	
	public static void surface(int l, int h, int w){
		int area = 2*((w*h)+(h*l)+(h*w));
		System.out.println("The surface area of your rectangle is "+area);
	}
}