package br.com.caicai.modelo;

public class Elevador {

	String nome;
	int andarMaximo;
	int andarMinimo;
	int capacidadePessoas;
	int andarAtual;
	int qtdePessoas;

	public void inicializar(String pNome, int pAndarMax, int pAndarMin, int capPessoas) {
		nome = pNome.toUpperCase();	
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = capPessoas;
	}

	public String retornarTudo() {
		return  "Nome...................: " + nome         +  "\n" + 
				"Andar Máximo...........: " + andarMaximo  +  "\n" +	
				"Andar Mínimo...........: " + andarMinimo  +  "\n" +
				"Andar Atual............: " + andarAtual   +  "\n" +
				"Qtde de Pessoas .......: " + qtdePessoas  +  "\n" +
				"Capacidade de Pessoas..: " + capacidadePessoas;  		
	}

	public String subir() {
		if (andarAtual < andarMaximo) {
			andarAtual +=1;
			return "Subindo";
		}else {
			return "Não pode subir";
		}
	}


	public String descer() {
		if (andarAtual > andarMinimo) {
			andarAtual -=1;
			return "Descendo";
		}else {
			return "Não pode descer";
		}
	}

	public void entrar() {
		if (qtdePessoas < capacidadePessoas) {
			qtdePessoas +=1;
		}
	}

	public void sair() {
		if (qtdePessoas > 0) {
			qtdePessoas -=1;
		}
	}

	public void entrar (int pQtde) {
		if (qtdePessoas+pQtde <= capacidadePessoas) {
			qtdePessoas +=pQtde;
		}
	}



}
