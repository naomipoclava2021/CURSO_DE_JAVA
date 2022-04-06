package bloque3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 8: Pedir un numero entre 0 y 99999 y decir cuantas cifras tiene.
		 */

		Scanner ingreso = new Scanner(System.in);

		int numero;

		System.out.println("Ingresar un numero en un rango del 0-99999: ");
		numero = ingreso.nextInt();

		if (numero >= 0 && numero <= 99999) {
			if (numero <= 9) {
				System.out.println("El numero tiene 1 cifra");
			} else if (numero <= 99) {
				System.out.println("El numero tiene 2 cifras");
			} else if (numero <= 999) {
				System.out.println("El numero tiene 3 cifras");
			} else if (numero <= 9999) {
				System.out.println("El numero tiene 4 cifras");
			} else if (numero <= 99999) {
				System.out.println("El numero tiene 5 cifras");
			} else {
				System.out.println("No se encuentra en el rango pedido");
			}

		} else {
			System.out.println("Tiene que ser mayor que 0 y menor 99999");
		}

		ingreso.close();

	}

}
