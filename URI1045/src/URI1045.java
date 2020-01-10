import java.util.Scanner;

public class URI1045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		float a,b,c,i;
		a = teclado.nextFloat();
		b = teclado.nextFloat();
		c = teclado.nextFloat();
		

		for (int cont = 0; cont <= 3; cont++) {
			if (a < b) {

				i = a;
				a = b;
				b = i;
			}

			if (b < c) {
				i = b;
				b = c;
				c = i;
			}
			
			if {
				i = a;
				a = c;
				c = i;
			}
		}
		
		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		if ((a * a) == (b * b) + (c * c)) {
			System.out.println("TRIANGULO RETANGULO");
		}
		if ((a * a) > (b * b + c * c) && (a < b+c)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if ((a * a) < (b * b) + (c * c)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (a == b && a == c) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		if (a == b & a!=c || a == c & a!=b ) {
			System.out.println("TRIANGULO ISOSCELES");
		}

		teclado.close();
	}
}
