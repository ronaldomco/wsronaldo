package repeticao;

import javax.swing.JOptionPane;

public class DificilDoWhile {

	public static void main(String[] args) {
		/*
		 * Monte um programa que solicite a idade e o nome das pessoas. 
		 * A aplica��o continuar� perguntando nome e idade enquanto o usu�rio afirmar que deseja continuar.
		 * Ao terminar, a aplica��o dever� exibir:
		 * - a quantidade de pessoas maiores de idade e
		 * - a m�dia entre todas as idades que foram digitadas.
		 * - a pessoa mais experiente (nome e idade)
		 * - a pessoa mais jovem (nome e idade)
		 */

		String nome = "";
		String nomeExperiente = "";
		String nomeJovem = "";
		int idade = 0;
		int countIdade = 0;
		int maiorIdade = 0;
		int jovemIdade = 0;
		int countDig = 0;
		double mediaIdades = 0.0;


		do {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade:"));
			nome  = JOptionPane.showInputDialog("Digite o Nome: ").toUpperCase();
			countIdade +=idade;
			countDig +=1;
			if (idade >= 18) {
				countIdade ++;
			}
			if (idade > maiorIdade) {
				maiorIdade = idade;
				nomeExperiente = nome;
			}else if (idade < jovemIdade) {
				jovemIdade = idade;
				nomeJovem = nome;
			}
		} while(JOptionPane.showConfirmDialog(null,  "Continuar?", "T�tulo", JOptionPane.YES_NO_OPTION)==0);
		mediaIdades = countIdade / countDig;

		System.out.println("Quantidade de pessoas com maior idade : " + countIdade);
		System.out.println("M�dia entre todas as Idades digitadas : " + mediaIdades);
		System.out.println("A pessoa mais experiente Nome.........: " + nomeExperiente + " Idade: " + maiorIdade);
		System.out.println("A pessoa mais jovem Nome..............: " + nomeJovem + "Idade: " + jovemIdade);


	}
}
