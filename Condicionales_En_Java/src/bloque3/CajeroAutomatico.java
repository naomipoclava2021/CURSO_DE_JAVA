package bloque3;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void main(String[] args) {
		/*
		 * Ejercicio 13: Hacer un programa que simule un cajero automatico con un saldo
		 * incial de 1000 Dolares, con el siguiente menu de opciones: 1. Ingresar dinero
		 * a la cuenta, 2. Retirar dinero de la cunta 3. Salir
		 */

		Scanner entrada = new Scanner(System.in);
		final int saldoInicial = 10000;
		int opcion;
		float ingresar, saldoActual, retirar;

		System.out.println("Bienvenido al cajero automatico \n" + "Selecciona la operacion que deseas realizar: \n"
				+ "1) Ingresar dinero a  la cuenta \n" + "2) Retirar dinero de la cuenta \n" + "3) Salir");

		opcion = entrada.nextInt();

		if (opcion == 1) {
			System.out.println("¿Cuanto dinero vas a ingresar?: ");
			ingresar = entrada.nextFloat();
			saldoActual = saldoInicial + ingresar;
			System.out.println("El nuevo saldo es : " + saldoActual);

		} else if (opcion == 2) {
			System.out.println("Ingresa el monto a retirar: ");
			retirar = entrada.nextFloat();
			
			if (retirar > saldoInicial) {
				System.out.println("No tinenes saldo suficiente");
			} else {
				saldoActual = saldoInicial - retirar;
				System.out.println("El nuevo saldo es : " + saldoActual + " despues del retiro");
			}
		} else if (opcion == 3) {
			System.out.println("Salir");
			
		} else {
			System.out.println("ERROR DE OPERACION");
		}

		entrada.close();

	}

}
