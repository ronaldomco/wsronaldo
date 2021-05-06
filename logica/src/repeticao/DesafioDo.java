package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {

		/*
		 * O jogador1 irá digitar um número.
		 * Caberá ao jogador2 descobrir qual foi o número digitado pelo jogador1
		 * Primeira missão:
		 * - fazer com que a aplicação pergunte o número para o jogador2, enquanto ele não acertar
		 * o número, e quando acertar, exibir a mensagem de Parabéns.
		 * 
		 * Segunda missão:
		 * - após o jagador2 chutar o número, você deve exibir para ele uma dica, informando se o número digitado pelo 
		 * jogador1 é maior ou menor que o número que ele digitou.
		 * 
		 * Terceira missão:
		 * - Quando o jogador2 acertar, junto com a mensaasgem de parabéns deverá exibir quantas tentativas ele utilizou
		 * até acertar o número (dica: terá que utilizar uma variável para contar)
		 * 
		 */

		int numJogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador1, digite seu número:"));
		int numJogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2, digite seu número:"));
		int count = 0;

		if (numJogador2 == numJogador1) {
			count = count + 1;
			JOptionPane.showMessageDialog(null, "Parabéns, você acertou o número digitado pelo Jogador1 de primeira");
			System.out.println("Parabéns, você acertou o número digitado pelo Jogador1 de primeira");
		}
		else {
			do {
				if (numJogador2 < numJogador1) {
					System.out.println("Numero do Jogador1 é maior");

				}else if (numJogador2 > numJogador1){
					System.out.println("Numero do Jogador1 é menor");
				}
				numJogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2, digite novamente o seu número:"));
				count = count +1;
				if (numJogador2 == numJogador1) {
					count = count +1;
					System.out.println("Parabéns, você acertou o número digitado pelo Jogador1 em " + count + "vezes");
				} 


			} while (numJogador2 != numJogador1);
		}


	}
}

