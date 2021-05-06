package br.com.unixyz.modelo;
/*
 * Design Pattern: compilado de padrões de projetos para Orientação a Objetos (OO).
 * Um dos padrões é o DTO (Data Transfer Object) cuja função é aplicar
 * boa prática na transição entre o projeto e a programação.
 * Sugestões:
 * 1o TODOS os atributos devem estaar como privados;
 * 2o Cada atributo deve possuir um método get para o input e outro método set para o output.
 * 3o 
 */
public class Aluno {
	
	private int rm;
	private String nome;
	private String email;
	private String fone;
	private String cpf;
	
	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", cpf=" + cpf + "]";
	}	

	public void setBasico(String pNome, int pRM) {
		nome = pNome;
		rm = pRM;
	}
	
	public String getResumo() {
		return "Nome.....: " + nome    +  "\n" + 
				"RM.......: " + rm;
	}
	
	public String getUsuario() {
		if (email.contains("@")) {
		return email.substring(0, email.indexOf("@"));
		}
		
		
	}
	
	
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
