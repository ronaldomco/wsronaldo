package br.com.dashcardsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.dashcardsystem.dao.AgFinanceiroDAO;
import br.com.dashcardsystem.modelo.AgFinanceiro;


@RestController		// para indicar ao Spring que esta classe irá responder métodos HTTP
@CrossOrigin("*")	// para liberar o acesso fora do servidor à estes recursos
public class AgFinanceiroController {
	
	@Autowired	// delega para o Spring o gerenciamento deste atributo
	private AgFinanceiroDAO dao;
	
	
	@PostMapping("/novoagentefinaceiro")
	public ResponseEntity<AgFinanceiro> add(@RequestBody AgFinanceiro objeto) {
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	
	
	@GetMapping("/agentefinanceiro/{cod}")
	public ResponseEntity<AgFinanceiro> getAgenteFinanceiro(@PathVariable int cod) {
		AgFinanceiro resposta = dao.findById(cod).orElse(null);

		if (resposta==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	
	@GetMapping("/agentefinanceiros")
	public ResponseEntity<List<AgFinanceiro>> getAll(){
		List<AgFinanceiro> lista = (List<AgFinanceiro>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}

	
	@GetMapping("/agentefinanceirostop10")
	public ResponseEntity<List<AgFinanceiro>> getAlltop10(){
		List<AgFinanceiro> lista = (List<AgFinanceiro>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
}
