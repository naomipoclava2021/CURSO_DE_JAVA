package ProyectoPoo;

public class Publica  extends Aeropuerto {
	
	private double subvencion;
	
	

	public Publica(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
	}

	

	public Publica(String nombre, String ciudad, String pais, Compaņia[] listaCompaņia, double subvencion) {
		super(nombre, ciudad, pais, listaCompaņia);
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
