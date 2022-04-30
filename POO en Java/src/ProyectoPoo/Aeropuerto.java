package ProyectoPoo;

public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private String pais;
	private Compañia listaCompañia[]= new Compañia[10];
	private int numCompañia;
	
	
	public Aeropuerto(String nombre, String ciudad, String pais) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.numCompañia =0;
	}
	
	
	
	
	
	public Aeropuerto(String nombre, String ciudad, String pais, Compañia[] listaCompañia) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.listaCompañia = listaCompañia;
		this.numCompañia = listaCompañia.length;
	}
	
	public void insertarCompañia (Compañia compañia) {
		listaCompañia[numCompañia] = compañia;
		numCompañia++;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getCiudad() {
		return ciudad;
	}





	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}





	public String getPais() {
		return pais;
	}





	public void setPais(String pais) {
		this.pais = pais;
	}





	public Compañia[] getListaCompañia() {
		return listaCompañia;
	}





	public void setListaCompañia(Compañia[] listaCompañia) {
		this.listaCompañia = listaCompañia;
	}





	public int getNumCompañia() {
		return numCompañia;
	}





	public void setNumCompañia(int numCompañia) {
		this.numCompañia = numCompañia;
	}
	
	
	public Compañia getCompañia(int i) {
		return listaCompañia[i];
	}
	
	public Compañia getCompañia(String nombre) {
		boolean encontrado = false;
		int i = 0;
		Compañia c = null;
		
		while ((!encontrado) && (i<listaCompañia.length)) {
			if(nombre.equals(listaCompañia[i].getNombre())) {
				encontrado = true;
				c = listaCompañia[i];
			}
			i++;
		}
		return c;
	}
	
	


	
	
	

}
