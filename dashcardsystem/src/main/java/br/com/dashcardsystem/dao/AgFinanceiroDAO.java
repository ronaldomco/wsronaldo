package br.com.dashcardsystem.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.dashcardsystem.modelo.AgFinanceiro;

public interface AgFinanceiroDAO extends CrudRepository<AgFinanceiro, Integer> {

}
