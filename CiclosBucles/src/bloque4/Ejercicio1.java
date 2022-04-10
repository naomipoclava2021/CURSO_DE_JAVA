package bloque4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * Ejercicio1: Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se 
		 * se introduzcan numeros negativos.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int base, cuadrado;
		
		System.out.println("Ingresar un numero: ");
		base = entrada.nextInt();
		
		while (base>=0) {
			cuadrado = (int)Math.pow(base, 2);
			System.out.println("La base "+ base+ " elevado al cuadrado es : "+ cuadrado);
			System.out.println("Ingrese otro numero: ");
			base = entrada.nextInt();
		}
		entrada.close();

	}

}
