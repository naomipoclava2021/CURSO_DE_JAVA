package ejercicio8;
/*
 * Ejercicio 8: Una empresa de envio de paquetes tiene varias
 * sucursales en todo el pais. Cada sucursal esta definida por
 * su numero de sucursal, direccion y ciudad. Para calcular el
 * precio que cuesta enviar cada paquete, las sucursales tienen
 * en cuenta el precio del paquete y la prioridad, sabiendo que
 * se cobra un dolar por kilo, 10 dolares mas si la prioridad
 * es alta y 20 si es express. Cada paquete enviado tendra un
 * numero de referencia y el DNI de la persona que lo envia.
 */

public class Sucursal {
	private int numeroSucursal;
	private String direccion;
	private String ciudad;
	
	public Sucursal(int numeroSucursal, String direccion, String ciudad) {
		this.numeroSucursal = numeroSucursal;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

	public int getNumeroSucursal() {
		return numeroSucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}
	
	
	public String mostrarDatosSucursal() {
		return " Numero de sursal: " + numeroSucursal
				+ "\nDireccion: "+ direccion
				+ "\nCiudad: "+ ciudad;
	}
	
	public double calcularPrecio (Paquete t) {
		double precio;
		precio = t.getPeso();
		if (t.getPrioridad() == 1) {
			precio +=10;
			
		}
		
		if (t.getPrioridad() == 2) {
			precio +=20;
			
		}
		
		return precio;
		
		
	}
	

}
