package bloque4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio12: Pedir un numero y calcular su factorial.
		 */
		Scanner ingreso = new Scanner(System.in);
		
		int numero;
		long factorial=1;
		
		System.out.println("Ingresar un numero para sacar el factorial: ");
		numero = ingreso.nextInt();
		
		for (int i =1; i<=numero; i++) {
			// 5! = 1*2*3*4*5
			factorial*=i;// multiplicacion iterativa
			
		}
		System.out.println("El factorial de " + numero + " es : " + factorial);
		ingreso.close();

	}

}
