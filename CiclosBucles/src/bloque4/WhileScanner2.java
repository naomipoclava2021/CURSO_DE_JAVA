package bloque4;

import javax.swing.JOptionPane;

public class WhileScanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, i;

		i = 1;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero: "));

		while (i <= numero) {
			System.out.println(i);
			i++;

		}

	}

}
