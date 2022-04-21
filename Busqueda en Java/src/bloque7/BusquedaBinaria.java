package bloque7;

import javax.swing.JOptionPane;

public class BusquedaBinaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Busqueda Binaria //EL ARREGLO DEBE ESTAR ORDENADO
		 */
		
		int arreglo[] = {1,2,3,4,5};
		int dato, inferior, superior, mitad, i;
		boolean bandera = false;
		
		dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));
		
		//Busqueda binaria
		
		inferior=0;
		superior=5;
		i =0;
		
		mitad = inferior+superior/2;
		
		while(inferior<=superior && i<5) {
			if (arreglo[mitad] == dato) {
				bandera = true;
				break;
			}
			if (arreglo[mitad]> dato) {
				superior = mitad;
				mitad= (inferior+superior)/2;
			}
			
			if (arreglo[mitad]< dato) {
				inferior = mitad;
				mitad = (inferior+superior)/2;
			}
			i++;
		}
		
		if (bandera== true) {
			System.out.println("El numero ha sido encontrado en la posicion: "+ mitad);
		}else {
			System.out.println("No hemos encontrado el numero en el arreglo");
		}
		
		
		
		
		
		
		

	}

}
