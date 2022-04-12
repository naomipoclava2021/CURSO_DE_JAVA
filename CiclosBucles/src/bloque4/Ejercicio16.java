package bloque4;

import javax.swing.JOptionPane;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ejercicio 16: Pide un numero (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero
		 */
		
		int numero, multiplicar;
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
		} while (numero<0 || numero>10);
		
		System.out.println("La tabla de multiplicar del numero "+ numero+ " es: ");
		
		for (int i =1; i<=12; i++) {
			multiplicar = numero*i;
			System.out.println(numero+ " * "+ i+ " = "+ multiplicar);
		}

	}

}
