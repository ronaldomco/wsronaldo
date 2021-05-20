package br.com.dashcardsystem.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="mtb310_transaction")
public class Transaction {
	
	@Id						// <-- avisa ao SpringBoot que esta coluna é a chave primária da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY)	// <-- representa o auto incremento do BD
	@Column(name="id_transacao")
	private int id_transacao;
	
	@Column(name="data_hora")
    private String data_hora;
	
	@Column(name="dispositivo")
    private int dispositivo;

	@Column(name="valor_solic")
	private float valor_solic;
	
	@Column(name="valor_aut")
    private float valor_aut;
	
	@Column(name="status")
    private int status;
		
	@ManyToOne
	@JsonIgnoreProperties("id_agente")
	private AgFinanceiro agfinanceiro;

	public int getId_transacao() {
		return id_transacao;
	}

	public void setId_transacao(int id_transacao) {
		this.id_transacao = id_transacao;
	}

	public String getData_hora() {
		return data_hora;
	}

	public void setData_hora(String data_hora) {
		this.data_hora = data_hora;
	}

	public int getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(int dispositivo) {
		this.dispositivo = dispositivo;
	}

	public float getValor_solic() {
		return valor_solic;
	}

	public void setValor_solic(float valor_solic) {
		this.valor_solic = valor_solic;
	}

	public float getValor_aut() {
		return valor_aut;
	}

	public void setValor_aut(float valor_aut) {
		this.valor_aut = valor_aut;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public AgFinanceiro getAgfinanceiro() {
		return agfinanceiro;
	}

	public void setAgfinanceiro(AgFinanceiro agfinanceiro) {
		this.agfinanceiro = agfinanceiro;
	}

	public Transaction(int id_transacao, String data_hora, int dispositivo, float valor_solic, float valor_aut,
			int status, AgFinanceiro agfinanceiro) {
		super();
		this.id_transacao = id_transacao;
		this.data_hora = data_hora;
		this.dispositivo = dispositivo;
		this.valor_solic = valor_solic;
		this.valor_aut = valor_aut;
		this.status = status;
		this.agfinanceiro = agfinanceiro;
	}

	public Transaction() {
		super();
	}

	@Override
	public String toString() {
		return "Transaction [id_transacao=" + id_transacao + ", data_hora=" + data_hora + ", dispositivo=" + dispositivo
				+ ", valor_solic=" + valor_solic + ", valor_aut=" + valor_aut + ", status=" + status + ", agfinanceiro="
				+ agfinanceiro + "]";
	}
	
	


	
	
	
	
	

}
