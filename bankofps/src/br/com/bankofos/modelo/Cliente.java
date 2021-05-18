package br.com.bankofos.modelo;

import br.com.bankofos.util.OperacoesBasicas;

public class Cliente implements OperacoesBasicas {
	
	private String nome = new String();
	private String email = new String();
	private String fone  = new String();
	private Endereco endereco = new Endereco();
	private int id;
	
	public Cliente(String nome, String email, String fone, Endereco endereco, int id) {
		super();
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente() {
	}

	public Cliente(String nome, String email, String fone, Endereco endereco) {
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", fone=" + fone + ", endereco=" + endereco + "]";
	}
	
	public String getUsuario() {
		if (email.contains("@")) {
			return email.substring(0, email.indexOf("@"));
		}
		return email;
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
