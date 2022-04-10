package bloque4;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio6: Pedir numeros hasta que se tecle un 0, mostrar la suma de todos los 
		 * numeros introducidos.
		 */
		
		int numero, suma =0;
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
			suma+=numero;// suma iterativa
	
		} while (numero !=0);
		System.out.println("El resultado de la suma es: "+ suma);

	}

}
