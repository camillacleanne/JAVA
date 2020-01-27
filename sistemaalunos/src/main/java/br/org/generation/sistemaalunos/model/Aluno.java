package br.org.generation.sistemaalunos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_aluno")
public class Aluno {
	@Column(name = "ra") //indico que a class aluno é uma entidade armazenavel em banco de dados
	@Id					// associo explicitamente o nome da tabela que armazena
	@GeneratedValue(strategy = GenerationType.IDENTITY) //indica que RA é auto-gerado pelo banco de dados
	private int ra;
	
	@Column (name="nome",length = 100) //indicamos que o nome e o tamanho da coluna
	private String nome;
	@Column (name="email", length = 100)
	private String email;
	@Column (name="telefone", length = 100)
	private String telefone;
	
	
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
