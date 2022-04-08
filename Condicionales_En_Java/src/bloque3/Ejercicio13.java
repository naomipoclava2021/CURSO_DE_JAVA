package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 13: Hacer un programa que simule un cajero automatico con un saldo incial de 1000 Dolares, con el siguiente
		 * menu de opciones:
		 * 1. Ingresar dinero a la cuenta,
		 * 2. Retirar dinero de la cunta
		 * 3. Salir
		 */
		final int salarioInicial = 1000;
		int opcion;
		float ingreso, nuevoSalario, retiro;
		
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a tu cuenta de cajero\n"
				+ "Selecciona con numero la operacion que deseas realizar \n"
				+ "1) Ingresar dinero a la cuenta \n"
				+ "2) Retirar dinero de la cuenta \n"
				+ "3) Salir"));
		
		switch (opcion) {
		case 1:
			ingreso = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto dinero vas a ingresar?: "));
			nuevoSalario = salarioInicial + ingreso;
			JOptionPane.showMessageDialog(null, "El saldo altual ahora es: "+ nuevoSalario); break;
		case 2:
			retiro = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto dinero vas a retirar?"));
			if (retiro > salarioInicial) {
				JOptionPane.showMessageDialog(null, "No tienes saldo suficiente"); break;
			} else {
				nuevoSalario = salarioInicial - retiro;
				JOptionPane.showMessageDialog(null,"El saldo altual ahora es: "+ nuevoSalario+ " depues del retiro" );
			}
		
		case 3:
			break;
		
		default:
			JOptionPane.showMessageDialog(null, "Error");
			break;
		}
		

	}

}
