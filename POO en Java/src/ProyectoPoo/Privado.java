package ProyectoPoo;

public class Privado extends Aeropuerto{
	
	private String listaEmpresas[] = new String [10];
	private int numEmpresa;
	



	public Privado(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
	}
	
	
	
	
	public Privado(String nombre, String ciudad, String pais, Compañia[] c,String e[]) {
		super(nombre, ciudad, pais, c);
		this.listaEmpresas = e;
		this.numEmpresa = e.length;
	}




	public void insertarEmpresas(String e[]) {
		this.listaEmpresas = e;
		this.numEmpresa = e.length;
	}
	
	public void insetarEmpresa(String e) {
		listaEmpresas[numEmpresa] = e;
		numEmpresa++;
	}




	public String[] getListaEmpresas() {
		return listaEmpresas;
	}




	public void setListaEmpresas(String[] listaEmpresas) {
		this.listaEmpresas = listaEmpresas;
	}




	public int getNumEmpresa() {
		return numEmpresa;
	}




	public void setNumEmpresa(int numEmpresa) {
		this.numEmpresa = numEmpresa;
	}
	
	
	


}
