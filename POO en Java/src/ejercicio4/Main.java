package ejercicio4;

import java.util.Scanner;

public class Main {
	
	public static int indiceGanador(Atletas atletas[]) {
		float tiempoCarrera;
		int indice =0;
		tiempoCarrera = atletas[indice].getTiempoCarrera();
		
		for (int i =1; i<atletas.length; i++) {
			if (atletas[i].getTiempoCarrera() < tiempoCarrera) {
				tiempoCarrera = atletas[i].getTiempoCarrera();
				indice = i;
			}
		}
		return indice;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		int numeroAtleta, nAtletas, idiceAtletaGanador;
		float tiempoCarrera;
		
		System.out.print("Digite el numero de atletas a participar: ");
		nAtletas = entrada.nextInt();
		
		//Creamos los objetos para cada atletas
		Atletas atletas[] = new Atletas[nAtletas];
		
		for (int i =0; i<atletas.length; i++) {
			System.out.println("\nDigite los datos del atleta "+ (i+1)+ ": ");
			System.out.print("Ingrese el numero del atleta: ");
			numeroAtleta = entrada.nextInt();
			entrada.nextLine();
			System.out.print("Ingrese el nombre: ");
			nombre = entrada.nextLine();
			System.out.print("Ingrese en cuanto tiempo termino la carrera: ");
			tiempoCarrera= entrada.nextFloat();
			
			atletas[i] = new Atletas(numeroAtleta, nombre, tiempoCarrera);
		}
		
		idiceAtletaGanador = indiceGanador(atletas);
		System.out.println("\nEl atleta ganador es: ");
		System.out.println(atletas[idiceAtletaGanador].mostarDatosGanador());

	}

}
