package bloque3;

import javax.swing.JOptionPane;

public class Ejecicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio11: Construir un programa que simule el funcionamieto de una
		 * calculadora que pueda ralizar cuatro operaciones aritmeticas basicas (suma,
		 * resta, producto y division) con valores numericos enteros, El usuariio debe
		 * especificar la orperiacion con el primer caracter del primer parametro de la
		 * linea de comandos: S o s para la suma, R o r para la resta, P,p , M o m para
		 * el producto y D o d para la division.
		 */

		int num1, num2;
		char op; 
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));
		
		op = JOptionPane.showInputDialog("¿Que operacione desaa realizar?").charAt(0);
		
		if (op == 'S' || op == 's') {
			System.out.println(num1+ num2);
		} else if (op == 'R' || op == 'r') {
			System.out.println(num1-num2);
		} else if (op == 'P' || op == 'p') {
			System.out.println(num1*num2);
		} else if (op == 'D' || op == 'd') {
			System.out.println(num1/num2);
		}

	}

}
