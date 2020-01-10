//**Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem, ao utilizar um autom�vel 
//**que faz 12 KM/L. Para isso, ele gostaria que voc� o auxiliasse atrav�s de um simples programa. Para efetuar o c�lculo, deve-se 
//**fornecer o tempo gasto na viagem (em horas) e a velocidade m�dia durante a mesma (em km/h). Assim, pode-se obter dist�ncia percorrida
//**e, em seguida, calcular quantos litros seriam necess�rios. Mostre o valor com 3 casas decimais ap�s o ponto.
//**Entrada
//**O arquivo de entrada cont�m dois inteiros. O primeiro � o tempo gasto na viagem (em horas) e o segundo � a velocidade m�dia durante a mesma (em km/h).


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
		
		System.out.printf("A quantidade de litrosa de combustivel necessario �: %.3f\n",(s/12));
	
		teclado.close();
	}
}
