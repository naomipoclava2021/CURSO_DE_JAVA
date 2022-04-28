package ejercicio10;

public class Doctor extends Persona{
	
	private String titulacion;
	private int a�osExperiencia;
	
	
	
	
	public Doctor(String nombre, String apellido, int edad, String titulacion, int a�osExperiencia) {
		super(nombre, apellido, edad);
		this.titulacion = titulacion;
		this.a�osExperiencia = a�osExperiencia;
	}
	
	

	public String getTitulacion() {
		return titulacion;
	}



	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}



	public int getA�osExperiencia() {
		return a�osExperiencia;
	}



	public void setA�osExperiencia(int a�osExperiencia) {
		this.a�osExperiencia = a�osExperiencia;
	}



	public void partidoFutbol() {
		System.out.println("Da asistencia en un partido de Futbol");
	}
	
	public void entrenamiento() {
		System.out.println("Da asistencia en un entrenamiento");
	}
	
	public void curarLesion() {
		System.out.println("Cura lesion");
	}
	
	

}
