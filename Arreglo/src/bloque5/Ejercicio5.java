package bloque5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejericicio5: Leer por teclado dos tablas de 10 numeros enteros y mazclarlas en una
		 * tercera de la forma: el 1° de A , el 1° de B, el 2° de A, el 2° de B, etc.
		 */
		Scanner entrada = new Scanner(System.in);
		
		int a[], b[], c[];
		
		a = new int[10]; //Areglo con 10 elementos
		
		b = new int[10]; //Arreglo con 10 elamentos
		
		c = new int[20]; //Contendra al arreglo a y b;
		
		
		//Pedimos el arreglo a
		System.out.println("Digite el primer arreglo");//ingresar numeros impares
		
		for (int i =0; i<10; i++) {
			System.out.print((i+1)+ " Digite un numero: ");
			a[i] = entrada.nextInt();
		}
		
		//Pedimos el arreglo b
		System.out.println("\nDigite el segundo arreglo");//ingresar numeros pares
		for (int i =0; i<10; i++) {
			System.out.print((i+1)+ " Digite un numero: ");
			b[i] = entrada.nextInt();
		}
		System.out.println("\n");
		
		//Ahora vamos a mezclar los 2 arreglos en el arreglo c.
		//vamos a utilizar el iterador i para el arreglo a y b.
		// y el interador j para el arreglo c.
		int j =0;
		for (int i =0; i<10; i++) {
			c[j] = a[i]; //1*A
			j++;
			c[j] = b[i]; //1*B
			j++;
		}
		System.out.println("El tercer arreglo es: ");
		for (int i =0; i<20; i++) {
			System.out.print(c[i]+ " ");
		}
		System.out.println();
		
		entrada.close();
		
				
		
		
		

	}

}
