package bloque4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio8: Pedir un numero N, y mostrar todos los numeros del 1 al N.
		 */
		Scanner ingresar = new Scanner(System.in);
		
		int N;
		
		System.out.println("El rango de numero comienza en 1 hasta: ");
		N= ingresar.nextInt();
		
		for (int i = 1; i<=N; i++) {
			System.out.println(i);
		}
		
		ingresar.close();

	}

}
