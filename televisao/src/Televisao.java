public class Televisao {
// informação sobre uma tv

	private String marca;
	private int voltagem;
	private int tamanho;
	private boolean ligada;
	private int volume;
	private int canal;

//metodo especial para inicializar informacoes e perceba que ele n tem nhm retorno
	
	public Televisao (String marca, int voltagem, int tamanho) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.tamanho = tamanho;
		this.ligada = false;
		this.volume = 5;
		this.canal = 1;
	}
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	void switchPower() {
		ligada = !ligada;
		System.out.println("A TV " + marca + " está " + ((ligada) ? "ligada" : "desligada"));
		// operador ternario de atribuição condicional
		/*
		 * (testelogico) ? "valor caso true" : "valor caso false")
		 */
	}

	void aumentarVolume() {
		if (ligada) {
			if (volume != 100) {
				volume++;
				System.out.println("A TV " + marca + " esta no volume" + volume);
			} else {
				System.out.println("MAX");
			}
		} else {
			System.out.println("A TV esta desligada");
		}
	}

	void diminuirVolume() {
		if (ligada) {
			if (volume != 0) {
				volume--;
				System.out.println("A TV " + marca + " esta no volume" + volume);
			} else {
				System.out.println("MIN");
			}
		} else {
			System.out.println("A TV esta desligada");
		}
	}

	void acancarCanal() {
		if (ligada) {
			canal++;
			if (canal > 10) {
				canal = 1;
			}
			System.out.println("A TV " + marca + " esta no volume" + canal);
		} else {
			System.out.println("A TV esta desligada");
		}
	}

	void voltarCanal() {
		if (ligada) {
			canal--;
			if (canal < 1) {
				canal = 10;
			}
			System.out.println("A TV " + marca + " esta no volume" + canal);
		} else {
			System.out.println("A TV esta desligada");
		}
	}
}
