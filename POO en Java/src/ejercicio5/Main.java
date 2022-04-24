package ejercicio5;

import java.util.Scanner;

public class Main {
	
	public static double mayotArea(Triangulo_Isosceles triangulos[]) {
		double area;
		
		area = triangulos[0].obtenerArea();
		for (int i =1;i< triangulos.length; i++) {
			if(triangulos[i].obtenerArea()> area) {
				area = triangulos[i].obtenerArea();
			}
		}
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double base, lado;
		int nTriangulo;
		
		System.out.print("Digite el numero de triangulo a ingresar: ");
		nTriangulo = entrada.nextInt();
		
		Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[nTriangulo];
		
		for (int i =0;i< triangulos.length; i++) {
			System.out.println("\nDigite los valores para el triangulo "+ (i+1)+ ": ");
			System.out.print("Introduzca la base: ");
			base = entrada.nextDouble();
			System.out.print("Introduza el lado: ");
			lado = entrada.nextDouble();
			
			triangulos[i] = new Triangulo_Isosceles(base, lado);	
			
			System.out.println("\nEl perimetro del triangulo es: "+ triangulos[i].obtenerPerimetro());
			System.out.println("El area del triagulo es: "+ triangulos[i].obtenerArea());
		}
		
		System.out.println("\nEl area de triangulo de mayor superficie es: "+ mayotArea(triangulos));
		entrada.close();

	}

}
