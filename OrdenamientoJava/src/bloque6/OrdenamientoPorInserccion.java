package bloque6;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class OrdenamientoPorInserccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 			si
		 * numuroIzq > numeroActual
		 * 			camhio
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int arreglo[], nElemento, pos, aux;
		nElemento= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos"));
		arreglo = new int[nElemento];
		
		System.out.println("Rellene el arreglo");
		for (int i =0; i<nElemento; i++) {
			System.out.print((i+1)+ " Digite un numero: ");
			arreglo[i]= entrada.nextInt();
		}
		
		//Ordenamiento por Inserccion
		
		for (int i =0; i<nElemento; i++) {
			pos = i;
			aux = arreglo[i];
			
			while((pos>0) && (arreglo[pos-1]> aux)) {
				arreglo[pos]= arreglo[pos-1];
				pos--;
			}
			arreglo[pos] = aux;
		}
		System.out.print("\nOrden Ascendente: ");
		for (int i=0; i<nElemento; i++) {
			System.out.print(arreglo[i]+ " - ");
		}
		System.out.println("");
		
		System.out.print("\nOrden Decendente: ");
		for (int i = (nElemento-1); i>=0; i--) {
			System.out.print(arreglo[i]+ " - ");
		}
		System.out.println("");
		entrada.close();
	}

}
