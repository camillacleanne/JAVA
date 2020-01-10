import java.util.Scanner;

public class URI1101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		float m,n, x=0,cont=0;
		m = teclado.nextFloat();
		n = teclado.nextFloat();
		
		if(m<=0 || n<=0) {
			System.out.printf("Favor inserir um número positivo");
		}
		
		if (m<n) {
			x = m;
			m = n;
			n = x;	
		}
		
				
		for (int cont2= 0; cont2<=(m-n)+1; cont2++) {
			System.out.printf("", n++);
			
		}
			System.out.printf("", );
		
	}

}
