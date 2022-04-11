package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio1 Hacer un programa que lea un numero entero y muestre si el numero
		// es multiplo de 10.

		int num;

		num = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));

		JOptionPane.showMessageDialog(null, (num % 10 == 0) ? "Es multiplo " + num : "No es mutiplo " + num);

	}

}
