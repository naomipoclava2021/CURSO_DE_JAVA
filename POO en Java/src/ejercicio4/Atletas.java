package ejercicio4;
/*
 * Ejercicio 4: Construir un programa para una competencia 
 * de atletismo, el programa debe gestionar uns serie de 
 * atlestas caracterizados por su numero de atleta, nombre
 * y tiempo de carrera, al final el programa debe mostrar los
 * datos del atleta ganador de la carrera.
 */
public class Atletas {
	private int numeroAtleta;
	private String nombre;
	private float tiempoCarrera;
	
	
	public Atletas(int numeroAtleta, String nombre, float tiempoCarrera) {
		this.numeroAtleta = numeroAtleta;
		this.nombre = nombre;
		this.tiempoCarrera = tiempoCarrera;
	}


	public float getTiempoCarrera() {
		return tiempoCarrera;
	}
	
	public String mostarDatosGanador() {
		return "Numero de Atleta" + numeroAtleta+ "\nNombre: "+ nombre + "\nTiempo de Carrera: "+ tiempoCarrera+ ".\n";
	}
	
	
	

}
