package herencia;

public class Estudiante extends Persona {
		private int codigoEstudiante;
		private float notaFinal;
		
		
	//Constructor
	public Estudiante(String nombre, String apellido, int dni, int codigoEstudiante, float notaFinal) {
		super(nombre, apellido, dni);
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;	
		
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: "+ getNombre());
		System.out.println("Apellido: "+ getApellido());
		System.out.println("Edad: "+ getEdad());
		System.out.println("Codigo de Estudiante: "+ codigoEstudiante);
		System.out.println("nota final: "+ notaFinal);
	}
	
	
}
