package br.com.itau.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  					// <-- fala para o SpringBoot que esta classe possui uma tabela no BD
@Table(name="TB_ARTISTA")   // <-- identifica qual é a tabela que estará associada com a classe Usuario
public class Artista {
	
	@Id						// <-- avisa ao SpringBoot que esta coluna é a chave primária da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY)	// <-- representa o auto incremento do BD
	@Column(name="id")
	private int id;
	
	@Column(name="nomeartistico", length=50)
	private String nomeartistico;
	
	@Column(name="nacionalidade", length=30)
	private String nacionalidade;
	
	@Column(name="estilo", length=30)
	private String estilo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeartistico() {
		return nomeartistico;
	}

	public void setNomeartistico(String nomeartistico) {
		this.nomeartistico = nomeartistico;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public Artista(int id, String nomeartistico, String nacionalidade, String estilo) {
		super();
		this.id = id;
		this.nomeartistico = nomeartistico;
		this.nacionalidade = nacionalidade;
		this.estilo = estilo;
	}

	public Artista() {
		super();
	}

	@Override
	public String toString() {
		return "Artista [id=" + id + ", nomeartistico=" + nomeartistico + ", nacionalidade=" + nacionalidade
				+ ", estilo=" + estilo + "]";
	}
	
	
	
	
	

}
