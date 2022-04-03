package bloque3;

import javax.swing.JOptionPane;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, dato = 5;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));

		if (numero == dato) {
			JOptionPane.showMessageDialog(null, "son iguales");
		} else {
			JOptionPane.showMessageDialog(null, "No son igules");
		}

	}

}
