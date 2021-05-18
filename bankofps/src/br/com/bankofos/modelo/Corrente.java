package br.com.bankofos.modelo;

public class Corrente extends Conta {
	
	private double limite;
	private double taxa;
	
	
	
	@Override
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + ", toString()=" + super.toString() + "]";
	}

	public Corrente() {
		super();
	}
	
	public Corrente(double limite, double taxa) {
		super();
		this.limite = limite;
		this.taxa = taxa;
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double getSaldo(){
		return limite + super.getSaldo();
	}
	
	
	public void sacar(double valor) {
	
		if (getSaldo()>=valor) {
			super.setSaldo(super.getSaldo()-valor);
		}
		
	}
	
	public void debitarTaxa() {
		super.setSaldo(super.getSaldo() - taxa);
	}
	
	
	
	
	
	

}
