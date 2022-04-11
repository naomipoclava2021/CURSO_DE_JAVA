package bloque2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio6 Hacer un programa que calcule el cuadrado de una suma.
		//(a+b)^2 = a^2+b^2 + 2ab
		
		Scanner ingreso = new Scanner(System.in);
		double a,b,cuadrado;
		
		System.out.println("Ingresa un valor para la potencia: ");
		a = ingreso.nextDouble();
		
		System.out.println("Ingreasa un valor par el exponente: ");
		b = ingreso.nextDouble();
		
		cuadrado = Math.pow(a,2)+ Math.pow(b,2)+ (2*a*b);
		
		System.out.println("El cuadrado es: "+ cuadrado);
		
		ingreso.close();
		

	}

}
