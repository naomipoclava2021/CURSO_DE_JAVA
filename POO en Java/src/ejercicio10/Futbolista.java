package ejercicio10;

public class Futbolista extends Persona{
	
	private int dorso;
	private String posicion;
	
	
	public Futbolista(String nombre, String apellido, int edad, int dorso, String posicion) {
		super(nombre, apellido, edad);
		this.dorso = dorso;
		this.posicion = posicion;
	}


	public int getDorso() {
		return dorso;
	}


	public void setDorso(int dorso) {
		this.dorso = dorso;
	}


	public String getPosicion() {
		return posicion;
	}


	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	public void partidoFutbol() {
		System.out.println("Juega el partido de Futbol");
	}
	
	public void entrenamiento() {
		System.out.println("Entrena");
	}
	
	
	public void entrevista() {
		System.out.println("Da una entrevista");
	}
	
	
	
	
	
	

}
