package br.com.caicai.teste;

import br.com.caicai.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador objeto = new Elevador();
		
		objeto.inicializar("Torre B", 20, 0, 8);
		//System.out.println(objeto.retornarTudo());
		
		System.out.println(objeto.subir());
		System.out.println(objeto.subir());
		//System.out.println(objeto.retornarTudo());
		
		objeto.entrar();
		objeto.entrar();
		objeto.entrar();
		objeto.entrar(4);
		//System.out.println(objeto.retornarTudo());

		System.out.println(objeto.descer());
		System.out.println(objeto.descer());
		System.out.println(objeto.descer());
		objeto.sair();
		System.out.println(objeto.retornarTudo());
		
		
	}

}
