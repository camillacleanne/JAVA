import java.util.Scanner;

public class URI1060 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obs = new Scanner(System.in);
	
		float val ;
		int x = 0;
	
	for (int i=0; i<6; i++) {
		val = obs.nextFloat();
		if(val>0) {
			x++; 
		}
	}
	System.out.printf(x +" valores positivos\n"); 
	
	obs.close();
}
}

