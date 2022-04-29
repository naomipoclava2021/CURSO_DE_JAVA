package interfaces;

public class MusicoEstudiante implements Musico, Estudiante{
	
	public void hablar() {
		System.out.println("Estoy hablando español");
	}
	
	public void tocarMusica() {
		System.out.println("Estoy tocando la guitarra");
	}
	
	public void estudiar() {
		System.out.println("Estoy estudiando programacion");
	}

}
