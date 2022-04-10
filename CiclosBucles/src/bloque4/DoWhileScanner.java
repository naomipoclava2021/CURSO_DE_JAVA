package bloque4;

import java.util.Scanner;

public class DoWhileScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner(System.in);

		int numero, contador;

		System.out.println("Ingresa un numero para iniciar:  ");
		numero = ingreso.nextInt();

		System.out.println("ingresa hasta el numero para terminar: ");
		contador = ingreso.nextInt();

		do {
			System.out.println(numero);
			numero++;
		} while (numero <= contador);

		ingreso.close();

	}

}
