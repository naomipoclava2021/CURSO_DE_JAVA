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
 * lista de compa�ias que vuelan desde ese aeropuerto.
 * 
 * 4) Par una determinada compa�ia que opera en un aeropuerto
 * concreto, listar todos los posibles vuelos que dicha compa
 * �ia ofrece, mostrando su identificador, la ciudad de origen
 * y destino y el precio del vuelo.
 * 
 * 5) Mostrar todos los posibles vuelos(indentificador) que 
 * parten de una ciudad origen a otra ciudad destino( indicada
 * por el usuario) y mostrar su precio.
 */

public class Principal {
	static Scanner entrada = new Scanner(System.in);
	final static int num = 4; // numero de aeropuerto
	static Aeropuerto aeropuertos[] = new Aeropuerto[num];

	public static void main(String[] args) {
		// Insertaar datos de los aeropuetos
		insertarDatosAeropuerto(aeropuertos);
		menu();
	}

	public static void insertarDatosAeropuerto(Aeropuerto aero[]) {
		aero[0] = new Publica("Jorge Chavez", "Lima", "Peru", 80000000);
		aero[0].insertarCompa�ia(new Compa�ia("AeroPeru"));
		aero[0].insertarCompa�ia(new Compa�ia("LATAM"));
		aero[0].getCompa�ia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90, 150));
		aero[0].getCompa�ia("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "BuenosAire", 180.99, 120));
		aero[0].getCompa�ia("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90, 180));
		aero[0].getCompa�ia("AeroPeru").getVuelo("IB20")
				.insertarPasajero(new Pasajero("Alejandro", "20BGB", "Peruana"));
		aero[0].getCompa�ia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
		aero[0].getCompa�ia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JH21K1", "Peruana"));

		aero[1] = new Publica("Jorge Chavez", "Lima", "Peru", 80000000);
		aero[1].insertarCompa�ia(new Compa�ia("AeroPeru"));
		aero[1].insertarCompa�ia(new Compa�ia("LATAM"));
		aero[1].getCompa�ia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90, 150));
		aero[1].getCompa�ia("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "BuenosAire", 180.99, 120));
		aero[1].getCompa�ia("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90, 180));
		aero[1].getCompa�ia("AeroPeru").getVuelo("IB20")
				.insertarPasajero(new Pasajero("Alejandro", "20BGB", "Peruana"));
		aero[1].getCompa�ia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
		aero[1].getCompa�ia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JH21K1", "Peruana"));

		aero[2] = new Publica("Aeropuerto  Bogota", "Bogota", "Colombia", 20000000);
		aero[2].insertarCompa�ia(new Compa�ia("AirAmerica"));
		aero[2].insertarCompa�ia(new Compa�ia("VuelaBogota"));
		aero[2].getCompa�ia("AirAmerica").insertarVuelo(new Vuelo("AE030", "Bogota", "Lima", 130.90, 110));
		aero[2].getCompa�ia("AirAmerica").insertarVuelo(new Vuelo("AE031", "Bogota", "Lima", 180.90, 80));
		aero[2].getCompa�ia("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Damaris", "000AA4G", null));
		aero[2].getCompa�ia("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Rafaela", "JKGT456", null));
		

		aero[3] = new Publica("Jorge Chavez", "Lima", "Peru", 80000000);
		aero[3].insertarCompa�ia(new Compa�ia("AeroPeru"));
		aero[3].insertarCompa�ia(new Compa�ia("LATAM"));
		aero[3].getCompa�ia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90, 150));
		aero[3].getCompa�ia("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "BuenosAire", 180.99, 120));
		aero[3].getCompa�ia("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90, 180));
		aero[3].getCompa�ia("AeroPeru").getVuelo("IB20")
				.insertarPasajero(new Pasajero("Alejandro", "20BGB", "Peruana"));
		aero[3].getCompa�ia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
		aero[3].getCompa�ia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JH21K1", "Peruana"));
	}

	public static void menu() {
		int opcion;
		String nombreAeropuerto, nombreCompa�ia, origen, destino;
		Aeropuerto aeropuerto;
		Compa�ia compa�ia;

		do {
			System.out.println("\t. Menu. :");
			System.out.println("1. ver Aeropuertos gestionados(Publicos o Privados) ");
			System.out.println("2. Ver empresa (Privado) o subvencion(Publico)");
			System.out.println("3. Lista de compa�ia de un aeropuerto");
			System.out.println("4. Lista de vuelos por compa�ia");
			System.out.println("5. Listar posibles vuelos de origen a destino");
			System.out.println("6. Salir");
			System.out.print("Opcion: ");
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("");
				mostrarDatosAeropuertos(aeropuertos);// Ver aeropuerto gestionados (Publico o Privado)

				break;

			case 2:System.out.println("");
				mostrarPatrocinio(aeropuertos);// Ver empresas(Privado) o subvencion(Publico)

				break;

			case 3: System.out.println("");
			entrada.nextLine();
			System.out.print("Digite el nombre del Aeropuerto: ");// Listar compa�ias de un Aeropuerto
			nombreAeropuerto = entrada.nextLine();
			aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
			if(aeropuerto== null) {
				System.out.println("El aeropuerto no existe");
			}else {
				mostrarCompa�ias(aeropuerto);
			}
				break;

			case 4: System.out.println(""); // Lista de vuelos por Compa�ia
				entrada.nextLine();
				System.out.print("Digite el nombre del Aeropuerto: ");// Listar compa�ias de un Aeropuerto
				nombreAeropuerto = entrada.nextLine();
				aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
				if(aeropuerto== null) {
					System.out.println("El aeropuerto no existe");
				}else {
					System.out.print("Digite el nombre de la compa�ia: ");
					nombreCompa�ia = entrada.nextLine();
					compa�ia = aeropuerto.getCompa�ia(nombreCompa�ia);
					mostarVuelos(compa�ia);
				}
				break;

			case 5: // Listar vuelos de Origen a Destino
				System.out.println("");
				entrada.nextLine();
				System.out.print("Digite la ciudad origen: ");
				origen = entrada.nextLine();
				System.out.print("Digite la ciudad destino: ");
				destino = entrada.nextLine();
				
				mostrarVueloOrigenDestino(origen, destino, aeropuertos);

				break;

			case 6: // Salir

				break;

			default:
				System.out.println("Error, se equivoco de opcion de menu");
				break;
			}

		} while (opcion != 6);
	}

	public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]) {
		for (int i = 0; i < aeropuertos.length; i++) {
			if (aeropuertos[i] instanceof Privado) {
				System.out.println("Aeropuerto Privado");
				System.out.println("Nombre: " + aeropuertos[i].getNombre());
				System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
				System.out.println("Pais: " + aeropuertos[i].getPais());
			} else {
				System.out.println("Aeropuerto Publico");
				System.out.println("Nombre: " + aeropuertos[i].getNombre());
				System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
				System.out.println("Pais: " + aeropuertos[i].getPais());
			}
			System.out.println("");
		}

	}

	public static void mostrarPatrocinio(Aeropuerto aeropuertos[]) {
		String empresas[];
		
		for (int i =0; i< aeropuertos.length; i++) {
			if(aeropuertos[i] instanceof Privado) {
				System.out.println("Aeropuerto Privado: "+ aeropuertos[i].getNombre());
				empresas = ((Privado)aeropuertos[i]).getListaEmpresas();
				System.out.println("Empresas: ");
				for(int j=0; j< empresas.length; j++) {
					System.out.println(empresas[j]);
				}
			}else {
				System.out.println("Aeropuerto Publico: "+ aeropuertos[i].getNombre());
				System.out.println("Subvencion: "+ ((Publica)aeropuertos[i]).getSubvencion());
			}
			System.out.println("");
		}

	}
	
	
	public static Aeropuerto buscarAeropuerto (String nombre, Aeropuerto aeropuertos[]) {
		boolean encontrado = false;
		int i =0;
		Aeropuerto aero = null;
		
		while ((!encontrado) && (i<aeropuertos.length)) {
			if(nombre.equals(aeropuertos[i].getNombre())) {
				encontrado = true;
				aero = aeropuertos[i];
			}
			i++;
		}
		return aero;
	}
	
	public static void mostrarCompa�ias(Aeropuerto aeropuerto) {
		System.out.println("\nLas compa�ia del aeropuerto: "+ aeropuerto.getNombre());
		for(int i =0; i < aeropuerto.getNumCompa�ia(); i++) {
			System.out.println(aeropuerto.getCompa�ia(i).getNombre());
			
		}
	}
	
	public static void mostarVuelos(Compa�ia compa�ia) {
		Vuelo vuelo;
		System.out.println("Los vuelos de la compa�ia: "+ compa�ia.getNombre());
		for (int i =0;i < compa�ia.getNumVuelos(); i++) {
			vuelo = compa�ia.getVuelo(i);
			System.out.println("Identificador: "+ vuelo.getIdentificador());
			System.out.println("Ciudad Origen: "+ vuelo.getCiudadOrigen());
			System.out.println("Ciudad Destino: "+ vuelo.getCuidadDestino());
			System.out.println("Precio: "+ vuelo.getPrecio());
			System.out.println("");
		}
	}
	
	public static Vuelo[] buscarVuelosOrigenDestino (String origen, String destino, Aeropuerto aeropuertos[]) {
		Vuelo vuelo;
		int contador =0;
		Vuelo listaVuelos[];
		
		for(int i =0;i < aeropuertos.length; i++) {//recorremos los aeropuertos
			for(int j =0; j< aeropuertos[i].getNumCompa�ia(); j++) {//recorremos las compa�ias
				for (int k=0; k<aeropuertos[i].getCompa�ia(j).getNumVuelos(); k++) { //Recorremos los vuelos
					vuelo = aeropuertos[i].getCompa�ia(j).getVuelo(k);
					if ((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCuidadDestino()))) {
						contador++;
					}
				}
			}
		}
		listaVuelos = new Vuelo[contador];
		int q =0;
		
		for (int i =0; i< aeropuertos.length; i++) {
			for(int j=0; j< aeropuertos[i].getNumCompa�ia(); j++) {
				for (int k=0; k<aeropuertos[i].getCompa�ia(j).getNumVuelos(); k++) {
					vuelo = aeropuertos[i].getCompa�ia(j).getVuelo(k);
					if((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCuidadDestino()))) {
						listaVuelos[q]= vuelo;
						q++;
					}
				}
			}
		}
		return listaVuelos;
	}
	
	public static void mostrarVueloOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]) {
		Vuelo vuelos[];
		vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
		
		if (vuelos.length == 0) {
			System.out.println("No existen vuelos de esa ciudad origen a destino");
		} else {
			System.out.println("\nVuelos Encontrados: ");
			for (int i =0; i< vuelos.length; i++) {
				System.out.println("Identificador: "+ vuelos[i].getIdentificador());
				System.out.println("Ciudad Origen: "+ vuelos[i].getCiudadOrigen());
				System.out.println("Ciudad Destino: "+ vuelos[i].getCuidadDestino());
				System.out.println("Precio: $"+ vuelos[i].getPrecio());
				System.out.println("");
			}
		}
	}

}
