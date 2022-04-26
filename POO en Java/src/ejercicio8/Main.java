package ejercicio8;

import java.util.Scanner;

public class Main {
	public static int buscarPaquete(Paquete t[], int numeroPaquete, int contadorPaquete) {
		int indice =0;
		boolean encontrado = false;
		
		
		for (int i =0; i<contadorPaquete; i++) {
			if(t[i].getNumeroPaquete() == numeroPaquete) {
				encontrado = true;
				indice =i;
			}
			
			if (encontrado == false) {
				indice = -1;
			}
			
		}
		return indice;
	}
	
	
	public static int buscarSucursal(Sucursal t[], int numeroSucursal, int contadorSucursal) {
		int indice =0;
		boolean encontrado = false;
		
		
		for (int i =0; i<contadorSucursal; i++) {
			if(t[i].getNumeroSucursal() == numeroSucursal) {
				encontrado = true;
				indice =i;
			}
			
			if (encontrado == false) {
				indice = -1;
			}
			
		}
		return indice;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numeroSucursal, numeroPaquete,prioridad,opcion, indiceSucursal, indicePaquete;
		int contadorSucursal =0, contadorPaquete =0;
		String direccion, ciudad, dni;
		double peso, precioPaquete;
		
		Sucursal sucursal[] = new Sucursal[50];
		Paquete paquete[] = new Paquete[100];
		
		do {
			System.out.println("\t. : Menu:.");
			System.out.println("1. Crear una nueva sucursal");
			System.out.println("2. Enviar paquete");
			System.out.println("3. Consultar sucursal");
			System.out.println("4. Consultar paquete");
			System.out.println("5. Mostrar todass las sucursales");
			System.out.println("6. Mostrar todos los paquetes");
			System.out.println("7. Salir");
			System.out.print("Digite la opcion de menu: ");
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("\nDigite el numero de sucursal:");
				numeroSucursal = entrada.nextInt();
				entrada.nextLine();//Limpiar buffer
				System.out.print("\nDigite la direccion: ");
				direccion = entrada.nextLine();
				System.out.print("\nDigite la ciudad: ");
				ciudad = entrada.nextLine();
				
				sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
				contadorSucursal++;
				
				break;
			case 2:
				System.out.print("\nDigite el numero de sucursal:");
				numeroSucursal  =entrada.nextInt();
				
				indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
				
				if (indiceSucursal == -1) {
					System.out.println("La sucursal no existe");
				} else {
					System.out.print("\nDigite el numero de paquete: ");
					numeroPaquete = entrada.nextInt();
					entrada.nextLine();//Limpiar buffer
					System.out.print("\nDigite el dni de la persona: ");
					dni = entrada.nextLine();
					System.out.print("\nDigite el peso del paquete: ");
					peso = entrada.nextDouble();
					System.out.print("\nDigite la prioridad(0 = normal, 1 = alta, 2=express): ");
					prioridad = entrada.nextInt();
					
					paquete[contadorPaquete]= new Paquete(numeroPaquete, dni, peso, prioridad);
					
					precioPaquete = sucursal[indiceSucursal].calcularPrecio(paquete[contadorPaquete]);
					
					System.out.println("\nEl precio de paquete es: "+ precioPaquete);
					
					contadorPaquete++;
					
				}
				break;
				
			case 3:
				System.out.print("\nDigite el numero de sucursal: ");
				numeroSucursal = entrada.nextInt();
				
				indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
				if (indiceSucursal == -1) {
					System.out.println("La sucursal no existe");
				} else {
					System.out.print("\nLos datos de la sucursal son: ");
					System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
				}
				
				break;
				
			case 4:
				System.out.print("\nDigite el numero de paquete: ");
				numeroPaquete = entrada.nextInt();
				
				indicePaquete = buscarPaquete(paquete, numeroPaquete, contadorPaquete);
				
				if (indicePaquete ==-1) {
					System.out.println("El paquete no existe");
				} else {
					System.out.print("\nLos datos del paquete son: ");
					System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
					
				}
				
				break;
				
			case 5:
				for (int i=0; i<contadorSucursal; i++) {
					System.out.println("\nLos datos de la sucursal N "+(i+1)+ ":");
					System.out.println(sucursal[i].mostrarDatosSucursal());
				}
				
				
				break;
				
			case 6:
				for (int i =0; i< contadorPaquete; i++) {
					System.out.println("\nLos datos del paquete N° "+ (i+1)+  ":");
					System.out.println(paquete[i].mostrarDatosPaquete());
				}
				
				break;
				
			case 7:
				
				break;

			default:
				System.out.println("Erroe, opcion de menu incorrecta");
				break;
			}
			System.out.println("");
			
		} while (opcion !=7);
		

	}

}
