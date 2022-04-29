package ProyectoPoo;



public class Vuelo {
	private String identificador;
	private String ciudadOrigen;
	private String cuidadDestino;
	
	private double precio;
	private int numMaxPasajero;
	private int numActualPasajero;
	private Pasajero listaPasajeros[];
	
	



	public Vuelo(String identificador, String ciudadOrigen, String cuidadDestino, double precio, int numMaxPasajero) {
		super();
		this.identificador = identificador;
		this.ciudadOrigen = ciudadOrigen;
		this.cuidadDestino = cuidadDestino;
		this.precio = precio;
		this.numMaxPasajero = numMaxPasajero;
		this.numActualPasajero =0;
		this.listaPasajeros = new Pasajero[numMaxPasajero];
	}
	
	
	public void insertarPasajero(Pasajero pasajero) {
		listaPasajeros[numActualPasajero] = pasajero;
		numActualPasajero++;
	}


	public String getIdentificador() {
		return identificador;
	}


	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	public String getCiudadOrigen() {
		return ciudadOrigen;
	}


	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}


	public String getCuidadDestino() {
		return cuidadDestino;
	}


	public void setCuidadDestino(String cuidadDestino) {
		this.cuidadDestino = cuidadDestino;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getNumMaxPasajero() {
		return numMaxPasajero;
	}


	public void setNumMaxPasajero(int numMaxPasajero) {
		this.numMaxPasajero = numMaxPasajero;
	}


	public int getNumActualPasajero() {
		return numActualPasajero;
	}


	public void setNumActualPasajero(int numActualPasajero) {
		this.numActualPasajero = numActualPasajero;
	}
	
	public Pasajero getPasajero(int i) {
		return listaPasajeros[i];
	}
	
	public Pasajero getPasajero(String pasaporte) {
		boolean encontrado = false;
		int i=0;
		Pasajero pas = null;
		
		while((!encontrado) && (i<listaPasajeros.length)) {
			if(pasaporte.equals(listaPasajeros[i].getPasaporte())) {
				encontrado = true;
				pas = listaPasajeros[i];
			}
			i++;
		}
		return pas;
	}


	
	
	
	
	
	
 
}
