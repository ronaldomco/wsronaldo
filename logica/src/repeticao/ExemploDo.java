package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {

		do {
			float salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Sal�rio"));
			float valorExtras = Float.parseFloat(JOptionPane.showInputDialog("Valor Extras"));
			float fgts = (salarioBruto + valorExtras) * (float) 0.08;
			System.out.println("Sal�rio Bruto: " + (salarioBruto + valorExtras));
			System.out.println("FGTS: " + fgts);
		}   while(JOptionPane.showConfirmDialog(null,  "Continuar?", "T�tulo", JOptionPane.YES_NO_CANCEL_OPTION)==0);

	}
}



