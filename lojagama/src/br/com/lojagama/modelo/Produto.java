package br.com.lojagama.modelo;

public class Produto {

	private int id;
	private String descricao;
	private double valorCompra;
	private double valorVenda;
	private int qtde;

	public Produto() {}

	public Produto(int id, String descricao, double valorCompra, double valorVenda, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.qtde = qtde;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorCompra=" + valorCompra + ", valorVenda="
				+ valorVenda + "]";
	}


	public String verificaEstoque() {
		
		
		if (qtde < 5) {
			return "Estoque Baixo";
		}else if (qtde >4 && qtde < 10) {
			return "Estoque Médio";
		}else 
			return "Estoque Alto";
	}

	public double totalVenda() {
		return (qtde * valorVenda);
	}

	public void atualizaValores(float porc) {
		valorCompra = valorCompra + valorCompra * (porc/100);
		valorVenda =  valorVenda + valorVenda * (porc/100);
	}



}
