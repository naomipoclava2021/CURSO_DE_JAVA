package bloque5;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio10: Crear un programa que lea por teclado una tabla de 10 numeros enteros 
		 * y desplace N posiciones en el arreglo (N es digitado por el usuario).
		 */
		Scanner entrada = new Scanner(System.in);
		
		int arreglo[] = new int[10]; //Tabla de 10 elementos
		int n_posiciones, ultimo;
		
		System.out.println("Llenar arreglo");
		
		for (int i = 0; i<10; i++) {
			System.out.print(i+" Digite un numero: ");
			arreglo[i] = entrada.nextInt();
		}
		
		System.out.print("Digite la cantidad de posiciones a dezplazar: ");
		n_posiciones = entrada.nextInt();
		
		for (int vuelta =1; vuelta<=n_posiciones; vuelta++) {
			ultimo = arreglo[9]; //Guardamo el ultimo elemento del arreglo
			for (int i =8; i>=0; i--) {
				arreglo[i+1] = arreglo[i];
			}
			arreglo[0] = ultimo; //ponemos el ultimo elmento como primero
		}
		
		System.out.println("\nEl arreglo resultante es : ");
		for (int i =0; i<10; i++) {
			System.out.println(i+ ". Elemento: "+ arreglo[i]);
		}
		
		entrada.close();

	}

}
