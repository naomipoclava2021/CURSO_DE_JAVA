package ProyectoPoo;

public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private String pais;
	private Compañia listaCompañias[]= new Compañia[10];
	private int numCompañia;
	
	
	public Aeropuerto(String nombre, String ciudad, String pais) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.numCompañia =0;
	}
	
	
	
	
	
	public Aeropuerto(String nombre, String ciudad, String pais, Compañia c[]) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		listaCompañias = c;
		this.numCompañia = c.length;
	}
	
	public void insertarCompañia (Compañia compañia) {
		listaCompañias[numCompañia] = compañia;
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





	public Compañia[] getListaCompañias() {
		return listaCompañias;
	}





	public void setListaCompañias(Compañia[] listaCompañias) {
		this.listaCompañias = listaCompañias;
	}





	public int getNumCompañia() {
		return numCompañia;
	}





	public void setNumCompañia(int numCompañia) {
		this.numCompañia = numCompañia;
	}



	public Compañia getCompañia(int i) {
		return listaCompañias[i];
	}
	
	public Compañia getCompañia(String nombre) {
		boolean encontrado = false;
		int i = 0;
		Compañia c = null;
		
		while ((!encontrado) && (i<listaCompañias.length)) {
			if(nombre.equals(listaCompañias[i].getNombre())) {
				encontrado = true;
				c = listaCompañias[i];
			}
			i++;
		}
		return c;
	}
	
	


	
	
	

}
