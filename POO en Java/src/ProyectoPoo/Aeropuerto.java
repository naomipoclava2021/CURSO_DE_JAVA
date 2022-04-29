package ProyectoPoo;

import java.util.ArrayList;

public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private String pais;
	private ArrayList<Compañia>listaCompañias = new ArrayList<Compañia>();
	private int numCompañia;
	
	
	public Aeropuerto(String nombre, String ciudad, String pais) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
	}


	public Aeropuerto(String nombre, String ciudad, String pais, ArrayList<Compañia> listaCompañias, int numCompañia) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.listaCompañias = listaCompañias;
		this.numCompañia = numCompañia;
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


	public ArrayList<Compañia> getListaCompañias() {
		return listaCompañias;
	}


	public void setListaCompañias(ArrayList<Compañia> listaCompañias) {
		this.listaCompañias = listaCompañias;
	}


	public int getNumCompañia() {
		return numCompañia;
	}


	public void setNumCompañia(int numCompañia) {
		this.numCompañia = numCompañia;
	}
	
	
	
	
	
	

}
