package br.com.lojagama.modelo;

public class Pagamento {
	
	private double valor;
	private String forma;
	private String data="";
	
	public Pagamento() {}

	public Pagamento(double valor, String forma, String data) {
		this.valor = valor;
		this.forma = forma;
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Pagamento [valor=" + valor + ", forma=" + forma + ", data=" + data + "]";
	}
	
	public String getDia() {
		if (data.length()>2) {
		return ("Dia do Pagamento = " + this.getData().substring(0, 2));
		}
		return "Sem data Válida";
	}
	
}
