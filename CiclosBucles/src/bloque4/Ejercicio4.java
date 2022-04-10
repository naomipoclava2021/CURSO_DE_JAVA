package bloque4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio4: Pedir numeros hasta que se teclee uno negativo, y mostrostrar cuantos 
		 * numeros se han introducido.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, contador = 0;
		System.out.println("Ingrese un numero: ");
		numero = entrada.nextInt();
		
		while (numero >=0) { //mientras no sea negativo
			contador++; //Aumentamos en 1 el contador
			System.out.println("Ingrese otro numero: ");
			numero = entrada.nextInt();
		}
		System.out.println("Se ingresaro en total: "+ contador+ " positivos");
		
		entrada.close();
	}

}
