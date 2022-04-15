package bloque5;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ejercicio2 Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el oreden inverso.
		 */
		
		Scanner ingreso = new Scanner(System.in);
		float numeros[] = new float[5];
		
		System.out.println("Pedir elementos");
		
		for (int i =0; i<5; i++) {
			System.out.print((i+1)+ " Digite un numero: ");
			numeros[i] = ingreso.nextFloat();
		}
		
		System.out.println("\nElemntos en orden inversos");
		
		for (int i = 4; i>=0; i-- ) {
			System.out.println(numeros[i]);
		}

	}

}
