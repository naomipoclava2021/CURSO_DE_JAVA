package bloque6;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrdenamientoPorSeleccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int arreglo[], nElemento, min, aux;

		nElemento = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos: "));
		arreglo = new int[nElemento];
		System.out.println("Rellenado el arreglo");
		for (int i = 0; i < nElemento; i++) {
			System.out.print((i + 1) + ". Digite un numero: ");
			arreglo[i] = entrada.nextInt();
		}
		
		//Ordenamiento por seleccion
		
		for(int i=0; i<nElemento; i++) {
			min = i;
			for (int j=i+1; j<nElemento; j++) {
				if (arreglo[j]< arreglo[min]) {
					min =j;
				}
			}
			aux = arreglo[i];
			arreglo[i] = arreglo[min];
			arreglo[min]= aux;
		}
		
		System.out.print("\nOrden creciente: ");
		
		for (int i =0; i<nElemento; i++) {
			System.out.print(arreglo[i]+ " - ");
		}
		System.out.println("");
		
		System.out.print("\nOrden decreciente: ");
		
		for (int i= (nElemento-1); i>=0; i--) {
			System.out.print(arreglo[i]+ " - ");
		}
		System.out.println("");

	}

}
