package bloque2;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingresar = new Scanner(System.in);

		float num1, num2, suma, resta, multiplicacion, division, resto;

		System.out.println("Ingresar el primer numero: ");
		num1 = ingresar.nextFloat();

		System.out.println("Ingresar el segundo numero: ");
		num2 = ingresar.nextFloat();

		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;
		resto = num1 % num2;

		System.out.println("El resultado de la suma es " + suma);
		System.out.println("El resultado de la resta es " + resta);
		System.out.println("El resultado de la multiplicacion es " + multiplicacion);
		System.out.println("El resultado de la division es " + division);
		System.out.println("El resultado de la resto es " + resto);

		ingresar.close();

	}

}
