package bloque2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo. Juan tine la midad de lo possen Luis y
		//Guillermo juntos. Hacer un programa que calcule e imprima la cantidad de dinero que tinen los tres.
		
		Scanner ingreso = new Scanner(System.in);
		float guillermo, juan, luis,juntos,dolaresTotales;
		
		System.out.println("Guillermo, ¿Cuanto dolares tienes?: ");
		guillermo = ingreso.nextFloat();
		System.out.println("Guillermo! Tengo $"+guillermo+ " dolares");
		
		luis = guillermo / 2;
		System.out.println("luis! Tengo $"+ luis + " dolares");
		
		juntos= luis + guillermo;
		System.out.println("luis y guillermo acumulan $" +juntos + " dolares");
		
		juan = juntos/2;
		System.out.println("Juan! Tengo $" +juan+ " dolares");
		
		dolaresTotales = guillermo+luis+juan;
		System.out.println("El total de dolares es $"+ dolaresTotales+ " dolares");
		
		
		ingreso.close();

	}

}
