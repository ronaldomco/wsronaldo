package br.com.excecao.excecoes;

public class MinhaExcecao extends Exception {
	
	public static String tratar(Exception e) {
		
		if (e instanceof NullPointerException) {
			return "Objeto Nulo";
		}else if (e instanceof NumberFormatException) {
			return "Número Inválido";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
		}else {
			return "Erro desconhecido - Chame o Administrador";
		}
		
	}
	

}
