
import java.util.Scanner;

public class ExemploLeitura { 

	public static void main (String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int a;
		float b;
		String texto;
		
		System.out.print("Digite um nome          :");
		texto = teclado.nextLine();
		System.out.print("Digite um valor inteiro : ");
		a = teclado.nextInt();
		System.out.print("Digite um valor real    :");
		b = teclado.nextFloat();
		
		System.out.println("%.3f\n", b);
		System.out.println ("O texto digitado vale:");
		System.out.println (texto);
		System.out.println ("Você digitou os valores "+a+" e "+b);
		
		teclado.close();
	}
}
