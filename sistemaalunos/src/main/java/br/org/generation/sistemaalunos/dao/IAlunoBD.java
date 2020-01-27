package br.org.generation.sistemaalunos.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generation.sistemaalunos.model.Aluno;

//integer é o objeto java do int KP 'ra'      
public interface IAlunoBD extends CrudRepository<Aluno, Integer>{

}
