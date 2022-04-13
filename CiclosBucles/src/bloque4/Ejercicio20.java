package bloque4;

import javax.swing.JOptionPane;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio20 Pedir un numero N, introducir N sueldos, y mostrar el sueldo maximo
		 */
		
		int numeroDeSueldo;
		float sueldo, sueldo_maximo=0;
		
		numeroDeSueldo = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos sueldos va a introducir?: "));
		
		for (int i =1; i<=numeroDeSueldo; i++) {
			sueldo = Float.parseFloat(JOptionPane.showInputDialog("Empleado N°"+i+ "\nIngrese su sueldo"));
			
			if (sueldo > sueldo_maximo) {
				sueldo_maximo = sueldo; //va cambiando su valor
			}
		}
		System.out.println("El sueldo maximo es : "+ sueldo_maximo);

	}
	

}
