//**Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel 
//**que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se 
//**fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida
//**e, em seguida, calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.
//**Entrada
//**O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h).


import java.util.Scanner;

public class URI2 {

	public static void main (String args[]) {
		Scanner teclado; 
		teclado = new Scanner(System.in);
		
		int t;
		int v;
		
		System.out.println("Qual tempo gasto(em horas):");
		t = teclado.nextInt();
		
		System.out.println("Qual tempo gasto(em horas):");
		v = teclado.nextInt();
		
		float s =t*v;
		
		System.out.printf("A quantidade de litrosa de combustivel necessario é: %.3f\n",(s/12));
	
		teclado.close();
	}
}
