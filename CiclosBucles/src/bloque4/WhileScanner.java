package bloque4;

import java.util.Scanner;

public class WhileScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int n = 100, hasta;

		System.out.println("El numero 100 debe descrementar hasta: ");
		hasta = entrada.nextInt();

		while (n >= hasta) {
			System.out.println(n);
			n -= 2;
		}
		entrada.close();

	}

}
