package controlador;

import java.util.Scanner;

/**
 * 
 * @author Naomi Milagro Poclava
 *
 */
public class EntradaSalidaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int edad;
		System.out.println("Dime tu edad ");

		edad = entrada.nextInt();

		System.out.println("La edad es: " + edad);

		entrada.close();

	}

	public static void mai(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectura = new Scanner(System.in);
		double precioDeFactura;
		System.out.println("Ingrese el precio de la factura: ");// IMPORTANTE INGRESAR VALOR CON ',' UNA COMA NO '.'

		precioDeFactura = lectura.nextDouble();
		System.out.println("El precio de la factura es: " + precioDeFactura);

		lectura.close();
	}

	public static void ma(String[] args) {
		// TODO Auto-generated method stub

		Scanner ingreso = new Scanner(System.in);
		float galleta;
		System.out.println("Ingrese el precio de la galleta: "); // IMPORTANTE INGRESAR CON ',' UNA COMA NO UN PUNTO.

		galleta = ingreso.nextFloat();
		System.out.println("El precio de la galleta es: " + galleta);
		ingreso.close();

	}

}
