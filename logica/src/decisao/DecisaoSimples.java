package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

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

		if (media >=6  && media <10)	{
			// && ==> and
			// || ==> or
			System.out.println("Voc� foi aprovado na Discplina: " + disciplina + "= " + media);
		}

		if (media < 4) {
			System.out.println("Voc� foi reprovado na Disciplina: " + media);
		}


		if (media >= 4 && media <6) {
			System.out.println("Voc� tem change de aprova��o: " + media);
		}

		System.out.println("Sua media foi: " + media);


	}

}
