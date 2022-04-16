package bloque5;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio7: Leer por teclado una serie de 10 numeros enteros. La aplicacion debe 
		 * indicarnos si los numeros estan ordenados de forma creciente, decreciente, o si 
		 * estan desordenados.
		 */
		Scanner entrada = new Scanner(System.in);
		int arreglo[]= new int[10];//Creamos un arreglo de 10 elementos enteros
		boolean creciente = false, decreciente =false;
		
		System.out.println("Llenar el arreglo");
		for (int i =0; i<10; i++) {
			System.out.print((i+1)+ " Digite un numero: ");
			arreglo[i]= entrada.nextInt();
		}
		
		for (int i =0; i<9; i++) {
			if(arreglo[i]<arreglo[i+1]) {//Craciente: 1-2-3-4-5-6-7-8
				creciente = true;
			}
			
			if(arreglo[i]>arreglo[i+1]) {//Decreciente 9-8-7-6-5-4-3-2-1-1-0
				decreciente = true;
			}
		
		}
		
		if (creciente==true && decreciente==false) {
			System.out.println("\nEl arreglo esta en forma creciente");
		} else if(creciente==false && decreciente==true) {
			System.out.println("\nEl arreglo esta en forma decreciente");
		} else if (creciente== true && decreciente==true) {
			System.out.println("\nEl arreglo esta en forma desordenada");//1-2-3-10-9-8-4-5-6-7
		} else if (creciente==false && decreciente==false){
			System.out.println("\nEl arreglo esta formada con numero iguales");//2-2-2-2-2-2-2
		}
		entrada.close();
	}

}
