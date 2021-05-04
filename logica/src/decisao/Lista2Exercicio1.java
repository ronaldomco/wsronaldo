package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		double valorDiaria = 80.00;
		int diarias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de diárias"));
		
		if (diarias > 15) {
			double valorConta = (valorDiaria + 5.50) * diarias;
			System.out.println("O valor de sua conta é de = " + valorConta);
		}
		else {
			if (diarias == 15) {
				double valorConta = (valorDiaria + 6.00) * diarias;
				System.out.println("O valor de sua conta é de = " + valorConta);
			}
			else {
				double valorConta = (valorDiaria + 8.00) * diarias;
				System.out.println("O valor de sua conta é de = " + valorConta);
			}
		}
	}

}
