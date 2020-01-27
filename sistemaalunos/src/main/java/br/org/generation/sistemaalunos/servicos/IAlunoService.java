package br.org.generation.sistemaalunos.servicos;

import br.org.generation.sistemaalunos.model.Aluno;

public interface IAlunoService {
public void gravarAlunoNoBanco(Aluno aluno);
public void atualizarAlunoNoBanco(Aluno aluno);
public Aluno recuperarAlunoPorId(int id);
}
