package bloque7;

import javax.swing.JOptionPane;

public class BusquedaSecuencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Busqueda Secuencial
		 * arreglo[] = [3,1,2,5,4]; dato =2;
		 */
		int arreglo[] = {4,1,5,2,3};
		int dato;
		
		boolean bandera = false;
		//dato = 5
		dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));
		
		//Busqueda secuencial
		
		int i =0;
		
		while(i<5 && bandera == false ) {
			if (arreglo[i] == dato) {
				bandera= true;
			}
			i++;
		}
		
		if (bandera == false) {
			System.out.println("El numero no se encuentra en el arreglo");
		}else {
			System.out.println("EL numero ha sido encontrado, en la posicion: "+ (i-1));
		}

	}

}
