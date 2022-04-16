package bloque5;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio8: Diseñar una aplicacion que declare una tabla de 10 elementos enteros.
		 * Leer mediante teclado 8 numeros. Despues se debe pedir un numero y una posicion,
		 * insertarlo en la posicion indicada, desplazando los que estan detras.
		 */
		
		Scanner ingreso = new Scanner(System.in);
		int numero, posicion;
		
		int vector[] = new int[10];//Cramos el arreglo de 10 elementos enteros
		
		System.out.println("Llenamos el arreglo");
		for (int i =0; i<8; i++) {
			System.out.print((i+1)+ " Digite un numero: ");
			vector[i] = ingreso.nextInt();
		}
		
		System.out.println("\nDigite un numero: ");
		numero = ingreso.nextInt();
		System.out.println("\nDigite una posicion: ");
		posicion = ingreso.nextInt();
		
		
		//Correr una posicion los elementos detras de la posicion que el usuario quiere
		
		for(int i=7; i>=posicion; i--) {//1-2-3-numero-4-5-6
			vector[i+1] = vector[i];
		}
		
		vector[posicion] = numero;//Insertamos el numero en la posicion requerida
		System.out.println("El nuevo arreglo es: ");
		
		for (int i = 0; i<9; i++) {
			System.out.println("Posicion "+i+ ": "+vector[i]);
		}
		
		ingreso.close();
	}

}
