package br.com.unixyz.implamentacao;

import br.com.unixyz.modelo.Aluno;

public class ImplementaAluno {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setBasico("Ronaldo", 18999);
		aluno.setCpf("83680187734");
		aluno.setEmail("ronaldomco@yahoo.com.br");
		aluno.setFone("1234-4321");
		
		System.out.println(aluno.toString());
		

	}

}
