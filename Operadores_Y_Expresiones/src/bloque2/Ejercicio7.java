package bloque2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Construier un programa que, dado un numero total de horas, devuelva el numero de samanas, dias y horas equivalentes.
		//Por ejemplo dado un total de 1000 horass debe mostrar 5 semanas, 6 dias y 16 horas.
		
		Scanner ingreso = new Scanner(System.in);
		int total,semanas, dias, horas;
		
		System.out.println("INGRESA UN TOTAL DE HORAS: ");
		total= ingreso.nextInt();
		
		semanas = total / 168;
		
		dias = total % 168 /24;
		
		horas = total % 24;
		
		System.out.println("Semanas: "+ semanas);
		System.out.println("Dias: "+ dias);
		System.out.println("Horas"+ horas);
		
		ingreso.close();

	}

}
