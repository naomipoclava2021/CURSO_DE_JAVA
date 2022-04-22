package ejercicio1;

public class Cuadrilatero {
	/*
	 * Ejercicio 1: Construir un programa que calcule el area y el perimetro de un cuadrilatero dada la longitud de sus dos lados.
	 * Los valores de la longitud deberasn introducirse por linea deo ordenes. Si es un cuadrado, solo se proporcionara la longitud
	 * de uno de los laados al constructor.
	 */
	// Atributo
	private float ladoA;
	private float ladoB;
	
	//Constructor
	public Cuadrilatero(float ladoA, float ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	//metodo Costructor 2 (cuadrado)
	public Cuadrilatero(float ladoA) {
		this.ladoA = this.ladoB = ladoA;
	}

	public float getLadoA() {
		return ladoA;
	}

	public float getLadoB() {
		return ladoB;
	}
	
	
	public float perimetro() {
		float perimetro = 2 * (getLadoA()+ getLadoB());
		return perimetro;
	}
	
	public float area() {
		float area = (getLadoA()* getLadoB());
		return area;
	}
	
	public void mostrar() {
		System.out.println("El perimetro es: "+ perimetro());
		System.out.println("El area es: "+ area());
	}
	
	
	

}
