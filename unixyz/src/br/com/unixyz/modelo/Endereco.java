package br.com.unixyz.modelo;

public class Endereco {

	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String numero;
	private String complemento;

	// Gera��o de Construtores Vazio e Cheio (Menu Source e Gebnerate Construtor using fields)
	public Endereco(){}
	
	

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado
				+ ", cep=" + cep + ", numero=" + numero + ", complemento=" + complemento + "]";
	}



	public Endereco(String logradouro, String bairro, String cidade, String estado, String cep, String numero,
			String complemento) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}

	// Gera��o de Getters and Setters ( Menu Source e Op��o Generate Getters and Setters)
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	//DTO
	//Atributos privados (done)
	//Gerem os Getters e Setters
	//Gerem dois contrutores (cheio e vazio)



}
