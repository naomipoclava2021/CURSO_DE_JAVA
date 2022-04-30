package ProyectoPoo;


public class Compañia {
	private String nombre;
	private Vuelo listaVuelos []= new Vuelo[10];
	private int numVuelos =0;
	
	
	
	public Compañia(String nombre) {
		this.nombre = nombre;
	}



	public Compañia(String nombre, Vuelo[] listaVuelos) {
		this.nombre = nombre;
		this.listaVuelos = listaVuelos;
		this.numVuelos = listaVuelos.length;
	}
	
	
	public void insertarVuelo(Vuelo vuelo) {
		listaVuelos[numVuelos]= vuelo;
		numVuelos++;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNumVuelos() {
		return numVuelos;
	}



	public void setNumVuelos(int numVuelos) {
		this.numVuelos = numVuelos;
	}
	
	public Vuelo getVuelo(int i) {
		return listaVuelos[i];
	}
	
	public Vuelo getVuelo(String id) {
		boolean encontrado = false;
		int i =0;
		Vuelo v = null;
		
		while((!encontrado) && (i<listaVuelos.length)) {
			if(id.equals(listaVuelos[i].getIdentificador())) {
				encontrado = true;
				v = listaVuelos[i];
			}
			i++;
		}
		return v;
	}
	
	



	
	
	


	

}
