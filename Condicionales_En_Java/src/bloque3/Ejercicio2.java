package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio2 Pedir dos numeros y decir cual es el mayor o si son igules.

		int num1, num2;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer valor: "));

		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo valor: "));

		if (num1 == num2) {
			JOptionPane.showMessageDialog(null, "son igules");
		} else {
			if (num1 > num2) {
				JOptionPane.showMessageDialog(null, "el primer numero es mas grande " + num1);
			} else {
				JOptionPane.showMessageDialog(null, "el segundo numero es mas grande " + num2);
			}
		}

	}

}
