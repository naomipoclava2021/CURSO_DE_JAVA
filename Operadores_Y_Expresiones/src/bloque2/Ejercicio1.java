package bloque2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres calificaciones
		 */
		
		Scanner ingresar = new Scanner(System.in);
		
		double tp1, tp2, tp3, suma;
		
		System.out.println("Ingresar la Nota del Trabajo Practico N� 1: ");
		tp1 = ingresar.nextFloat();
		
		
		System.out.println("Ingresar la Nota del Trabajo Practico N� 2: ");
		tp2 = ingresar.nextFloat();
	
		
		System.out.println("Ingresar la Nota del Trabajo Practico N� 3: ");
		tp3 = ingresar.nextFloat();
		
		suma = tp1+tp2+tp3;
		System.out.println("La suma de los Trabajos Practicos es: "+ suma);
		
		
		ingresar.close();

	}

}
