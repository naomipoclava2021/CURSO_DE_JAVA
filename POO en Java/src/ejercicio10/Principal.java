package ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Ejercicio 10: Crear un programa para simular un equipo de
 * fulbol (futbolista, entrenador y doctor), para lo cual 
 * tendremos lo siguiente:
 * 
 * Una super clase Persona, que tendra los siguientes datos:
 * nombre, apellido, edad.
 * 
 * La sub clase Futbolista tendra los siguientes datos: dorsal
 * y posicion.
 * 
 * La sub clase Entrenador tendra de dato la estrategia que 
 * utiliza.
 * 
 * La sub clase Doctor, la titulacion y los años de experiencia.
 * 
 * Hacer un menu donde se tengan las siguientes opciones: Viaje
 * de equipo entrenamiento, partido de futbol, planificar 
 * entranamiento, entrevista, curar lesion
 */

public class Principal {
	
	static ArrayList<Persona> persona = new ArrayList<Persona>();
	static Scanner entrada = new Scanner(System.in);
	
	static Persona futbolista1 = new Futbolista("Gonzalo", "Higuain", 29, 10, "Delantero");
	static Persona fultbolista2 = new Futbolista("Paulo", "Dibala", 22, 9, "Delantero");
	static Persona entrenador = new Entrenador("Maximiliano", "Alegri", 49, "Denfesiva");
	static Persona doctor = new Doctor("Alex", "Marroni", 55, "Linceciado", 10);
	
	public static void main (String []args) {
		
		persona.add(futbolista1);
		persona.add(fultbolista2);
		persona.add(entrenador);
		persona.add(doctor);
		
		
	}
	
	
	public static void menu() {
		int opcion;
		do {
			System.out.println("\t. Menu: .");
			System.out.println("1. Viaje de equipo");
			System.out.println("2. Entrenamiento");
			System.out.println("3. Partido de Futbol");
			System.out.println("4. Planificar entrenamiento");
			System.out.println("5. Entrevista");
			System.out.println("6. Curar lesion");
			System.out.println("7. Salir");
			System.out.print("Digite una opcion: ");
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1: viajarEquipo();//Viaje de equipo
				
				break;
				
			case 2: //Entranamiento
				break;
				
			case 3: //Partido de futbol
				
				break;
				
			case 4: //Planificar un entrenamiento
				
				break;
				
			case 5: //Entrevista
				
				break;
				
				
			case 6: //Curar lesion
				
				break;
				
				
			case 7://salir
				
				break;

			default:
				System.out.println("Error, se equivoco de opcion de menu");
				break;
			}
			System.out.println("");
			
		} while (opcion !=7);
	}
	
	
	public static void viajarEquipo() {
		for(Persona equipo: persona) {
			System.out.println(equipo.getNombre()+ " "+ equipo.getApellido()+ " -> ");
			equipo.viajar();
		}
	}

}
