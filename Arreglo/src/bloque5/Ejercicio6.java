package bloque5;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio6: Leer los datos correspondiente a dos tablas de 12 elementos numericos, 
		 * y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de B, otro 3 de A, otros
		 * 3 de la B, etc.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int a[], b[], c[];
		
		a = new int[12];
		b = new int[12];
		c = new int[24]; //a+b
		
		
		//ARRGLO A
		System.out.println("Primer arreglo");
		
		for (int i =0; i<12; i++) {
			System.out.print((i+1) +" Digite un numero: ");//Ingresar numeros de 1 cifra
			a[i] = entrada.nextInt();
		}
		System.out.println();
		
		//ARREGLO B
		System.out.println("Segundo arreglo");
		for (int i =0; i<12; i++) {
			System.out.print((i+1)+ " Digite un numero: ");//Ingresar numeros de 2 cifras
			b[i] = entrada.nextInt();
		}
		
		//Ahora vamos a mezclar los dos arreglos a[] y b[]
		//El iterador i sera para los arregos a[] y b[]
		//y el iterador j para el arreglo c[]
		
		int i =0;
		int j =0;
		
		while(i<12) {
			//copiar los 3 elementos de a[]
			for (int k=0; k<3; k++) {
				c[j] = a[i+k];
				j++;
			}
			//Ahora copiamos 3 elementos de b[]
			for (int k=0; k<3; k++) {
				c[j] = b[i+k];
				j++;
			}
			i+=3;
		}
		
		System.out.print("El arreglo resultante es: ");
		
		for (i =0; i<24; i++) {
			System.out.print(c[i]+ " - ");
		}
		System.out.println();
		

	}

}
