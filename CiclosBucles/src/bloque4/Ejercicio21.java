package bloque4;

import javax.swing.JOptionPane;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pedir 10 numeros, y mostrar al final si se ha ingroducido alguno negativo.
		 */
		int numero;
		boolean negativo =false;
		
		for (int i =1; i<=10; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
			
			if (numero<0) {
				negativo=true;
			}
		}
		
		if (negativo == true) {
			System.out.println("Si existe al menos un numero negativo");
		} else {
			System.out.println("No existen numeros negativos");
		}
		
		

	}

}
