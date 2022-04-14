package bloque5;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AgregarValoresVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int numeroElementos;

		numeroElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos: "));

		char[] letra = new char[numeroElementos];

		System.out.println("Digite los elementos del arreglo: ");

		for (int i = 0; i < numeroElementos; i++) {
			System.out.print((i + 1) + " Digite un caracter: ");
			letra[i] = entrada.next().charAt(0);
		}
		System.out.println();

		System.out.println("\nLos caracteres son: ");
		for (int i = 0; i < numeroElementos; i++) {
			System.out.print(letra[i] + " ");
		}

		entrada.close();
	}

}
