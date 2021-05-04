package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		/*
		 * Tipos primitivos: s�o tipos que est�o dentro da linguagem
		 * 
		 * boolean = tipo l�gico (true/false)
		 * char = 1 caracter (apostrofos)  'a' (chat)  // "a" (String)
		 * 
		 * byte  = -128 at� +127
		 * short = -32768 at� +32767
		 * int   = -2 trilh�es at� + 2 trilh�es
		 * long  = casa dos quintilh�es
		 * 
		 * float = n�meros decimais, at� cinco casas
		 * double= possui o dobro de precis�o em rela��o ao float.
		 * 
		 * Classes Wrapper - S�o classes que servem para apoiar os tipos primitivos
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
