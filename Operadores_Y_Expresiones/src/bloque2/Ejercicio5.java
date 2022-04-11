package bloque2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio5 La calificacion final de un estudiante de informatica se calcula
		// con base a las calificaciones de cuatros aspectos de
		// su rendimiento academico: participacion, primer examen parcial , segundo
		// examen parcial y examen final. Sabiendo que
		// las calificaciones anteriores entran a la calificacion final con poderaciones
		// de 10%, 25%, 25% y 40%,
		// Hacer un programa que calcule e imprima la calificacion final obtenida por un
		// estudiante.
		Scanner entrada = new Scanner(System.in);
		double participacion, primerParcial, segundoParcial, examenFinal, notaFinal;

		System.out.println("Nota de participacion: ");
		participacion = entrada.nextDouble();

		System.out.println("Nota del primer parcial: ");
		primerParcial = entrada.nextDouble();

		System.out.println("Nota del segundo parcial: ");
		segundoParcial = entrada.nextDouble();

		System.out.println("Nota del examen final: ");
		examenFinal = entrada.nextDouble();

		// sumamos las notas
		notaFinal = (participacion * 0.10) + (primerParcial * 0.25) + (segundoParcial * 0.25) + (examenFinal * 0.40);
		System.out.println("Tu nota final es: " + notaFinal);

		entrada.close();

	}

}
