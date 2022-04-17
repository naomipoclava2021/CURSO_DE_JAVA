package bloque5;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio9: Crear un programa que lea por teclado una tabla de 10 numeros enteros y
		 * la desplace una posicion hacia abajo: el primero pasa a ser el segundo, el segundo
		 * pasa ser el tercero y asi sucesivamente. El utimo pasa a ser el primero.
		 */
		Scanner entrada = new Scanner(System.in);
		
		int ultimo; 
		
		int arreglo[] =  new int[10]; //Creamos el arreglo de 10 elementos enteros
		
		System.out.println("Llenamos el arreglo");
		
		for (int i =0; i<10; i++) {
			System.out.print(i+" Digite un numero: ");
			arreglo[i] = entrada.nextInt();
		}
		
		ultimo = arreglo[9]; //guardamos el ultimo elemento del arreglo
		
		for (int i =8; i>=0; i--) {//1-2-4-5-6-7-8-9
			arreglo[i+1] = arreglo[i];
		}
		
		arreglo[0] = ultimo;//Ponemos el ultimo elemento como primero.
		System.out.println("\nEl nuevo arreglo es: ");
		
		for (int i =0; i<10; i++) {
			System.out.println(i	+ " Numero: "+ arreglo[i]);
			
		}
		
		entrada.close();

	}

}
