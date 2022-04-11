package bloque4;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio13: Pedir 10 numeros. Mostrar la media de los numeros negativos y la cantidad
		 * de ceros.
		 */
		
		int numero, suma_positivo=0, cantidad_positivo=0, suma_negativos=0, cantidad_negativos=0, cantidad_ceros=0;
		float media_positivo, media_negativos;
		
		for (int i =1; i<=10; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
			
			if (numero ==0) {
				cantidad_ceros++; //Aumentamos en 1 el conteo de ceros.
			} else if (numero>0) {
				suma_positivo+=numero; //Suma iterativa de positivos
				cantidad_positivo++;
			} else {
				suma_negativos+=numero; //Suma iterativa de negativo
				cantidad_negativos++;
			}
		}
		
		
		//Tratamos con los positivos
		
		if (cantidad_positivo ==0) {
			System.out.println("No se puede sacar la media de los negativos");
		} else {
			media_positivo = (float)suma_positivo /cantidad_positivo;
			System.out.println("La media de positivos es: "+ media_positivo);
		}
		
		//Tratamos con los negativos
		if (cantidad_negativos==0) {
			System.out.println("No se puede sacar la media de los negativos");
		} else {
			media_negativos = (float)suma_negativos/cantidad_negativos;
			System.out.println("La media de numero negativos es: "+ media_negativos);
		}
		
		System.out.println("La cantidad de ceros es: "+ cantidad_ceros);
		
		
	}

}
