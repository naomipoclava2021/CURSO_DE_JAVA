package ejercicio8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numeroSucursal, numeroPaquete,prioridad,opcion;
		int contadorSucursal =0, contadorPaquete =0;
		String direccion, ciudad, dni;
		double peso;
		
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
				System.out.print("\nDigite la direccion: ");
				direccion = entrada.nextLine();
				System.out.print("\nDigite la ciudad: ");
				ciudad = entrada.nextLine();
				
				sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
				contadorSucursal++;
				
				break;
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				break;
				
			case 6:
				
				break;
				
			case 7:
				
				break;

			default:
				break;
			}
			
		} while (opcion !=7);
		

	}

}
