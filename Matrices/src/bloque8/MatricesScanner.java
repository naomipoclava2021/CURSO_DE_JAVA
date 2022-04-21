package bloque8;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MatricesScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int matriz[][], nFilas, nColumnas;

		nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuemero de fila: "));
		nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuemero de columnas: "));

		matriz = new int[nFilas][nColumnas];

		System.out.println("Llenar la matriz");
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nColumnas; j++) {
				System.out.print("Matriz [" + i + "] [" + j + "]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("\nLa matriz es: ");
		for (int i =0; i<nFilas; i++) {
			for (int j=0; j<nColumnas; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
		
		entrada.close();
	}

}
