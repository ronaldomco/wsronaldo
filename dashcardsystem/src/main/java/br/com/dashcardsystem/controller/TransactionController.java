package br.com.dashcardsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.dashcardsystem.dao.TransactionDAO;
import br.com.dashcardsystem.modelo.Transaction;

@RestController		// para indicar ao Spring que esta classe irá responder métodos HTTP
@CrossOrigin("*")	// para liberar o acesso fora do servidor à estes recursos
public class TransactionController {

	@Autowired	// delega para o Spring o gerenciamento deste atributo
	private TransactionDAO dao;


	
	
	
	@GetMapping("/transacoes")
	public ResponseEntity<List<Transaction>> getAll(){
		List<Transaction> lista = (List<Transaction>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping("/transacoes/{codstatus}")
	public ResponseEntity<Integer> getTotalStatus(@PathVariable int codstatus){
		if (codstatus == 0) {
			return ResponseEntity.ok(dao.findByTotalStatus0(codstatus));	
		}else if (codstatus == 1) {
			return ResponseEntity.ok(dao.findByTotalStatus1(codstatus));
		}else if (codstatus == 2) {
			return ResponseEntity.ok(dao.findByTotalStatus2(codstatus));
		}return ResponseEntity.status(404).build();
			
		 
	 }
	 


}
