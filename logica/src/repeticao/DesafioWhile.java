package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		
		/*
		 * Capturar Dia, M�s e Ano em vari�veis diferentes
		 * Valide o dia para que ele esteja entre 1 e 30 ou 1 e 31 ou 1 e 29
		 * Valide o m�s para que esteja entre 1 e 12
		 * Valide o ano para que seja menor que 2003 e maior que 1952
		 * Final: exibir a data completa
		 * 
		 * valida ano, mes e dia (na ordem)
		 */
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano (aaaa)"));
		while (ano <= 1952 || ano >= 2003) {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Ano incorreto, favor digitar de 1952 at� 2003"));
		}
		System.out.println("Ano: " + ano );
		

		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s (mm)"));
		while (mes < 1 || mes > 12) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o m�s (mm) de 01 a 12"));
		}
		System.out.println("M�s : " + mes );
		
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o Dia (dd)"));
		while (dia < 1 || dia > 31) {
			
			dia = Integer.parseInt(JOptionPane.showInputDialog("Dia incorreto para o dia"));
			if (mes == 02) {
				if (dia > 29) {
					System.out.println("Dia incorreto para o m�s");
				}
			}
			// corrigir critica para m�s 30 e 31
			
				
			System.out.println("Dia incorreto, favor digitar de 01 a 31");
		}
		System.out.println("Dia : " + dia );
		System.out.println(" Data Informada : " + dia + "/" + mes + "/" + ano);
			
		

		
		
		
		
		
		
	}

}
