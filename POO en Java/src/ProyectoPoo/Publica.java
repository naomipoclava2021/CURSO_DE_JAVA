package ProyectoPoo;

public class Publica  extends Aeropuerto {
	
	private double subvencion;
	
	

	public Publica(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
	}

	

	public Publica(String nombre, String ciudad, String pais, Compa�ia[] listaCompa�ia, double subvencion) {
		super(nombre, ciudad, pais, listaCompa�ia);
		this.subvencion = subvencion;
	}
	


	public Publica(String nombre, String ciudad, String pais, double subvencion) {
		super(nombre, ciudad, pais);
		this.subvencion = subvencion;
	}



	public double getSubvencion() {
		return subvencion;
	}

	public void setSubvencion(double subvencion) {
		this.subvencion = subvencion;
	}
	
	

}
