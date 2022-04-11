package bloque4;

import javax.swing.JOptionPane;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio14: Pedir 10 sueldos.
		 * Mostrar la suma y cuanto hay mayores de $1000;
		 */
		float numero, suma =0;
		int contador=0;
		
		for (int i =1; i<=10; i++) {
			numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese su sueldo: "));
			if (numero>1000) { //si el sueldo supera a 1000 Incrementamos el contador a 1.
				contador++;
			} 
			
			suma +=numero; //Hacer una suma iterativa de todos los sueldos;
			
		}
		System.out.println("La suma de los sueldos es: "+ suma);
		System.out.println("La cantidad de los sueldos mayores a $1000 dolares es: "+ contador);
		
	
	}

}
