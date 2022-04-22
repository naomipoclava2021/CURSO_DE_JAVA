package estatico;

//Miembros estatico de clase

public class Estatico {
	private static String frase = "Primera frase";
	
	public static int sumar (int num1, int num2) {
		int sumar = num1+num2;
		return sumar;
	}
	
	public static void main(String []args) {
		System.out.println(Estatico.frase);
		System.out.println(Estatico.sumar(2,30));
	}

}
