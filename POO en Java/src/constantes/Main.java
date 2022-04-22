package constantes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Macarena", 32);
		
		p1.mostrar();
		
		System.out.println("");
		
		p1.setEdad(33);
		System.out.println(p1.getEdad());
		System.out.println("");
		p1.mostrar();
		

	}

}
