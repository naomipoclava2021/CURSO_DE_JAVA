package bloque4;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio15: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la altura media,
		 * la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden mas de 1.75;
		 */
		Scanner ingreso = new Scanner(System.in);
		
		int edad, suma_edad =0 ,conteoMayor18 =0, conteoMayor175=0;
		float altura, suma_atura =0, mediaEdad, mediaAltura;
		
		
		for (int i =1; i<=5; i++) {
				System.out.println("Alumno "+i+ " Ingrese su edad: ");	
				edad = ingreso.nextInt();
				System.out.println("Alumno "+ i + " Ingrese su altura: ");
				altura = ingreso.nextFloat();
				suma_edad+=edad;//suma iterativa
				suma_atura+=altura;//suma iterativa
				
				if (edad>18) {
					conteoMayor18++;
				}
				
				if (altura>1.75) {
					conteoMayor175++;
				}
		}
		
		mediaEdad = (float) suma_edad/5;
		mediaAltura = (float) suma_atura/5;
		
		System.out.println("El promedio de la edad es : "+ mediaEdad);
		System.out.println("La cantidad de alumnos mayor a 18 es: "+ conteoMayor18);
	
		System.out.println("El promedio de la altura es: "+ mediaAltura);
		System.out.println("La cantidad de alumnos mayor a 1,75 es: "+ conteoMayor175);

		
		
		ingreso.close();
		
	}

}
