package bloque4;

import java.util.Scanner;

public class Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ingreso = new Scanner(System.in);
		int numero, suma =0;
		
		do {
			System.out.println("Ingresa un numero: ");
			numero = ingreso.nextInt();
			suma+=numero;
		}while (numero !=0);
		System.out.println("El resultado de la suma es: "+ suma);
		ingreso.close();
	}

}
