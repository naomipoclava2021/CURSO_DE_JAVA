package bloque5;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejecicio11: Leer 5 elementos numericos que se introduciran ordenados de forma creciente.
		 * Estos los guardaremos en una tabla de tamaño 10. Leer un numero N, e insertalo en el
		 * lugar adecuado para que la tabla continue ordenada.
		 */
		
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		boolean creciente = true;
		int numero, sitio_num =0, j=0;
		
		System.out.println("Llenar el arreglo");
		
		do {
			//Llenado el arreglo
			for (int i=0; i<5; i++) {
				System.out.print((i+1)+ " Digite un numero: ");
				arreglo[i] = entrada.nextInt();
			}
			//Comprobar si el arreglo esta ordenado en orden creciente
			for (int i =0; i<4; i++) {
				if(arreglo[i]<arreglo[i+1]) { //Creciente
					creciente = true;
				}
				
				if(arreglo[i]>arreglo[i+1]) { //Decreciente
					creciente = false;
					break;
				}
			}
			if (creciente == false) {
				System.out.println("\nEl arreglo no esta ordenado es forma creciente, vuelva a digitar: \n");
			}
		}while(creciente==false);
		
		System.out.print("\nDigite un elemento a insertar: ");
		numero = entrada.nextInt();
		
		//Esto es para darnos cuenta en que posicion va el numero
		while(arreglo[j]<numero && j<5) {
			sitio_num++;
			j++;
		}
		
		//Por ultimo, trasladamos una posicion en el arreglo que van detras de numero
		
		for (int i=4; i>=sitio_num; i--) {
			arreglo[i+1] = arreglo[i];
		}
		
		//Insertamos el numero que el usuario paso
		arreglo[sitio_num] = numero;
		
		System.out.print("\nEl arreglo queda: ");
		for (int i =0; i<6; i++) {
			System.out.print(arreglo[i]+ " - ");
		}
		System.out.println();
		
		entrada.close();
	}

}
