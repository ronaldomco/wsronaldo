package br.com.rubinhocar.modelo;

public class Veiculo {
	
	private float valor;
	private String modelo;
	private String montadora;
	
	//Criação do metodo
	//<modificador> <tipo do retorno> <nome do metodo> <tipo do parametro> <nome do parametro> { }
	// public         void             preencherModelo   String             param
	
	public void preencherModelo(String param) {
		if (param.length()<=40) {
			modelo = param.toUpperCase();	
		}
	}
	
	public String retornarModelo() {
		return modelo;
	}

	public void preencherValor(float param) {
		valor = param;	
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public void preencherMontadora(String param) {
		if (param.length()<=30) {
			montadora = param.toUpperCase();	
		}
	}
	
	public String retornarMontadora() {
		return montadora;
	}
	
	public void preencherTudo(float pValor, String pModelo, String pMontadora) {
		valor = pValor;
		
		if (pModelo.length()<=40) {
			modelo = pModelo.toUpperCase();
		}
		
		if (pMontadora.length()<=30) {
			montadora = pMontadora.toUpperCase();
		}
	}
	
	public String retornarTudo() {
		return "Modelo.....: " + modelo    +  "\n" + 
			   "Montadora..: " + montadora +  "\n" + 
			   "Valor......: " + valor;
		
	}
	
	public float retornarDesconto() {
		return valor * (float) 0.9;
		
	}
	
}
