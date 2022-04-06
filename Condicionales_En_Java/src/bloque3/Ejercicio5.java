package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 5 : Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiete manera: 
		 *
		 *Si trabaja 40 horas o menos se le paga $16 por hora.
		 *
		 *Si trabaja mas de 40 horas se la paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
		 *
		 */
		
		int horasTrabajadas;
		double salarioSemanal;
		
		horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas horas trabajaste en la semana: ?"));
		
		if (horasTrabajadas <=40) {
			salarioSemanal = horasTrabajadas * 16;
			
		}else {
			salarioSemanal = (40 * 16) + ((horasTrabajadas - 40)*20);
				
		}
		JOptionPane.showConfirmDialog(null, salarioSemanal);
	}

}
