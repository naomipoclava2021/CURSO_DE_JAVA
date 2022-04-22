package constantes;

public class Persona {
	private final String nombre;
	private int edad;
	
	//constructor
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	
	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public void mostrar() {
		System.out.println("EL nombre es: "+ nombre);
		System.out.println("La edad es: "+ edad);
	}
	
	
	
	
	

}
