package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1o n�mero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2o n�mero"));
		String operacao = JOptionPane.showInputDialog("Digite a operacao");
		//char operacao = JOptionPane.showInputDialog("").charAt(0);
		int resultado = 0;
		
		if (operacao.contains("+")) {
			resultado = num1 + num2;
			
		}
		else if (operacao.contains("-")){
			resultado = num1 - num2;
			
		}
		else if (operacao.contains("*")){
			resultado = num1 * num2;
			
		}
		else if (operacao.contains("/")){
			resultado = num1 / num2;
			
		}
		else {
			System.out.println("Opera��o indevida");
		}
		System.out.println("Resultado da Operacao = " + resultado);
	}
}
