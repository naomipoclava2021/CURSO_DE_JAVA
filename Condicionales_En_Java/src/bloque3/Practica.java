package bloque3;

import java.util.Scanner;

public class Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		float kg;
		int opcion;
		
		System.out.println("Introduce la cantidad de kilogramos: ");
		
		kg = entrada.nextFloat();
		System.out.println("Bienvenido al menu de opciones: \n"
				+ "1. Hectogramo \n"
				+ "2. Decagramo \n"
				+ "3. Gramo \n"
				+ "4. Decigramo \n"
				+ "5. Centigramo \n"
				+ "6. Miligramo");
		opcion = entrada.nextInt();
		
		if (opcion == 1) {
			kg*=10;
			System.out.println("Ah Hectogramo "+ kg);
		} else if (opcion == 2) {
			kg*=100;
			System.out.println("Ah Decagramo "+ kg);
		} else if (opcion ==3) {
			kg*=1000;
			System.out.println("Ah Gramo "+ kg);
		} else if (opcion == 4) {
			kg*=10000;
			System.out.println("Ah Decigramo "+ kg);
		} else if (opcion == 5) {
			kg*=100000;
			System.out.println("Ah Centigramo "+ kg);
		} else if (opcion == 6) {
			kg*=1000000;
			System.out.println("Ah miligramos "+ kg);
		} else {
			System.out.println("Error de opciones ");
		}
		
		entrada.close();

	}

}
