package ejercicio10;

public class Doctor extends Persona{
	
	private String titulacion;
	private int añosExperiencia;
	
	
	
	
	public Doctor(String nombre, String apellido, int edad, String titulacion, int añosExperiencia) {
		super(nombre, apellido, edad);
		this.titulacion = titulacion;
		this.añosExperiencia = añosExperiencia;
	}
	
	

	public String getTitulacion() {
		return titulacion;
	}



	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}



	public int getAñosExperiencia() {
		return añosExperiencia;
	}



	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
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
