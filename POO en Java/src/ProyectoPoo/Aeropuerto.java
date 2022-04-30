package ProyectoPoo;

public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private String pais;
	private Compa�ia listaCompa�ia[]= new Compa�ia[10];
	private int numCompa�ia;
	
	
	public Aeropuerto(String nombre, String ciudad, String pais) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.numCompa�ia =0;
	}
	
	
	
	
	
	public Aeropuerto(String nombre, String ciudad, String pais, Compa�ia[] listaCompa�ia) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.listaCompa�ia = listaCompa�ia;
		this.numCompa�ia = listaCompa�ia.length;
	}
	
	public void insertarCompa�ia (Compa�ia compa�ia) {
		listaCompa�ia[numCompa�ia] = compa�ia;
		numCompa�ia++;
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





	public Compa�ia[] getListaCompa�ia() {
		return listaCompa�ia;
	}





	public void setListaCompa�ia(Compa�ia[] listaCompa�ia) {
		this.listaCompa�ia = listaCompa�ia;
	}





	public int getNumCompa�ia() {
		return numCompa�ia;
	}





	public void setNumCompa�ia(int numCompa�ia) {
		this.numCompa�ia = numCompa�ia;
	}
	
	
	public Compa�ia getCompa�ia(int i) {
		return listaCompa�ia[i];
	}
	
	public Compa�ia getCompa�ia(String nombre) {
		boolean encontrado = false;
		int i = 0;
		Compa�ia c = null;
		
		while ((!encontrado) && (i<listaCompa�ia.length)) {
			if(nombre.equals(listaCompa�ia[i].getNombre())) {
				encontrado = true;
				c = listaCompa�ia[i];
			}
			i++;
		}
		return c;
	}
	
	


	
	
	

}
