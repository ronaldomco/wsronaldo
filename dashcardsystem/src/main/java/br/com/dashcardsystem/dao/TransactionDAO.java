package br.com.dashcardsystem.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.dashcardsystem.modelo.Transaction;

public interface TransactionDAO extends CrudRepository<Transaction, Integer> {


@Query(value="SELECT COUNT(status) AS TOTAL FROM mtb310_transaction WHERE STATUS=0", nativeQuery=true)
public int findByTotalStatus0(@Param("num") int num);

@Query(value="SELECT COUNT(status) AS TOTAL FROM mtb310_transaction WHERE STATUS=1", nativeQuery=true)
public int findByTotalStatus1(@Param("num") int num);

@Query(value="SELECT COUNT(status) AS TOTAL FROM mtb310_transaction WHERE STATUS=2", nativeQuery=true)
public int findByTotalStatus2(@Param("num") int num);


@Query(value="SELECT COUNT(status) AS TOTAL FROM mtb310_transaction WHERE agfinanceiro_id_agente=3", nativeQuery=true)
public int findByTotaCountAgente(@Param("num") int num);


}
