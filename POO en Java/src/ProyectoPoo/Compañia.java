package ProyectoPoo;

import java.util.ArrayList;

public class Compa�ia {
	private String nombre;
	private ArrayList<Vuelo> listaVuelos = new ArrayList<Vuelo>();
	private int numVuelos =0;
	
	
	
	public Compa�ia(String nombre) {
		this.nombre = nombre;
	}


	public Compa�ia(String nombre, ArrayList<Vuelo> listaVuelos, int numVuelos) {
		this.nombre = nombre;
		this.listaVuelos = listaVuelos;
		this.numVuelos = numVuelos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Vuelo> getListaVuelos() {
		return listaVuelos;
	}


	public void setListaVuelos(ArrayList<Vuelo> listaVuelos) {
		this.listaVuelos = listaVuelos;
	}


	public int getNumVuelos() {
		return numVuelos;
	}


	public void setNumVuelos(int numVuelos) {
		this.numVuelos = numVuelos;
	}
	
	
	
	
	

}
