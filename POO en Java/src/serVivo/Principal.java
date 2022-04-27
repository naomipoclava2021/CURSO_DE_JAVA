package serVivo;

public class Principal {
	public static void main(String [] args) {
		Planta planta = new Planta();
		
		AnimalCarnivoro carnivoro = new AnimalCarnivoro();
		AnimalHerbivoro herbivoro = new AnimalHerbivoro();
		
		
		
		planta.alimentarse();
		carnivoro.alimentarse();
		herbivoro.alimentarse();
		
	}

}
