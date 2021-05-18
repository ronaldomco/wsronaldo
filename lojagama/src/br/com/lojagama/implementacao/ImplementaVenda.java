package br.com.lojagama.implementacao;

import javax.swing.JOptionPane;

import br.com.lojagama.modelo.Cliente;
import br.com.lojagama.modelo.Endereco;
import br.com.lojagama.modelo.Pagamento;
import br.com.lojagama.modelo.Produto;
import br.com.lojagama.modelo.Venda;

public class ImplementaVenda {
	
	public static void main(String[] args) {
		Venda venda = new Venda();
		venda = new Venda(
				1,
				"04/11/1965",
				new Cliente("Ronaldo",
							"ronaldo@yahoo",
							"94149-1875",
							new Endereco(
								"Rua Inacio",
								"Jardim Esther",
								"São Paulo",
								"SP",
								"12345-321",
								"100",
								"Apto 123"
							)
						),
				new Produto(
							100,
							"Jaca",
							5.90,
							15.30,
							100
						),
				new Pagamento(
						50.0,
						"Cartão de Crédito",
						"12/05/2021"
						),
				100.00
				);
				
				System.out.println(venda.getResumo());
				System.out.println("Estoque: " +venda.getProduto().verificaEstoque());
				System.out.println("Venda: " + venda.getProduto().getValorVenda());
				System.out.println("Compra: " + venda.getProduto().getValorCompra());

	}
}
