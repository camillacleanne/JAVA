public class biblioteca {

	private String titulo;
	private String autor;
	private int ano;
	private String categoria;
	private int estante;
	private int prateleira;
	private boolean locacao;
	
	public void Biblioteca (String tt, String au, int an, String ca, int) {
		
	}
	
	 
	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setAutor(String _autor) {
		this.autor = _autor;
	}
	public String getAutor() {
		return autor;
	}
	public void setAno (int _ano) {
		this.ano = _ano;
	}
	public int getAno() {
		return ano;
	}
	public void setCategoria(String _categoria) {
		this.categoria= _categoria;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setEstante(int _estante) {
		this.estante = _estante;
	}
	public int getEstante () {
		return estante;
	}
	public void setPrateleira(int _prateleira) {
		this.prateleira = _prateleira;
	}
	public int getPrateleira () {
		return prateleira;
	}
	public boolean isLocacao() {
		return locacao;
	}

	public void setLocacao(boolean _locacao) {
		this.locacao = _locacao;
	}
	
}
