package polimorfismo;

public class VehiculoTurismo extends Vehiculo{
	private int nPuertas;

	public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
		super(matricula, marca, modelo);
		this.nPuertas = nPuertas;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}
	
	
	public String mostrarDatos() {
		
		return super.mostrarDatos()+ "\nPuertas: "+ getnPuertas();
	}
	

}
