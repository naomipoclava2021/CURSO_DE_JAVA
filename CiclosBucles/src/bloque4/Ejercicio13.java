package bloque4;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio13: Pedir 10 numeros. Mostrar la media de los numeros negativos y la cantidad
		 * de ceros.
		 */
		
		int numero, suma =0;
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
			suma+=numero;
			System.out.println(numero);
		} while (numero !=0);
		
		

	}

}
