package bloque4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ejercicio10 Pedir 10 numeros y escribir la  suma total.
		 */

		Scanner entrada = new Scanner(System.in);

		int numero, suma = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Ingresa un numero: ");
			numero = entrada.nextInt();
			suma += numero;//suma iterativa
		}
		System.out.println("El resultado de la suma es: "+ suma);
		entrada.close();

	}

}
