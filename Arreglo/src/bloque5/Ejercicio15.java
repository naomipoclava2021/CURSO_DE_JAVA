package bloque5;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio15: Leer 10 enteros ordenados crecientemente. Leer N Y buscarlo
		 * en la tabla. Se debe mostrar la posicion en que se encuentra. Si no esta,
		 * indicarlo con un mensaje.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		boolean creciente = true;
		
		int arreglo[] = new int[10];

		
		do {
			// Pedimos el arreglo
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " Digite un numero: ");
				arreglo[i] = entrada.nextInt();
			}
			// Comprobamos si el arreglo esta ordenado
			for (int i = 0; i < 9; i++) {
				if (arreglo[i] < arreglo[i + 1]) {// Creciente 1-2-3-4
					creciente = true;
				}
				if (arreglo[i] > arreglo[i + 1]) {// decreciente 5-4-3-2-1
					creciente = false;
					break;
				}
			}
			
			if (creciente==false) {
				System.out.println("\nEl arreglo esta desordenado, vuelva a digitar: ");
			}
		} while (creciente == false);
		
		//Pedimos el numero a buscar
		System.out.print("\nDigite el numero a buscar: ");
		numero = entrada.nextInt();
		
		//Buscamos el numero en el arreglo
		
		int i=0; 
		//1-2-3-4-5..-10
		while(i<10 && arreglo[i]<numero) {
			i++;
		}
		
		if(i==10) { //Hemos recorrido todo el arreglo y no ecotramos nada
			System.out.println("\n numero no encontrado");
		} else {
			if(arreglo[i] == numero) {
				System.out.println("\nNumero ha sido encontrado, en la posicion: "+i);
			} else {
				System.out.println("\nNumero no Encontrado");
			}
		}

	}

}
