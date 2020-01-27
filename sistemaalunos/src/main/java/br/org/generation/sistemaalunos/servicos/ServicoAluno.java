package br.org.generation.sistemaalunos.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.sistemaalunos.dao.IAlunoBD;
import br.org.generation.sistemaalunos.model.Aluno;

@Component
public class ServicoAluno implements IAlunoService {

	@Autowired   //indica que o gerenciamento desse obj é por conta do Springboot
	IAlunoBD repo; //repo é o repositorio (uma alusão ao banco de dados)
	
	public void gravarAlunoNoBanco(Aluno aluno) {
		try {
			repo.save(aluno);
		}catch (Exception ex) {
			throw new RuntimeException("Erro ao inserir novo aluno!");
		}
		
	}

	@Override
	public void atualizarAlunoNoBanco(Aluno aluno) {
		try {
			repo.save(aluno);
		}catch (Exception ex) {
			throw new RuntimeException("Erro ao ao atualizar aluno no banco!");
		}
	
		
	}

	@Override
	public Aluno recuperarAlunoPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
