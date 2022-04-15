package bloque5;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio3: Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion
		 * realizar la media de los numeros positivos, la media de los negativos y contar
		 * el numuro de ceros.
		 */
		Scanner entrada = new Scanner(System.in);
		float suma_postivo=0, suma_negativo=0,media_positivo, media_negativos;
		int contador_positivo =0, conteo_negativo =0, conteoCero=0;
		float numeros[] = new float[5];
		
		System.out.println("Guardamos numeros en el arreglo");
		for (int i =0; i<5; i++) {
			System.out.print((i+1) + " Digite un numero: ");
			numeros[i] = entrada.nextFloat();
			
			if (numeros[i] ==0) {
				conteoCero++;
			} else if (numeros[i] > 0) {
				suma_postivo+=numeros[i];
				contador_positivo++;
			} else {
				suma_negativo+=numeros[i];
				conteo_negativo++;
			}
		}
		
		//Media de los numeros positivos
		if (contador_positivo==0) {
			System.out.println("No se puede sacar la media de los numeros positivos");
		} else {
			media_positivo = suma_postivo/contador_positivo;
			System.out.println("La media de los numeros positivos es : "+ media_positivo);
		}
		
		//Media de los numeros negativos
		if (conteo_negativo == 0) {
			System.out.println("NO se puede sacar la media de los numeros negativos");
		}else {
			media_negativos = suma_negativo/conteo_negativo;
			System.out.println("La media de negativos es: "+ media_negativos);
		}
		//Mensaje mostrando la cantidad de ceros
		System.out.println("La cantidad de ceros es: " + conteoCero);

	}

}
