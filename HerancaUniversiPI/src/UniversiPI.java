
public class UniversiPI {
	protected String enunciado;
	protected String resposta;

	public UniversiPI(String enun, String resp) {
		this.enunciado = enun;
		this.resposta = resp;
	}
	
	

	void aplicarQuestao() {
		System.out.print("Questao" + enunciado);
	}
	boolean corrigir(String resp) {
		return resposta.equals(resp);
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
}
