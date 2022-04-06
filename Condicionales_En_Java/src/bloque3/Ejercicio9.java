package bloque3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ejercicio 9: Pedir el dia,mes y año de una fecha e indicar si la fecha es
		 * correcta. Suponiendo que todos los meses son de 30 dias
		 */

		Scanner entrada = new Scanner(System.in);
		int dia, mes, anio;

		System.out.println("Ingresar el dia: ");
		dia = entrada.nextInt();
		System.out.println("Ingresar el mes: ");
		mes = entrada.nextInt();
		System.out.println("ingresar el año: ");
		anio = entrada.nextInt();

		if (dia >= 1 && dia <= 30) {
			System.out.println("dia correcto");
			if (mes >= 1 && mes <= 12) {
				System.out.println("mes corecto");
			} else {
				System.out.println("mes icorrecto");
			}
			if (anio != 0) {
				System.out.println("año correcto");
			} else {
				System.out.println("año incorrecto");
			}
		} else {
			System.out.println("Fecha incorecta");
		}
		entrada.close();

	}

}
