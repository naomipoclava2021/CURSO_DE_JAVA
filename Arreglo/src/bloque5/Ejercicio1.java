package bloque5;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio1: Leer 5 numeros, gurardarlos en un arreglo y mostrarlos en el mismo
		 * orden introducido;
		 */
		Scanner entrada = new Scanner(System.in);
		float numero[] = new float[5];
		
		
		System.out.println("Guardado datos en el arreglo");
		
		for (int i =0; i<5; i++) {
			System.out.print((i+1)+" Digite un numero: ");
			numero[i] = entrada.nextFloat();
		}
		
		System.out.println("\nImprimir los elementos del arreglo");
		
		for (float elemento : numero) {
			System.out.println(elemento);
		}
		
		entrada.close();

	}

}
