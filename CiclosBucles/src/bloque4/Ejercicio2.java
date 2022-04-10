package bloque4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio2: Leer un numero e indicar si es positivo o negativo. El proceso se repitira
		 * hasta que se introduzca un 0.
		 */
		
		Scanner ingreso = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Ingresa un numero: ");
		numero = ingreso.nextInt();
		
		while (numero !=0) {
			if (numero > 0) {
				System.out.println("El numero "+ numero+ " es positivo");
			} else if (numero <0) {
				System.out.println("El numero " + numero+ " es negativo");
			}
			System.out.println("Ingresa otro numero: ");
			numero = ingreso.nextInt();
			
		}
		ingreso.close();

	}

}
