package br.com.itau.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.modelo.Artista;

public interface ArtistaDAO extends CrudRepository<Artista, Integer> {
	
	public List<Artista> findByNacionalidade(String nacionalidade);
	
	List<Artista> findByNomeartisticoLike(String nome);
	

}
