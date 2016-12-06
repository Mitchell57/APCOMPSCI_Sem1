public class XandO{
	
	public static void main(String [] args){
		String[][] xAndO = new String[4][4];
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				int pick = (int)(Math.random()*2)+1;
				if(pick == 1){
					xAndO[i][j] = "x";
				}
				else{
					xAndO[i][j] = "o";
				}
				System.out.print(xAndO[i][j]+"	");
			}
			System.out.println();
		}
		
	}
}