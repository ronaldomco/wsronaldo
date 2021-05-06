package br.com.rubinhocar.teste;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		//1o Instanciar um objeto
		// importar a classe = crtl + shift + O
		Veiculo objeto = new Veiculo();
		
		//2o Preencher os dados
		objeto.preencherModelo("Camaro");
		objeto.preencherValor(900);
		objeto.preencherMontadora("Chevrolet");
		objeto.preencherTudo(900, "Camaro", "Chevrolet");
		
		
		//3o Exibir os dados
		System.out.println(objeto.retornarModelo());
		System.out.println(objeto.retornarValor());
		System.out.println(objeto.retornarMontadora());
		System.out.println(objeto.retornarTudo());
		System.out.println(objeto.retornarDesconto());
		
		
		
		
		
		
		
		

	}

}
