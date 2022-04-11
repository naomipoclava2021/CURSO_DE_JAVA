package bloque2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejecicio4 Una compañia de venta de carros usados, paga a su personal de
		// ventas un salario de $1000 mensuales, mas una comision
		// de $150 por cada carro vendido, mas el 5% del valor de la venta por carro.
		// Cada mes el capturista de la empresa ingresa
		// en el computador los datos pertinentes . Hacer un programa que calcule e
		// imprima el salario mensual de un vendedor dado.
		
		final int salarioIncial = 1000;
		
		int numerosCarroVendidos;
		
		float precioDeCarro, salarioFinal;
		
		Scanner ingreso = new Scanner(System.in);
		System.out.println("¿Cuanto carros vendiste?: ");
		numerosCarroVendidos = ingreso.nextInt();
		
		System.out.println("¿Cual cuesta cada carro: ?");
		precioDeCarro = ingreso.nextFloat();
		
		salarioFinal = salarioIncial + (numerosCarroVendidos * 150)+ (0.05f*precioDeCarro*numerosCarroVendidos);//colocar  la f
		System.out.println("El salario final es: "+salarioFinal);
		
		ingreso.close();

	}

}
