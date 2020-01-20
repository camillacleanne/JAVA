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
import br.org.generation.webmotors.bd.BDCliente;
import br.org.generation.webmotors.model.Cliente;

	@RestController
	public class ClienteController {
		
	private BDCliente bd = new BDCliente();

	@PostMapping("/cliente/novo")
	public ResponseEntity<Cliente> novoCliente(Cliente cliente) {
		bd.gravar(cliente);	
		return ResponseEntity.ok(cliente); 
	}

	@GetMapping("/cliente/{id}")
	public ResponseEntity<Cliente> getCliente(@PathVariable int id) {
		Cliente cli = bd.buscar(id);
		if (cli != null) {  // encontrei um cliente com o ID especificado
			return ResponseEntity.ok(cli);
		} else {
			return ResponseEntity.notFound().build();

		}
	}

	@GetMapping("/cliente/todos")
	public ResponseEntity<ArrayList<Cliente>> getTodos() {
		return ResponseEntity.ok(bd.buscarTodos());
	}
	@PutMapping("/cliente")
	public ResponseEntity<String> alterarCliente(@RequestBody Cliente cliente){
		bd.atualizar(cliente);
		return ResponseEntity.ok("Sucess");
	}
	@DeleteMapping("/cliente/{id}")
	public ResponseEntity<String> removeCliente(@PathVariable int id){
		if (bd.Apagar (id)) {
			return ResponseEntity.ok("DELETADO");
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	}
	
	
	
	
	
	
	
//	@GetMapping("/cliente/teste")
//	public Cliente testeCliente() {
//		Cliente c = new Cliente();
//		c.setId(1223);
//		c.setNome("joberval");
//		c.setEmail("jober.htinho@gmail.com");
//		c.setCpf("09745874521");
//		c.setTelefone("4352464846");
//		c.setDetalhes("era um cara muito engraçado nao tinha teto nao tinha nada");
//		
//		return c;
//	}

}
