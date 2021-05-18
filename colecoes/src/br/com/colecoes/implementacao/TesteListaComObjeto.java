package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListaComObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		
		lista.add(new Cargo("DBA", "JR", 5000));
		lista.add(new Cargo("DEV", "JR", 4000));
		lista.add(new Cargo("Gerente de Projetos", "JR", 4500));
		lista.add(new Cargo("DBA", "SR", 15000));
		
		System.out.println("Completa:"  + lista);
		
		double total = 0;
		int contador = 0;
		int contadorDBA = 0;
		int contadorNivel = 0;
		double maiorsal = 0.0;
		String cargomaiorsal = "";
		Cargo resposta = new Cargo();
		for (Cargo objeto : lista) {
			System.out.println("Cargo: " + objeto.getNome());
			System.out.println("Nível: " + objeto.getNivel());
			System.out.println("Salário: " + objeto.getSalario());
			System.out.println("============================");
			
			total += objeto.getSalario();
			contador +=1;
			
			
			if (objeto.getNome().equals("DBA")) {
				contadorDBA +=1;
			}
			if (objeto.getNivel().equalsIgnoreCase("JR")) {
				contadorNivel +=1;
			}
			if (objeto.getSalario() > maiorsal) {
				maiorsal = objeto.getSalario();
				cargomaiorsal = objeto.getNome();
			}
			if (objeto.getSalario()>resposta.getSalario()){
				resposta=objeto;
				
			}
		}
		System.out.println("Total Salário: " + total);
		System.out.println("Média dos salarios =  " + (total/contador));
		System.out.println("Média dos salarios =  " + (total/lista.size()));
		System.out.println("Quantidade de DBAs =  " + contadorDBA);
		System.out.println("Quantidade de Nivel JR =  " + contadorNivel);
		System.out.println("Cargo com maior Salário " + cargomaiorsal);
		System.out.println("Cargo com maior Salário " + resposta);
		/*
		 * Requisição:
		 * - exibir o total de salario
		 * - exibir média dos salários
		 * - o total dos DBAs
		 * - a quantidade de cargos nível junior
		 * - o nome do cargo que possui o maior salário
		 * 
		 */
		

	}

}
