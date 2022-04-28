package ejercicio10;

public class Entrenador extends Persona{
	
	private String estrategia;

	public Entrenador(String nombre, String apellido, int edad, String estrategia) {
		super(nombre, apellido, edad);
		this.estrategia = estrategia;
	}

	public String getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(String estrategia) {
		this.estrategia = estrategia;
	}
	
	
	
	public void partidoFutbol() {
		System.out.println("Dirige un partido");
	}
	
	public void entrenamiento() {
		System.out.println("Dirige un entrenamiento");
	}
	
	
	public void pananificarEntranamiento() {
		System.out.println("planificar entrenamiento");
	}

}
