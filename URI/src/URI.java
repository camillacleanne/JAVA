import java.util.Scanner;

public class URI {
	
	public static void main (String args[]) {
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double a;
		double b;
		double c;
		
		System.out.print("Digite o primeiro valor :");
		a = teclado.nextFloat();
		System.out.print("Digite o segundo valor  :");
		b = teclado.nextFloat();
		System.out.print("Digite o terceiro valor :");
		c = teclado.nextFloat();
		
		System.out.printf("A área do triângulo retângulo que tem "+a+" por base e "+c+" por altura é: %.3f\n" ,((a*c)/2));
		System.out.printf("A área do círculo de raio %.3f\n "+c+"", (3.14159*(c*c)));
		System.out.printf("A área do trapézio que tem "+a+" e "+b+" por bases e "+c+" por altura %.3f\n" , ((a+b)*c)/2f );
		System.out.printf("A área do quadrado que tem lado %.3f\n +b", b*b); 
		System.out.printf("A área do retângulo que tem lados "+a+" e "+b+" %.3f\n", a*b); 
		
		teclado.close();
	}

}
