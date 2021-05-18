package br.com.lojagama.modelo;

public class Venda {
	
	private int nf;
	private String data = new String();
	private Cliente cliente = new Cliente();
	private Produto produto = new Produto();
	private Pagamento pagamento = new Pagamento();
	private double total;
	
	public Venda() {}

	public Venda(int nf, String data, Cliente cliente, Produto produto, Pagamento pagamento, double total) {
		this.nf = nf;
		this.data = data;
		this.cliente = cliente;
		this.produto = produto;
		this.pagamento = pagamento;
		this.total = total;
	}

	public int getNf() {
		return nf;
	}

	public void setNf(int nf) {
		this.nf = nf;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Venda [nf=" + nf + ", data=" + data + ", cliente=" + cliente + ", produto=" + produto + ", pagamento="
				+ pagamento + ", total=" + total + "]";
	}
	
	
	public String getResumo() {
		return ("Nome do Cliente " + cliente.getNome());
							 
	}
	
	
}
