package bloque4;

import javax.swing.JOptionPane;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio19: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados
		 * (=4) y suspensos.
		 * 
		 */
		
		float nota;
		int aprobados =0, condicionados=0, suspensos=0;
		
		for (int i =1; i<=6; i++) {
			do {
				nota = Float.parseFloat(JOptionPane.showInputDialog("Nota "+ i+ "\nIngrese su nota"));
			} while (nota<1|| nota>10);
			
			if (nota==4) {//nota igual a 4
				condicionados++;
			} else if (nota >=5) {
				aprobados++;
			} else {
				suspensos++;
			}
		}
		System.out.println("Cantidad de aprobados: "+ aprobados);
		System.out.println("Cantidad de condicionados: "+ condicionados);
		System.out.println("Cantidad de suspensos: "+ suspensos);
		

	}

}
