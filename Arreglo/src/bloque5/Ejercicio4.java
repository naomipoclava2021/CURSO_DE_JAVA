package bloque5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio4: Leer 10 numeros enteros, guardarlos en un arreglo. Demos mostrarlo
		 * en el siguiente orden: el primero, el ulltimo, el segundo, le penultimo, el tercero;
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int numero[] = new int[10];
		
		System.out.println("Guardar numeros en el arreglo");
		
		for(int i =0; i<10; i++) {
			System.out.print((i+1) + " Digite un numero: ");
			numero[i] = entrada.nextInt();
		}
		
		System.out.println("Mostrar en forma ordenada");
		for (int i=0; i<10; i++) {
			System.out.print(numero[i]+ " ");
		}
		System.out.println();
		
		System.out.println("El resultado es: ");
		
		for(int i =0; i<5; i++) {
			System.out.print(numero[i]+ " ");//el primero
			System.out.print(numero[9-i]+ " ");//el ultimo
			
		}
		System.out.println();
		
	
		
		
		entrada.close();
	}

}
