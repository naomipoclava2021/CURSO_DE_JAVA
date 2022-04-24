package ejercicio6;
/*
 * Ejercicio 6: Costruir un programa para trabajar con 2 
 * numeros complejos, implemente el siguiente menu:
 * 
 * 1. Sumar dos numeros complejos
 * 2. Multiplicar 2 numeros complejos
 * 3. Comparar 2 numeros complejos (iguales o no)
 * 4. Multiplicar un numero complejo por un entero
 */

public class NumeroComplejos {
	// ejemplo 3+ 4i
	private double a;//Parte real
	private double b;// Parte imaginaria
	
	
	public NumeroComplejos(double a, double b) {
		this.a = a;
		this.b = b;
	}


	public double getA() {
		return a;
	}


	public double getB() {
		return b;
	}
	
	/*
	 * numero1 = 3 + 4i
	 * numero2 = 2 + 4i
	 * 
	 * suma = 5+ 8i
	 * 
	 * 
	 * NumeroComplejo = new NumeroComplejo (3,49);
	 */
	
	public NumeroComplejos calcularSuma(NumeroComplejos c) {
		NumeroComplejos suma = new NumeroComplejos(a+c.getA(), b+c.getB());
		return suma;
	}
	
	

}
