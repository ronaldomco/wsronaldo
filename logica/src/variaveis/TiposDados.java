package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		//metodo JOptionPane.showInputDialog  ==> Receber dados do Console
		//CTRL + SHIFT + O  ==> Atalho de import
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		// Integer.parseInt  ==> converter a saida do showInputDialog para Int
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		double imc = peso / (altura * altura);
		
		System.out.println("Nome..: " + nome);
		System.out.println("Idade.: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso..: " + peso);
		System.out.println("IMC...: " + imc);





	}

}
