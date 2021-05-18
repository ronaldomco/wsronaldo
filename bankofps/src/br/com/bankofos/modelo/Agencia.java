package br.com.bankofos.modelo;

import br.com.bankofos.util.OperacoesBasicas;

public class Agencia implements OperacoesBasicas{
	
	
	private String nome;
	private int numero;
	private String fone;
	
	
	
	@Override
	public String toString() {
		return "Agencia [nome=" + nome + ", numero=" + numero + ", fone=" + fone + "]";
	}
	

	public Agencia() {
		super();
	}
	
	public Agencia(String nome, int numero, String fone) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.fone = fone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}


	@Override
	public boolean add() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void excluir(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
