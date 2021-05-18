package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class TesteLista {

	/*
	 * Caracter�sticas da Collection List
	 * - tamanho � din�mico
	 * - n�o h� necessidade de qualquer recurso para controlar o indice
	 * - os dados pode ser heterog�neos
	 * - podemos eliminar posi��es em execu��o
	 */

	public static void main(String[] args) {
		// Tr�s tipos de cole��es
		// List, Queue e Set
		
		
		List<String> lista = new ArrayList<String>();
		// List � pai do ArrayList
		// <> � sinal de generics
		do{
			lista.add(JOptionPane.showInputDialog("Digite um cargo"));
		}while(JOptionPane.showConfirmDialog(null, "?","",JOptionPane.YES_NO_OPTION)==0);
		
		
		System.out.println((lista));
		System.out.println("Primeiro: " + lista.get(0));
		lista.remove(0);
		System.out.println("Depois de remover" + lista);
		
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		for (int contador=0;contador<lista.size();contador++)
			System.out.println("Cargo: " + lista.get(contador));
		
		
	}
}
