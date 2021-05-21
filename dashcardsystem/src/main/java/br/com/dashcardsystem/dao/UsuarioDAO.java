package br.com.dashcardsystem.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.dashcardsystem.modelo.Usuario;

/*
 *  DAO => é uma pattern que sugestiona onde deve ficar os comando SQL DML.
 *  Dentro da classes DAO's:
 *  Deve montar o CRUD (Create - Read - Update - Delete)
 */

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	
	public Usuario findByEmailAndSenha(String email, String senha);
/*
 * CrudRepository será a classe pai do UsuarioDAO e está infirmando ao Sprong que esta
 * classe armazenará o CRUD para o usuário. 
 * O Integer é para especificar que o tipo de dado da chave primária é Integer 
 */

/*
 * Métodos herdados do CrudRepository:
 * - save(objeto)	: grava/altera uma linha no banco de dados
 * - findById(int)	: pesquisa uma salário pelo código
 * - findAll()		: retornar todos os usuários
 * - deleteById(int): apaga um usuário pelo código
 * - deleteAll()	: apaga tudo
 * - count() 		: retorna quantos usuários existem
 *  
 */



	
	

}
