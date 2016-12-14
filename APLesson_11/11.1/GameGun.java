import java.util.Scanner;

public class GameGun{
	
	static int bulletCount, CLIPSIZE = 16, shotCount;
	static String[] clip = new String[16];
	
	public static void main(String [] args){
		bulletCount = 96;
		shotCount = 0;
		Scanner kb = new Scanner(System.in);
		resetClip();
		
		while(hasBullets()){
			System.out.println("Action: ");
			String action = kb.next();
			if(action.equals("r")) reload();
			if(action.equals("s")) System.out.println(shoot());
			printClip();
		}
	}
	
	public static boolean hasBullets(){
		return bulletCount>0 || shotCount>0;
	}
	
	public static void resetClip(){
		for(int i=0; i<clip.length; i++){
			clip[i] = "[]";
		}
	}
	
	public static String shoot(){
		if(shotCount>0){
			clip[shotCount-1] = "[]";
			shotCount -= 1;
			return "Boom!";
		}
		else{
			return "Need to Reload!";
		}
	}
	
	public static void reload(){
		if(bulletCount>=CLIPSIZE){
			bulletCount -= CLIPSIZE-shotCount;
			shotCount = CLIPSIZE;
		}
		else{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		
		resetClip();
		for(int i=0; i<shotCount; i++){
			clip[i] = " *";
		}
	}
	
	public static void printClip(){
		String print = "Bullets:	"+bulletCount+"\nClip:	";
		for(int i=0; i<CLIPSIZE; i++){
			print = print+clip[i];
		}
		
		System.out.println(print);
	}
}