import java.util.Scanner;

public class URI1044 {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new Scanner(System.in);

		int a = teclado.nextInt();
		int b = teclado.nextInt();

		if (a == 0 || b == 0) {
			System.out.println("Favor incluir um numero diferente de 0");
        }
		else {
			if (a % b == 0 || b % a == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}

		}
teclado.close();
	}

}
