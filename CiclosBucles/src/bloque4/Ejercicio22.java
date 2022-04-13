package bloque4;

import javax.swing.JOptionPane;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio22: Pedir 5 calificaciones de alumnos y decir al final si hay alguno suspenso.
		 */
		
		float calificaciones;
		boolean suspensos = false;
		
		for (int i =1; i<=5; i++) {
			do {
				calificaciones = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+ i+ "\nIngrese su nota: "));
			} while(calificaciones<0 || calificaciones>10);
			
			if (calificaciones < 5) {
				suspensos = true;
			}
		}
		
		if (suspensos == true) {
			System.out.println("Si existen alumnos suspensos");
		} else {
			System.out.println("No hay alumnos suspensos");
		}

	}

}
