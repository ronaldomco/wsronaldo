package variaveis;

import javax.swing.JOptionPane;

public class TiposDadosDesafio {
	
	public static void main(String[] args) {
		/* 
		 * Capturem: o nome de um produto, o valor de compra, e a quantidade.
		 * Sobre o valor de compra considerem um lucro de 20% para obterem o valor de venda
		 * Calcule o total considerando o valor de venda e quantidade
		 * Sobre o total acima calcule 22% de impostos
		 * No final exibir:
		 * O nome do produto
		 * O valor de venda
		 * O Total sem impostos
		 */
		
		String nomeProduto = JOptionPane.showInputDialog("Digite o Produto");	
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor de Compra"));
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		 
		double valorCompra = valor * quantidade;
		double valorVenda = valorCompra * 1.20;
		double imposto = valorVenda * 0.22;
		
		System.out.println("Nome do Produto.....: " + nomeProduto);
		System.out.println("Valor de Compra.....: " + valorCompra);
		System.out.println("Valor de Venda......: " + valorVenda);
		System.out.println("Total sem Imposto...: " + imposto);
		
		
		
	}

}
