package Operacion;

public class Operacion {
	int suma;
	int resta;
	int multiplicacion;
	int division;

	// Metodos
	// Metodo para sumar ambos numeros
	public void sumar(int num1, int num2) {
		suma = num1+ num2;

	}

	// Metodo para restar ambos numeros
	public void restar(int num1, int num2) {
		resta = num1 - num2;

	}

	// Metodos para multiplicar ambos numeros
	public void multiplicar(int num1, int num2) {
		multiplicacion = num1*num2;

	}

	// Metodo para dividir ambos numeros
	public void dividir(int num1, int num2) {
		division = num1/num2;

	}

	public void mostrarResultado() {
		System.out.println("SUMA: " + suma);
		System.out.println("RESTA: " + resta);
		System.out.println("MULTIPLICACION: " + multiplicacion);
		System.out.println("DIVISION: " + division);
	}

}
