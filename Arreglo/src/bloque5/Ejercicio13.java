package bloque5;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio13: Leer 10 enteros en una tabla. Guardar en otra tabla los elementos
		 * pares de la primera, y a continuacion los elementos impares.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int arreglo[], conteo_pares=0, conteo_impares=0;
		
		arreglo = new int [10];
		
		System.out.println("Llenar el arreglo");
		
		for (int i =0; i<10; i++) {
			System.out.print(i+ " Digite un numero: ");
			arreglo[i] = entrada.nextInt();
			
			if (arreglo[i]%2==0) {//Si el numero es par
				conteo_pares++;
			}else {//Si el numero es impar
				conteo_impares++;
			}
		}
		
		
		//Cramso los arreglos siguiente
		
		int pares[] = new int [conteo_pares];//Creamos el arreglo para almacenar los numeros pares
		int impare[] = new int[conteo_impares];//y ahora los numeros impares
		
		conteo_pares =0;
		conteo_impares=0;
		
		//Almacenamos los numeros pares en arreglo y los impares tambien
		for (int i =0; i<10; i++) {
			if(arreglo[i] % 2 ==0) {
				pares[conteo_pares]=arreglo[i];
				conteo_pares++;
			} else {//Si el numero es impar
				impare[conteo_impares] = arreglo[i];
				conteo_impares++;
			}
		}
		
		System.out.print("\nArreglo pares: ");
		for (int i=0; i<conteo_pares; i++) {
			System.out.print(pares[i] + " - ");
		}
		System.out.println();
		
		System.out.print("\nArreglo impares: ");
		for (int i =0; i<conteo_impares; i++) {
			System.out.print(impare[i] + " - ");
		}
		System.out.println();
		
		entrada.close();
		

	}

}
