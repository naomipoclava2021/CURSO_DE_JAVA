package bloque5;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio16: Queremo desarrollar una aplicacion que nos ayude a gestionar
		 * las notas de un centro eductivo. Cada grupo (o clase) esta compuesto por
		 * 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre
		 * de un grupo. Debemos mostrar al final: la nota media del grupo en cada
		 * trimestre, y la media del alumno que se encuentra en la posicion N (N se
		 * lee por teclado).
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		float primer[], segundo[] , tercer[];
		float sumaPrimer=0, sumaSegundo=0, sumaTercer =0, sumaAlumno=0;
		float promemidoPrimer, promedioSegundo, promedioTercer,promedioAlumno;
		int posicion;
		
		primer = new float[5]; //Cramos el arreglo con 5 elementos
		segundo = new float[5];//Cramos el arreglo con 5 elementos
		tercer = new float[5];//Cramos el arreglo con 5 elementos
		
	
		System.out.println("Digite la nota del primer trimetre: ");
		for (int i =0; i<5; i++) {
			System.out.print("Alumno ["+ i+ "]: ");
			primer[i]= entrada.nextFloat();
			
			sumaPrimer+=primer[i]; //Sumamos todas las notas del primer trimestre
		}
		
		System.out.println("\nDigite la nota del segundo trimetre: ");
		for (int i =0; i<5; i++) {
			System.out.print("Alumno ["+ i+ "]: ");
			segundo[i]= entrada.nextFloat();
			
			
			sumaSegundo+= segundo[i]; //Sumamos todas las notas del segundo trimestre
		}
		
		System.out.println("\nDigite la nota del tercer trimetre: ");
		for (int i =0; i<5; i++) {
			System.out.print("Alumno ["+ i+ "]: ");
			tercer[i]= entrada.nextFloat();
			
			sumaTercer+= tercer[i]; //Suma todas las notas del tercer trimestre
		}
		
		//Sacamos el promedio de cada uno de los trimestres
		
		promemidoPrimer = sumaPrimer/5;
		promedioSegundo = sumaSegundo/5;
		promedioTercer = sumaTercer/5;
		
		//Ahora pedimos la posicion del alumno N para sacar su posicion
		
		do {
			System.out.print("\nDigite un posicion del alumno(0-4), para sacar el promedio: ");
			posicion = entrada.nextInt();
		}while(posicion<0|| posicion>4);
		
		//Sacamas la suma de las notas del alumno
		sumaAlumno= primer[posicion]+ segundo[posicion] + tercer[posicion];
		promedioAlumno= sumaAlumno/3;
		System.out.println("\nMostrando los datos requerido");
		System.out.println("Promedio Primer trimestre: "+ promemidoPrimer);
		System.out.println("Promedio Segundo trimestre: "+ promedioSegundo);
		System.out.println("Promedio Tercer trimestre: "+ promedioTercer);
		System.out.println("Promodio del Alumno: "+ promedioAlumno);
		entrada.close();
	}
}
