package br.com.bankofos.implementacao;

import br.com.bankofos.modelo.Agencia;
import br.com.bankofos.modelo.Cliente;
import br.com.bankofos.modelo.Conta;
import br.com.bankofos.modelo.Corrente;
import br.com.bankofos.modelo.Endereco;
import br.com.bankofos.modelo.Poupanca;
import br.com.bankofos.util.Magic;


public class TesteConta {

	public static void main(String[] args) {
		
		Cliente cli = new Cliente(
				"Ronaldo",
				"ronaldo@gmail",
				"91234-1234",
				new Endereco()
				);
		
		Agencia agencia = new Agencia (
				"Matriz",
				0123,
				"91234-1234"
				);
		
		
		double saldo = Magic.d("Slado");
		int numero = Magic.i("numero");
		char resposta = Magic.s("Digite Tipo da Conta que deseja abrir:  '1' Corrente ou '2' para Poupança").charAt(0);
		
		if  (resposta == '1') {
			Conta conta = new Corrente(
					numero,
					saldo,
					cli,
					agencia,
					Magic.d("Limite"),
					Magic.d("Taxa")
					);
			
			
		}else if (resposta=='2' ) {
			conta = new Poupanca();
			
		}else {
			System.out.println("Opção inválida");
		}
		

		
		
		
		
		
		

	}

}
