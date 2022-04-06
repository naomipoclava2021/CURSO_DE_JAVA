package bloque3;

import java.util.Scanner;

public class Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("ingresar el primer valor: ");
		num1 = entrada.nextInt();
		System.out.println("Ingresar el segundo valor: ");
		num2 = entrada.nextInt();
		
		if (num1 % 2 == 0 && num2 % 2 == 0) {
			System.out.println("ambos numeros son pares");
		}else if (num1 % 2 !=0 && num2 %2!=0) {
			System.out.println("amboes numeros son ipares");
		}else {
			System.out.println("hay un numero que es par y otro impar");
		}
		
		entrada.close();
	}

}
