package persona;

public class Persona {
	//Atributos
	String nombre;
	int edad;
	
	//Metodos
	
	//Metodo constructor
	public Persona () {
		
	}
	
	public Persona (String nom, int edad) {
		this.nombre = nom;
		this.edad = edad;
	}
	
	public void mostrar() {
		System.out.println("El nombre es: "+ this.nombre);
		System.out.println("La edad es: "+ this.edad);
	}

}
