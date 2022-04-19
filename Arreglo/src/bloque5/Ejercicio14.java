package bloque5;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * EJercicio14: Leer dos series de 10 enteros, que estaran ordenados
		 * crecientemente. Copiar (fusionar) las dos tablas en una tercera, de forma que
		 * siga ordanados.
		 */

		Scanner entrada = new Scanner(System.in);

		int a[], b[], c[];
		boolean creciente = true;

		a = new int[10];// 10 elementos para el arreglo a
		b = new int[10]; // 10 elemenot para el arreglo b
		c = new int[20]; // 20 para los dos arreglos a+b;

		System.out.println("Digite el primer arreglo");
		do {
			// Pedimos el arreglo
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " Digite un numero: ");
				a[i] = entrada.nextInt();
			}
			// Comprobamos si el arreglo esta ordenado
			for (int i = 0; i < 9; i++) {
				if (a[i] < a[i + 1]) {// Creciente 1-2-3-4
					creciente = true;
				}
				if (a[i] > a[i + 1]) {// decreciente 5-4-3-2-1
					creciente = false;
					break;
				}
			}
			
			if (creciente==false) {
				System.out.println("\nEl arreglo esta desordenado, vuelva a digitar: ");
			}
		} while (creciente == false);
		
		
		System.out.println("\nDigite el segundo arreglo");
		do {
			// Pedimos el arreglo
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " Digite un numero: ");
				b[i] = entrada.nextInt();
			}
			// Comprobamos si el arreglo esta ordenado
			for (int i = 0; i < 9; i++) {
				if (b[i] < b[i + 1]) {// Creciente 1-2-3-4
					creciente = true;
				}
				if (b[i] > b[i + 1]) {// decreciente 5-4-3-2-1
					creciente = false;
					break;
				}
			}
			
			if (creciente==false) {
				System.out.println("\nEl arreglo esta desordenado, vuelva a digitar: ");
			}
		} while (creciente == false);
		
		int i=0; //Interador i sera para el arreglo a
		int j=0; //Interador j sera para el arreglo b
		int k=0; //Interador k sera para el arreglo c
		
		while(i<10 && j<10) {
			if (a[i]< b[j]) { //Si el elemento de a es menor de b
				c[k]= a[i];  //Copiamos el elemento de a
				i++; //Avanzamos una posicion en a
			} else {
				c[k]= b[j]; //Copiamos el elemento de b
				j++; //Avanzamos una posicion en b
			}
			k++; //Avanzamos una posicion en c
		}
		
		//Cuando salimos del while es porque un arreglo (a o b), se a copiado completamente
		
		if(i==10) { //Significa que ya copiamos todo el arreglo a, falta b
			while(j<10) { //Mientras el iterador sea menor a 10
				c[k]= b[j]; //copiamos el elmento de b en c
				j++;//Avanzamos una posicion en b
				k++; //Avanzamos una posicion en c
			}
		} else { //Significa que ya copiamos todo el arreglo b, falta el a
			while(i<10) {
				c[k]= a[i];
				i++;
				k++;
			}
		}
		
		System.out.println("\nEl arrglo C completo es: ");
		for (k =0; k<20; k++) {
			System.out.print(c[k] +" - ");
		}
		System.out.println();
		entrada.close();
	}

}
