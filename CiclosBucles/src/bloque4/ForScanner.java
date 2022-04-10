package bloque4;

import java.util.Scanner;

public class ForScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int hasta;

		System.out.println("Inicializa en 20 Introduzca un numero menor para descementar: ");
		hasta = entrada.nextInt();

		for (int i = 20; i >= hasta; i -= 2) {
			System.out.println(i);
		}

		entrada.close();

	}

}
