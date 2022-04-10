package bloque4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio3: Leer numeros hasta que se introduzca un 0. Para cada uno indicar
		 * si es par o impar.
		 */

		Scanner entrada = new Scanner(System.in);
		int numero;

		System.out.println("Ingresar un numero: ");
		numero = entrada.nextInt();

		while (numero != 0) {
			if (numero % 2 == 0) {
				System.out.println("el numero " + numero + " es par");
			} else {
				System.out.println("el numero " + numero + " es impar");
			}
			System.out.println("Ingresar otro numero: ");
			numero = entrada.nextInt();
		}
		entrada.close();

	}

}
