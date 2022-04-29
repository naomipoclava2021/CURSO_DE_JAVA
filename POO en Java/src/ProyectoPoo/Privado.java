package ProyectoPoo;

public class Privado extends Aeropuerto{
	
	private String empresa;
	private int numEmpresa;
	
	
	
	public Privado(String nombre, String ciudad, String pais, String empresa, int numEmpresa) {
		super(nombre, ciudad, pais);
		this.empresa = empresa;
		this.numEmpresa = numEmpresa;
	}



	public String getEmpresa() {
		return empresa;
	}



	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}



	public int getNumEmpresa() {
		return numEmpresa;
	}



	public void setNumEmpresa(int numEmpresa) {
		this.numEmpresa = numEmpresa;
	}
	
	
	
	
	
	
	

}
