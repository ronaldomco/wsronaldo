package repeticao;

import javax.swing.JOptionPane;

public class FacilDoWhile {

	public static void main(String[] args) {

		/*
		 * Crie um programa que pergunte ao usu�rio o seu n�vel de escolaridade (M�dio, Superior ou P�s) 
		 * enquanto a resposta for v�lida, ir� computar os totais dos n�veis digitados, 
		 * no final apresente somente o n�vel que foi mais votado.
		 */

		String escolaridade = "";
		int escMedio = 0;
		int escSuperior = 0;
		int escPos = 0;

		do {
			escolaridade = JOptionPane.showInputDialog("Digite a Escolaridade: ").toUpperCase();
			if (escolaridade.equals("MEDIO")) 
			{
				escMedio++;
				System.out.println("medio");
			}
			else if (escolaridade.equals("SUPERIOR")) 
			{
				escSuperior++;
				System.out.println("superior");
			}
			else if (escolaridade.equals("POS"))
			{
				escPos++;
				System.out.println("pos");
			};

		} while (escolaridade.equals("POS") ||
				escolaridade.equals("SUPERIOR") ||
				escolaridade.equals("MEDIO"));

		if (escMedio>escSuperior && escMedio>escPos) {
			System.out.println("M�dio: " + escMedio);
		}else if (escSuperior>escPos) {
			System.out.println("Superior: " + escSuperior);
		}else {
			System.out.println("P�s: " + escPos);
		}

		System.out.println("Digitou: " + escolaridade);


	}
}
