package bloque4;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *Ejercicio5 
		 * Realizar un juego para adivinar un numero. Para ello generar un numero
		 * aleatorio entre 0 - 100, y luego ir pidiendo numeros indicando "es mayor o
		 * menor respecto a N. El proceso termina cuando el usuario acierta y mostrar el
		 * numero de intentos.
		 * 
		 * /* Ciclo While
		 * 
		 * do{ Instrucciones; } while(condicion);
		 * 
		 */

		int aleatorio, numero, intentos = 0;

		aleatorio = (int) (Math.random() * 100);

		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero: "));
			
			if (aleatorio > numero) {
				System.out.println("Es mayor que "+ numero);
			} else if (aleatorio < numero) {
				System.out.println("Es menor que "+ numero);
			}
			intentos++;//Aumentamos en uno el contador
		} while (numero != aleatorio);

		System.out.println("Felicidades adivinaste en  el " + intentos + " intentos");

	}

}
