package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		/*
		 * Pedir: Nome e Idade
		 * De acordo com as regras para vota��o no Brasil
		 * oriente o usu�rio se ele pode votar, se ele n�o pode votar ou se o voto dele � facultativo
		 */

		String nome = JOptionPane.showInputDialog("Digite o seu Nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota:"));

		if (idade < 16) {
			System.out.println(nome + " seu voto n�o � permitido");
		}
		if ((idade >= 16 && idade < 18) || idade > 70) {
			System.out.println(nome + " seu voto � facultativo");
		}
		if (idade >= 18 && idade <= 70) {
			System.out.println(nome + " seu voto � Obrigat�rio");
		}
	}
}

