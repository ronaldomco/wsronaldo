package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {

		/*
		 * Capturarem:
		 * - nome da disciplina
		 * - primeira nota
		 * segunda nota
		 * calcular a media
		 * exibir a m�dia
		 * Reprovado para m�dia menor que 4
		 * Tem chance no exame se m�dia entre 5.9 e 4
		 */

		String disciplina = JOptionPane.showInputDialog("Digite a Disciplina");
		double primeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
		double segundaNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
		double media = (primeiraNota + segundaNota) / 2;

		if (media >=6)	{
			// && ==> and
			// || ==> or
			System.out.println("Voc� foi aprovado na Discplina: " + disciplina);
		}

		else if (media < 4) {
			System.out.println("Voc� foi reprovado na Disciplina: " + disciplina);
		}

		else {
			System.out.println("Voc� est� de exame na Disciplina: " + disciplina);
		}

		System.out.println("Sua media foi: " + media);


	}

}
