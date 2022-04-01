package controlador;

import java.util.Scanner;

public class EntradaSalidaDeDatoCarecteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectura = new Scanner(System.in);
		String cadena;
		System.out.println("Ingresar una cadena de texto: ");

		cadena = lectura.nextLine();//next guarda una sola palabra y nextLine varias palabras con espacio
		System.out.println("La cedena de texto es: " + cadena);

		lectura.close();

	}
	
	public static void mai(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		char letra;
		
		System.out.println("Digite una letra: ");
		letra = entrada.next().charAt(0); //charAt te lee una solo caractere () y entre parentesis se pone la posicion.
		
		System.out.println("La cadena es: "+ letra);
		
		entrada.close();

	}


}
