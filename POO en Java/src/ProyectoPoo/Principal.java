package ProyectoPoo;

import java.util.Scanner;

/*
 * La aplicacion tendra un menu con las siguientes opciones:
 * 1) Consultar los areopuertos gestionados, indicando separa
 * damente los aeropuertos publicos y privados. Para cada
 * uno de ellos debera mostrar su nombre, la ciudad de ubica
 * cion, el pais al que pertenece.
 * 
 * 2) Visualizar las empresas que protrocinan un determinado
 * aeropuerto en caso que sea privado, o la cuantia de la 
 * subvencion en caso de que se trate de un aeropuerto publi
 * co.
 * 
 * 3) Para un determido aeropuerto, se debe poder mostrar la
 * lista de compañias que vuelan desde ese aeropuerto.
 * 
 * 4) Par una determinada compañia que opera en un aeropuerto
 * concreto, listar todos los posibles vuelos que dicha compa
 * ñia ofrece, mostrando su identificador, la ciudad de origen
 * y destino y el precio del vuelo.
 * 
 * 5) Mostrar todos los posibles vuelos(indentificador) que 
 * parten de una ciudad origen a otra ciudad destino( indicada
 * por el usuario) y mostrar su precio.
 */

public class Principal {
	static Scanner entrada = new Scanner(System.in);
	final static int num = 4; //numero de aeropuerto
	static Aeropuerto aeropuertos[] = new Aeropuerto[num];
	
	public static void main(String []args) {
		//Insertaar datos de los aeropuetos
		insertarDatosAeropuerto(aeropuertos);
		menu();
	}
	
	public static void insertarDatosAeropuerto(Aeropuerto aero[]) {
		aero[0] = new Publica("Jorge Chavez", "Lima", "Peru", 80000000);
		aero[0].insertarCompañia(new Compañia("AeroPeru"));
		aero[0].insertarCompañia(new Compañia("LATAM"));
		aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90, 150));
		aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB21","Lima", "BuenosAire", 180.99, 120));
		aero[0].getCompañia("Latam").insertarVuelo(new Vuelo("FC12", "Lima","Londres", 500.90, 180));
		aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "20BGB", "Peruana"));
		aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
		aero[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JH21K1", "Peruana"));
		
		
		
		aero[1] = new Publica("Jorge Chavez", "Lima", "Peru", 80000000);
		aero[1].insertarCompañia(new Compañia("AeroPeru"));
		aero[1].insertarCompañia(new Compañia("LATAM"));
		aero[1].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90, 150));
		aero[1].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB21","Lima", "BuenosAire", 180.99, 120));
		aero[1].getCompañia("Latam").insertarVuelo(new Vuelo("FC12", "Lima","Londres", 500.90, 180));
		aero[1].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "20BGB", "Peruana"));
		aero[1].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
		aero[1].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JH21K1", "Peruana"));
		
		
		aero[2] = new Publica("Jorge Chavez", "Lima", "Peru", 80000000);
		aero[2].insertarCompañia(new Compañia("AeroPeru"));
		aero[2].insertarCompañia(new Compañia("LATAM"));
		aero[2].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90, 150));
		aero[2].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB21","Lima", "BuenosAire", 180.99, 120));
		aero[2].getCompañia("Latam").insertarVuelo(new Vuelo("FC12", "Lima","Londres", 500.90, 180));
		aero[2].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "20BGB", "Peruana"));
		aero[2].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
		aero[2].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JH21K1", "Peruana"));
		
		aero[3] = new Publica("Jorge Chavez", "Lima", "Peru", 80000000);
		aero[3].insertarCompañia(new Compañia("AeroPeru"));
		aero[3].insertarCompañia(new Compañia("LATAM"));
		aero[3].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90, 150));
		aero[3].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB21","Lima", "BuenosAire", 180.99, 120));
		aero[3].getCompañia("Latam").insertarVuelo(new Vuelo("FC12", "Lima","Londres", 500.90, 180));
		aero[3].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "20BGB", "Peruana"));
		aero[3].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
		aero[3].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JH21K1", "Peruana"));
	}
	
	
	public static void menu() {
		int opcion;
		
		do {
			System.out.println("\t. Menu. :");
			System.out.println("1. ver Aeropuertos gestionados(Publicos o Privados) ");
			System.out.println("2. Ver empresa (Privado) o subvencion(Publico)");
			System.out.println("3. Lista de compañia de un aeropuerto");
			System.out.println("4. Lista de vuelos por compañia");
			System.out.println("5. Listar posibles vuelos de origen a destino");
			System.out.println("6. Salir");
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1://Ver aeropuerto gestionados (Publico o Privado)
				
				break;
				
			case 2:// Ver empresas(Privado) o subvencion(Publico)
				
				break;
				
			case 3: //Listar compañias de un Aeropuerto
				
				break;
				
			case 4: //Lista de vuelos por Compañia
				
				break;
				
			case 5: //Listar vuelos de Origen a Destino
				
				break;
				
			case 6: //Salir
				
				break;

			default:
				System.out.println("Error, se equivoco de opcion de menu");
				break;
			}
			
		} while (opcion !=6);
	}
	

}
