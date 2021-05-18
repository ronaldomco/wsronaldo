package br.com.excecao.teste;

import javax.swing.JOptionPane;

import br.com.excecao.excecoes.MinhaExcecao;

public class TesteExcecao {

	public static void main(String[] args) {
		
		// Exceções UnChecked (DC) = Depois da Compilação
		// Exceções Checked (AC) = Antes da Compilação

		try {
			/*int numero = Integer.parseInt("A");
			System.out.println("Número: " + numero);
			
			String palavra = " ";
			System.out.println("Qtde Letras: " + palavra.length());
			
			int numeros[] = new int[2];
			numeros[0] = 150;
			numeros[1] = 23;
			numeros[2] = 10;
		*/
			String palavras[] = new String[10];
			int indice =0;
			do {
				palavras[indice] = JOptionPane.showInputDialog("Digite uma palavra");
				indice++;
			}while(JOptionPane.showConfirmDialog
					(null, "Continuar?", "Vetores", JOptionPane.YES_NO_OPTION)==0);
			
			System.out.println(palavras);
			for (int contador=0;contador<indice;contador++) {
				System.out.println("Palavra No" + (contador+1) + ": " + palavras[contador]);
				
			}
			
			
		}catch(Exception e) {
			System.out.println(MinhaExcecao.tratar(e));
			//e.printStackTrace();
			
		}finally {
			System.out.println("Volte sempre");
		}

	}


}
