import java.util.Scanner;

public class AppQueTestaTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcao;

		Televisao t1; 
		// declarei que t1 vai manipular uma TV
		t1 = new Televisao("Sony", 110, 32);
		// reservo um espoaço na memória pra isso

		// System.out.println("Valor padrao para Marca = "t1.getMarca());
		// System.out.println("Valor padrao para Voltagem = "t1.getVoltagem());
		// System.out.println("Valor padrao para Tamanho = "t1.getTamanho());
		// System.out.println("Valor padrao para Ligada = "t1.getLigada());
		// System.out.println("Valor padrao para Canal = "t1.getCanal());
		// System.out.println("Valor padrao para Volume = "t1.getVolume());

		// t1.setmarca("Sony");
		//	t1.setvoltagem (110);	
		// t1.settamanho (35);
		// t1.setligada (false);
		// t1.setcanal (5);
		// t1.setvolume (2);

		do {
			System.out.println("*********************************");
			System.out.println("          controle Remoto        ");
			System.out.println("---------------------------------");
			System.out.println(" 1 - Ligar/Desligar              ");
			System.out.println(" 2 - Aumentar Volume             ");
			System.out.println(" 3 - Diminuir Volume             ");
			System.out.println(" 4 - avancar canal               ");
			System.out.println(" 5 - voltar canal                ");
			System.out.println(" 0 - Encerrar Sistema            ");
			System.out.println("*********************************");
			opcao = teclado.nextInt();
			// logica das opcoes

			switch (opcao) {
			case 1:
				t1.switchPower();
				break;
			}
			switch (opcao) {
			case 2:
				t1.aumentarVolume();
				break;
			}
			switch (opcao) {
			case 3:
				t1.diminuirVolume();
				break;
			}

			System.out.println("\n\n\n\n\n\n");

		} while (opcao != 0);
	}

}
