package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
		
		String email = "RonaldoMCO@yahoo.COM.Br";
		System.out.println("Original.: " + email);
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Qtde de Caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Qual a posi??o: " + email.indexOf("@"));
		System.out.println("Do 3o at? o 5o caracter: " + email.substring(2,5)); 
		// pesquisa pos 2 at? 4, a ?ltima n?o se inclui
		System.out.println("Do 3o at? o fim: " + email.substring(2));
		// pesquisa da posica??o 2 at? o final, quando omitir o 2o argumento do m?todo
		System.out.println("Primeira metade do email: " + email.substring(0, email.length()/2));
		System.out.println("Usu?rio: " + email.substring(0, email.indexOf("@")));
		System.out.println("Usu?rio: " + email.substring(0, email.indexOf("@")).toLowerCase());
		System.out.println("Servidor : " + email.substring(email.indexOf("@")+1));
		System.out.println("Servidor : " + email.substring(email.indexOf("@")+1).toLowerCase());
		System.out.println("Primeiro caracter: " + email.charAt(0));
		// System.out.println("?ltimo caracter: " + email.charAt(email.length()-1));
		System.out.println("Compara??o " + email.contentEquals("RonaldoMCO@yahoo.COM.Br"));
		
		
	}

}