package ejercicio7;

import java.util.Scanner;

public class Main {
	
	public static int buscarNumeroCuenta(Cuenta cuentas[], int n) {
		int i =0, indice =0;
		boolean encontrado = false;
		
		//Busqueda secuencial
		while((i< cuentas.length) && (encontrado == false)) {
			if (cuentas[i].getNumeroCuenta() == n) {
				encontrado = true;
				indice = i;
			}
			i++;
		}
		if (encontrado == false) {
			indice = -1;
		}
		
		return indice;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Scanner entrada = new Scanner(System.in);
		String nombre, apellido, dni;
		int numeroCuenta, nCuentas, opcion, indiceCuenta;
		double saldo,cantidad;
		
		Cuenta cuentas[];
		Cliente cliente;
		
		System.out.print("Digite el nombre del cliente: ");
		nombre = entrada.nextLine();
		System.out.print("Digite el apellido del cliente: ");
		apellido = entrada.nextLine();
		System.out.print("Digite el dni del cliente: ");
		dni = entrada.nextLine();
		System.out.println("Ahora, digite cuantas cuentas tiene: ");
		nCuentas = entrada.nextInt();
		
		
		cuentas = new Cuenta[nCuentas];
		
		for (int i =0; i < cuentas.length; i++) {
			System.out.println("\nDigite los datos para la cuenta "+ (i+1)+ " : ");
			System.out.print("Digite el numero de cuenta: ");
			numeroCuenta= entrada.nextInt();
			System.out.print("Digite el saldo de la cuenta: ");
			saldo = entrada.nextDouble();
			
			cuentas[i] = new Cuenta(numeroCuenta, saldo);
		}
		
		
		cliente = new Cliente(nombre, apellido, dni, cuentas);
		
		
		do {
			System.out.println("\t. :Menu: .");
			System.out.println("1. Ingresar dinero en la cuenta");
			System.out.println("2. Retiraar dinero de la cuenta");
			System.out.println("3. Consultar saldo de la cuenta");
			System.out.println("4. Salir");
			System.out.print("Digite la opcion de menu: ");
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("\nDigite el numero de cuenta: ");
				numeroCuenta = entrada.nextInt();
				indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
				
				if (indiceCuenta == -1) {
					System.out.println("\nEl numero de cuenta ingresado no existe");
				} else {
					System.out.print("\nDigite la cantidad de dinero a ingresar: ");
					cantidad = entrada.nextDouble();
					
					cliente.ingresarDinereo(indiceCuenta, cantidad);
					
					System.out.println("\nIngreso realizado correctamente");
					System.out.println("saldo disponible: "+ cliente.consultarSaldo(indiceCuenta));
				}
				
				break;
				
			case 2:
				System.out.print("\nDigite el numero de cuenta: ");
				numeroCuenta = entrada.nextInt();
				indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
				
				if (indiceCuenta == -1) {
					System.out.println("\nEl numero de cuenta ingresado no existe");
				} else {
					System.out.print("\nDigite la cantidad de dinero que desea retirar: ");
					cantidad = entrada.nextDouble();
					
					if (cantidad > cliente.consultarSaldo(indiceCuenta)) {
						System.out.println("\nSaldo insuficiente");
					} else {
						cliente.retirarDinero(indiceCuenta, cantidad);

						System.out.println("\nRetiro realizado correctamente");
						System.out.println("saldo disponible: " + cliente.consultarSaldo(indiceCuenta));
					}
				}
				break;
				
			case 3: 
				System.out.print("\nDigite el numero de cuenta: ");
				numeroCuenta = entrada.nextInt();
				indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);
				
				if (indiceCuenta == -1) {
					System.out.println("\nEl numero de cuenta ingresado no existe");
				} else {
					System.out.println("Saldo disponible: "+ cliente.consultarSaldo(indiceCuenta));
				}
				
				break;
				
			case 4: 
				break;

			default:
				System.out.println("Error, se confundio de opcion de menu");
				break;
			}
			System.out.println("");
		} while (opcion !=4 );

	}

}
