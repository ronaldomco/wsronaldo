package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {

		/*
		 * O jogador1 ir� digitar um n�mero.
		 * Caber� ao jogador2 descobrir qual foi o n�mero digitado pelo jogador1
		 * Primeira miss�o:
		 * - fazer com que a aplica��o pergunte o n�mero para o jogador2, enquanto ele n�o acertar
		 * o n�mero, e quando acertar, exibir a mensagem de Parab�ns.
		 * 
		 * Segunda miss�o:
		 * - ap�s o jagador2 chutar o n�mero, voc� deve exibir para ele uma dica, informando se o n�mero digitado pelo 
		 * jogador1 � maior ou menor que o n�mero que ele digitou.
		 * 
		 * Terceira miss�o:
		 * - Quando o jogador2 acertar, junto com a mensaasgem de parab�ns dever� exibir quantas tentativas ele utilizou
		 * at� acertar o n�mero (dica: ter� que utilizar uma vari�vel para contar)
		 * 
		 */

		int numJogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador1, digite seu n�mero:"));
		int numJogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2, digite seu n�mero:"));
		int count = 0;

		if (numJogador2 == numJogador1) {
			count = count + 1;
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou o n�mero digitado pelo Jogador1 de primeira");
			System.out.println("Parab�ns, voc� acertou o n�mero digitado pelo Jogador1 de primeira");
		}
		else {
			do {
				if (numJogador2 < numJogador1) {
					System.out.println("Numero do Jogador1 � maior");

				}else if (numJogador2 > numJogador1){
					System.out.println("Numero do Jogador1 � menor");
				}
				numJogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador2, digite novamente o seu n�mero:"));
				count = count +1;
				if (numJogador2 == numJogador1) {
					count = count +1;
					System.out.println("Parab�ns, voc� acertou o n�mero digitado pelo Jogador1 em " + count + "vezes");
				} 


			} while (numJogador2 != numJogador1);
		}


	}
}

