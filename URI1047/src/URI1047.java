import java.util.Scanner;

public class URI1047 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int hi, mi, hf, mf, mt1, mt2, m24, resultado;
		hi = teclado.nextInt();
		mi = teclado.nextInt();
		hf = teclado.nextInt();
		mf = teclado.nextInt();
		resultado = 0;
		
		 mt1 = (hi*60) + mi;
		 mt2 = (hf*60) + mf;
		 m24 = 24*60;
		 
		
		if (mt2>mt1) {
			resultado = mt2-mt1;
			System.out.printf("O JOGO DUROU %d HORAS(S) E %d MINUTO(S)\n", (resultado/60), (resultado%60));
		} else if (mt1>mt2) {
			resultado = (m24-mt1)+(mt2);
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S) \n", (resultado/60), (resultado%60));
		} else if (mt2==mt1) {
			System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S) \n", 24, 0);
		}
		
		teclado.close();
	}
}
