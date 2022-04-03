package bloque2;

import java.util.Scanner;

public class Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//Hacer un programa que calcule el cuadrado de una suma.
		//(a+b)^2 = a^2+b^2 + 2ab
		
		Scanner ingreso = new Scanner(System.in);
		
		double a,b, resultado;
		
		System.out.println("Ingrese un valor para a: ");
		a = ingreso.nextDouble();
		
		System.out.println("Ingrse un valor para b: ");
		b = ingreso.nextDouble();
		
		resultado = Math.pow(a, 2)+ Math.pow(b, 2)+ (2*a*b);
		
		System.out.println("El resultado del cuadrado de una suma es: "+ resultado);
		
		ingreso.close();

	}

}
