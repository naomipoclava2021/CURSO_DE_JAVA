package bloque2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Construir un programa que calcule y muestre por pantalla las raices de la ecuacion de segundo grado de
		//coeficiente reales.
		
		//ax2+bx+c =  0
		
		Scanner ingreso = new Scanner(System.in);
		double a,b,c,resultado1, resultado2;
		
		System.out.println("Ingresa un valor para a: ");
		a = ingreso.nextDouble();
		System.out.println("Ingresa un valor para b: ");
		b = ingreso.nextDouble();
		System.out.println("Ingresa un valor para c: ");
		c = ingreso.nextDouble();
		
		resultado1=(-b+ Math.sqrt(Math.pow(b, 2)- (4*a*c)))/ (2*a);
		resultado2=(-b- Math.sqrt(Math.pow(b, 2)- (4*a*c)))/ (2*a);
		
		System.out.println("La raiz1 es : "+  resultado1);
		System.out.println("La raiz2 es: "+ resultado2);
		
		
		
		ingreso.close();
	}

}
