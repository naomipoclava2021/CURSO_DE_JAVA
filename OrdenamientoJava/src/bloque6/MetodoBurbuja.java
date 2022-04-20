package bloque6;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MetodoBurbuja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 				si
		 * numeroActual > nuemeroSiguiente
		 * 			cambio
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int arreglo[], nElementos, aux;
		
		nElementos= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elemetos de arreglo: "));
		
		arreglo= new int[nElementos]; //Le asignamos el numero de elemento
		
		System.out.println("Llenar el arreglo");
		
		for (int i =0; i<nElementos; i++) {
			System.out.print((i+1)+". Digite un numero: ");
			arreglo[i]= entrada.nextInt();
		}
		
		//Metodo burbuja
		for (int i=0; i<nElementos-1; i++) {
			for (int j=0; j<nElementos-1; j++) {
				if (arreglo[j]> arreglo[j+1]) {//Si numeroActual > numeroSiguiente
					aux = arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]= aux;
				}
			}
		}
		
		//Mostrar el arreglo ordenado en forma creciente
		System.out.print("\nArreglo oredanado en forma creciente: ");
		
		for (int i=0; i<nElementos; i++) {
			System.out.print(arreglo[i]+ " - ");
		}
		System.out.println();
		
		//Mostat el arreglo ordenado en forma decrecite
		System.out.print("\nArreglo oredanado en forma decreciente: ");
		for (int i= (nElementos-1); i>=0; i--) {
			System.out.print(arreglo[i]+ " - ");
		}
		System.out.println();
		entrada.close();
	}

}
