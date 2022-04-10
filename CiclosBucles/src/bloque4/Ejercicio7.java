package bloque4;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio7: Pedir numeros hasta que se introduzca uno negativo, y calcular la
		 * media(promedio).
		 */

		int numero, suma = 0, elemento = 0;
		float media;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero: "));

		while (numero >=0) {
			suma += numero;
			elemento++;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar otro numero: "));
		}
		System.out.println("El resultado de la suma es: "+ suma);
		
		if (elemento ==0) {
			System.out.println("Error, No se puede dividir entre 0");
		} else {
			media = (float) suma/elemento;//float para que salga el resultado exacto
			System.out.println("El promedio es: "+ media);
		}

		
		
	}

}
