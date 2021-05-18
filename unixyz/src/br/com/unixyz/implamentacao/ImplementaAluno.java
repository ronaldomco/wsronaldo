package br.com.unixyz.implamentacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Endereco;

public class ImplementaAluno {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setBasico("Ronaldo", 18999);
		aluno.setCpf("83680187734");
		aluno.setEmail("ronaldomco@yahoo.com.br");
		aluno.setFone("1234-4321");
		
		Endereco endereco = new Endereco();
		endereco.setBairro("Itaquera");
		endereco.setCep("12345-123");
		endereco.setCidade("São Paulo");
		endereco.setComplemento("apto 33");
		endereco.setEstado("SP");
		endereco.setLogradouro("Rua Sobe e Desce");
		endereco.setNumero("1000");
		
		aluno.setEndereco(endereco);
		
		System.out.println(aluno.toString());
		

	}

}
