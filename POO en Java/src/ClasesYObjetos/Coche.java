package ClasesYObjetos;

public class Coche {
	//Atributos
	String color;
	String marca;
	int km;
	
	//Metodo
	public static void main(String [] args) {
		Coche coche1 = new Coche();
		coche1.color= "Blanco";
		coche1.marca = "Audi";
		coche1.km= 0;
		
		System.out.println("COLOR: "+ coche1.color);
		System.out.println("MARCA: "+ coche1.marca);
		System.out.println("KM: "+ coche1.km);
		
		Coche coche2 = new Coche();
		coche2.color = "Rojo";
		coche2.marca = "Ferrari";
		coche2.km = 100;
		
		System.out.println("");
		System.out.println("COLOR: "+ coche2.color);
		System.out.println("MARCA: "+ coche2.marca);
		System.out.println("KM: "+ coche2.color);
	}

}
