package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		/*
		 * Tipos primitivos: são tipos que estão dentro da linguagem
		 * 
		 * boolean = tipo lógico (true/false)
		 * char = 1 caracter (apostrofos)  'a' (chat)  // "a" (String)
		 * 
		 * byte  = -128 até +127
		 * short = -32768 até +32767
		 * int   = -2 trilhões até + 2 trilhões
		 * long  = casa dos quintilhões
		 * 
		 * float = números decimais, até cinco casas
		 * double= possui o dobro de precisão em relação ao float.
		 * 
		 * Classes Wrapper - São classes que servem para apoiar os tipos primitivos
		 * int - Integer
		 * float - Float
		 * double - Double
		 * boolean - Boolean
		 */
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
		float fgts = (float) (salario * 0.08);  // Ocorre o casting 
		System.out.println("FGTS.: " + fgts);
		
		
	}

}
