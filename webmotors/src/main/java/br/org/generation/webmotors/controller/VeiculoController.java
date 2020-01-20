package br.org.generation.webmotors.controller;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.webmotors.bd.BDVeiculo;
import br.org.generation.webmotors.model.Veiculo;

// faz com que o browser enxergue essa conotação como o controller de navegação
	@RestController
	public class VeiculoController {
	private BDVeiculo bd = new BDVeiculo();
	
	@PostMapping("/veiculo/novo")
	public ResponseEntity<Veiculo> novoVeiculo(Veiculo veiculo){
		bd.gravar(veiculo);
		return ResponseEntity.ok(veiculo);
	}
	@GetMapping("/veiculo/{id}")
	public ResponseEntity<Veiculo> getVeiculo(@PathVariable int id){
		Veiculo vei =bd.buscar(id);
		if (vei != null) {
			return ResponseEntity.ok(vei);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping ("/veiculo/todos")
	public ResponseEntity<ArrayList<Veiculo>> getTodos(){
	return ResponseEntity.ok(bd.buscarTodos());
	}
	@PutMapping ("/veiculo")
	public ResponseEntity<String> alterarVeiculo (@RequestBody Veiculo veiculo){
		bd.atualizar(veiculo);
		return ResponseEntity.ok("Sucess");
	}
	@DeleteMapping ("/veiculo/{id}")
	public ResponseEntity<String> removeVeiculo(@PathVariable int id){
		if (bd.Apagar (id)) {
			return ResponseEntity.ok("DELETADI");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	}



//associa/vincula a URL ao metodo http://localhost/veiculo/teste	
//	@GetMapping("/veiculo/teste")
//	public Veiculo testeVeiculo() {
//		Veiculo v = new Veiculo();
//		v.setId(1234);
//		v.setMarca("chevrolet");
//		v.setAno(2019);
//		v.setCor("preta");
//		v.setModelo("Opala");
//		v.setTipo("Gran luxo");
//		v.setDetalhes("4 cilindros, cambio manual, banco de couro ");
//
//		return v;
//	}