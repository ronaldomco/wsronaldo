package br.com.dashcardsystem.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="mtb310_ag_financeiro")
public class AgFinanceiro {
	
	@Id						// <-- avisa ao SpringBoot que esta coluna é a chave primária da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY)	// <-- representa o auto incremento do BD
	@Column(name="id_agente")
	private int id_agente;
	
	@Column(name="nome_agente", length=100)
	private String nome_agente;
	
	@Column(name="volume_transacional")
	private float volume_transacional;

	@OneToMany(mappedBy="id_transacao", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("id_transacao")
	private List<Transaction> transacoes;

	public int getId_agente() {
		return id_agente;
	}

	public void setId_agente(int id_agente) {
		this.id_agente = id_agente;
	}

	public String getNome_agente() {
		return nome_agente;
	}

	public void setNome_agente(String nome_agente) {
		this.nome_agente = nome_agente;
	}

	public float getVolume_transacional() {
		return volume_transacional;
	}

	public void setVolume_transacional(float volume_transacional) {
		this.volume_transacional = volume_transacional;
	}

	public List<Transaction> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Transaction> transacoes) {
		this.transacoes = transacoes;
	}

	public AgFinanceiro(int id_agente, String nome_agente, float volume_transacional, List<Transaction> transacoes) {
		super();
		this.id_agente = id_agente;
		this.nome_agente = nome_agente;
		this.volume_transacional = volume_transacional;
		this.transacoes = transacoes;
	}

	public AgFinanceiro() {
		super();
	}

	@Override
	public String toString() {
		return "AgFinanceiro [id_agente=" + id_agente + ", nome_agente=" + nome_agente + ", volume_transacional="
				+ volume_transacional + ", transacoes=" + transacoes + "]";
	}
	
	

	
	
	

}
