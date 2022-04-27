package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo misVehiculos[] = new Vehiculo[4];
		
		misVehiculos[0]= new Vehiculo("GH67", "Ferari", "A69");
		misVehiculos[1]= new VehiculoTurismo("H2", "FORD", "34A", 2);
		misVehiculos[2]= new VehiculoDeportivo("45GH", "Toyota", "KJ8", 500);
		misVehiculos[3]= new VehiculoFurgoneta("J18", "Toyota", "J9", 2000);
		
		for (Vehiculo vehiculos: misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
			System.out.println("");
		}
	}

}
