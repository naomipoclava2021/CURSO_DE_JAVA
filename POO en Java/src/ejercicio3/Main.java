package ejercicio3;

import java.util.Scanner;


public class Main {

	public static int indiceCocheBarato(Vehiculo coches[]) {
		float precio;
		int indice = 0;

		precio = coches[0].getPrecio();

		for (int i = 1; i < coches.length; i++) {
			if (coches[i].getPrecio()< precio) {
				precio = coches[i].getPrecio();
				indice = i;
			}
		}
		return indice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		String marca, modelo;
		float precio;
		int numeroVehiculos, indiceBarato;

		System.out.print("Digite la cantidad de Vehiculos: ");
		numeroVehiculos = entrada.nextInt();

		// Creamos los objetos para los coches
		Vehiculo coches[] = new Vehiculo[numeroVehiculos];

		for (int i = 0; i < coches.length; i++) {
			entrada.nextLine();
			System.out.println("\nDigite las caracteristicas del coche " + (i + 1) + " . ");
			System.out.print("Introduzca Marca: ");
			marca = entrada.nextLine();
			System.out.print("Introduzca Modelo: ");
			modelo = entrada.nextLine();
			System.out.print("Introduzca Precio: ");
			precio = entrada.nextFloat();

			coches[i] = new Vehiculo(marca, modelo, precio);

		}
		
		indiceBarato = indiceCocheBarato(coches);
		System.out.println("\nEl coche mas barato es: ");
		System.out.println(coches[indiceBarato].mostrar());

	}

}
