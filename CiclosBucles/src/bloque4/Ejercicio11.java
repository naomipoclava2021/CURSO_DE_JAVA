package bloque4;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio11 Diseñar un programa que muestre los 10 primeros numeros impares.
		 */
		long producto=1;
		
		for (int i =1; i<=20; i+=2) {//1 a 19 primeros 10 numeros impares;
			producto*=i;//multiplicacion iterativa.
			System.out.println("la multiplicacion de "+ i+ " El resultado total es: "+ producto);
		}

	}

}
