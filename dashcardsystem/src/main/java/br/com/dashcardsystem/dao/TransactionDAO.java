package br.com.dashcardsystem.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.dashcardsystem.modelo.Transaction;

public interface TransactionDAO extends CrudRepository<Transaction, Integer> {

	
}
