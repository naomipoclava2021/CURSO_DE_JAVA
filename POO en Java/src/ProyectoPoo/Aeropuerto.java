package ProyectoPoo;

import java.util.ArrayList;

public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private String pais;
	private ArrayList<Compa�ia>listaCompa�ias = new ArrayList<Compa�ia>();
	private int numCompa�ia;
	
	
	public Aeropuerto(String nombre, String ciudad, String pais) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
	}


	public Aeropuerto(String nombre, String ciudad, String pais, ArrayList<Compa�ia> listaCompa�ias, int numCompa�ia) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.listaCompa�ias = listaCompa�ias;
		this.numCompa�ia = numCompa�ia;
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


	public ArrayList<Compa�ia> getListaCompa�ias() {
		return listaCompa�ias;
	}


	public void setListaCompa�ias(ArrayList<Compa�ia> listaCompa�ias) {
		this.listaCompa�ias = listaCompa�ias;
	}


	public int getNumCompa�ia() {
		return numCompa�ia;
	}


	public void setNumCompa�ia(int numCompa�ia) {
		this.numCompa�ia = numCompa�ia;
	}
	
	
	
	
	
	

}
