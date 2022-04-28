package ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Ejercicio 9: Hacer un programa para calcularr el area de 
 * Poligonos (Triangulos y Rectangulos) el programa debe ser
 * capaz de almacenar un arraglo N de triangulos y rectangulos
 *, y al final mostrar el area y los datos de cada uno. Para
 *ello se tendra lo siguiente:
 *
 *Una super clase llamada Poligono
 *una sub clase llamada Rectangulo
 *Una sub clase llamada Triangulo
 *  */

public class Principal {
	
	static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String []args) {
		
		//llenar poligono
		llenarPoligono();
		
		//mostrar los datos y el area de cada poligono
		mostrarResultados();

	}
	
	
	public static void llenarPoligono() {
		int opcion;
		char respuesta;
		do {
			do {
			System.out.println("Digite que poligono desea: ");
			System.out.println("1. Triangulo");
			System.out.println("2. Rectangulo");
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();
		
				
			} while (opcion <1 || opcion>2);
			
			switch (opcion) {
			case 1: llenarTriangulo();//Llenar un triangulo
				
				break;
				
			case 2: llenarRectangulo();//Llenar un rectangulo
				
				break;
			}
			
			System.out.print("\nDesea introducir otro poligono (s/n): ");
			respuesta = entrada.next().charAt(0);
			System.out.println("");
		} while (respuesta == 's' || respuesta == 'S');
	}
	
	public static void llenarTriangulo() {
		double lado1, lado2, lado3;
		
		System.out.print("\nDigite el lado1 del triangulo: ");
		lado1 = entrada.nextDouble();
		System.out.print("\nDigite el lado2 del triangulo: ");
		lado2 = entrada.nextDouble();
		System.out.print("\nDigite el lado3 del triangulo: ");
		lado3 = entrada.nextDouble();
		
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		
		//Guardamos un triangulo dentro de un arreglo de poligono
		poligono.add(triangulo);
		
	}
	
	public static void llenarRectangulo() {
		double lado1,lado2;
		
		System.out.print("\nDigite el lado1 del rectangulo: ");
		lado1 = entrada.nextDouble();
		System.out.print("\nDigite el lado2 del rectangulo: ");
		lado2 = entrada.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		
		poligono.add(rectangulo);
	}
	
	public static void mostrarResultados() {
		//recorriendo el arreglo de poligono
		for (Poligono poli : poligono) {
			System.out.println(poli.toString());
			System.out.println("Area: "+ poli.area());
			System.out.println("");
		}
	}
}
