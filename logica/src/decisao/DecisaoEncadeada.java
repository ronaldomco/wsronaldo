package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		/*
		 * Solicitem as faltas
		 * Para que o aluno esteja aprovada, a quantidade de falta menor que 20
		 * e a nota maior ou igual a 6
		 * 
		 * - primeira nota
		 * segunda nota
		 * calcular a media
		 * exibir a m�dia
		 * Reprovado para m�dia menor que 4
		 * Tem chance no exame se m�dia entre 5.9 e 4
		 */

		//String disciplina = JOptionPane.showInputDialog("Digite a Disciplina");
		double falta = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de faltas:"));
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota:"));
		
		if (nota >=6 && falta < 20)	{
			// && ==> and
			// || ==> or
			System.out.println("Voc� foi aprovado na Discplina: ");
		}
		else if (nota < 4 || falta >=20) {
			System.out.println("Voc� foi reprovado na disciplina");
		}
		else {
			System.out.println("Voc� est� de exame");
		}

	

	}

}
