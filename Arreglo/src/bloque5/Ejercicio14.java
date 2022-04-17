package bloque5;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * EJercicio14: Leer dos series de 10 enteros, que estaran ordenados crecientemente. Copiar
		 * (fusionar) las dos tablas en una tercera, de forma que siga ordanados.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int a[], b[], c[];
		
		a = new int [10];//10 elementos para el arreglo a
		b = new int [10]; //10 elemenot paera el arreglo b
		c = new int[20]; //20 para los dos arreglos a+b;
		
		System.out.println("Digite el primer arreglo");
		do {
			//Pedimos el arreglo
			for (int i =0; i<10; i++) {
				System.out.print(i+ " Digite un numero: ");
			}
		}while();
		
		
		

	}

}
