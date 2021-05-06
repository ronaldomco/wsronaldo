package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {

		String email = JOptionPane.showInputDialog("Digite o email").toUpperCase();
		while (email.contains("@") == false) {
			email = JOptionPane.showInputDialog("Digite o email com @").toUpperCase();

		}
		System.out.println("usuário: " + email.substring(0, email.indexOf("@")));

		
		String nome = JOptionPane.showInputDialog("Digite o nome:").toUpperCase();
		while (nome.length() <= 3 || nome.length() >=15) {
			email = JOptionPane.showInputDialog("Nome precisa ser maior que 3 caracteres e menor de 15 caracteres").toUpperCase();
		}
		System.out.println("Nome: " + nome);
		
		

	}
}
