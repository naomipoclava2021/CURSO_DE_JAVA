package bloque3;

import javax.swing.JOptionPane;

public class SwitchOperaciones {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int num1, num2, suma, resta, multiplicacion, division;
		char op;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));

		op = JOptionPane.showInputDialog("¿Que operacione desaa realizar?").charAt(0);

		switch (op) {
		case 'S':
		case 's':
			suma = num1 + num2;
			JOptionPane.showMessageDialog(null, suma);
			break;
		case 'R':
		case 'r':
			resta = num1 - num2;
			JOptionPane.showMessageDialog(null, resta);
			break;
		case 'P':
		case 'p':
		case 'm':
		case 'M':
			multiplicacion = num1 * num2;
			JOptionPane.showMessageDialog(null, multiplicacion);
			break;
		case 'D':
		case 'd':
			division = num1 / num2;
			JOptionPane.showMessageDialog(null, division);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Error, se equivoco de operacion");
			break;

		}
	}

}
