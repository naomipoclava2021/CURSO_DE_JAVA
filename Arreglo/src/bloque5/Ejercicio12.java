package bloque5;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejecicio12: Leer por teclado una tabla de 10 elementos numericos enteros y una 
		 * posicion (entre 0 y 9). Eliminar el elemento situado en la posicion dada sin 
		 * dajar huecos.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int arreglo[] = new int[10];
		int posicion;
		
		System.out.println("Llenar el arreglo");
		
		for (int i =0; i<10; i++) {
			System.out.print(i+ " Digite un numero: ");
			arreglo[i] = entrada.nextInt();
		}
		
		//pedimos la posicion en le rango de 0-9
		do {
			System.out.println("Digite una posicion(0-9): ");
			posicion= entrada.nextInt();
		}while(posicion<0|| posicion>9);
		
		//Eliminado el elemento de la posicion indicada
		
		for (int i = posicion; i<9; i++) {
			arreglo[i] = arreglo[i+1];
			
		}
		
		System.out.println("\nEl arreglo queda: ");
		for (int i=0; i<9; i++) {
			System.out.println(i+ ". Elemento: "+ arreglo[i]);
		}
		
		entrada.close();
	}

}
