package persona2;

public class Persona {
	//Atributos
	String nombre;
	int edad;
	String dni;
	
	//Metodos
	//Metodo constructor
	//Sobrecarga de metodos

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String dni) {
		this.dni = dni;
	}
	
	public void correr() {
		System.out.println("soy "+ nombre+ " Tengo "+ edad+ " años y estoy corriendo una maraton");
	}
	
	public void correr(int km) {
		System.out.println("He corrido "+ km+ " Kilometros");
		
	}


	

}
