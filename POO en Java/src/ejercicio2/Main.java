package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		Tablero t1;
		
		int x, y, op, incremento=0;
		
		System.out.println("Digite la cordenada incial de x: ");
		x = entrada.nextInt();
		System.out.println("Digite la cordenada incial de y: ");
		y = entrada.nextInt();
		
		//Posicion inicial del objeto
		t1 = new Tablero(x,y);
		
		do {
			System.out.println("\n\t. :Menu:");
			System.out.println("1. Mover hacia arriba");
			System.out.println("2. Mover hacia abajo");
			System.out.println("3. Mover hacia la derecha");
			System.out.println("4. Mover hacia la izquierda");
			System.out.println("5. Salir");
			System.out.print("Digite la opcion: ");
			op = entrada.nextInt();
			
			if (op !=5) {
				System.out.print("\nDigite la cantidad de espacio a moverse: ");
				incremento = entrada.nextInt();
			}
			
			switch (op) {
			case 1: t1.moverArriba(incremento); break;
			case 2: t1.moverAbajo(incremento); break;
			case 3: t1.moverDerecha(incremento); break;
			case 4: t1.moverIzquierda(incremento); break;
			case 5: break;
			default:
				System.out.println("Error, se equivoco de opcion de menu"); break;
			}
			
			System.out.println("\nPosicion Actual (x,y): "+ t1.getX()+ ", "+ t1.getY());
		}while(op !=5);
		
		


	}

}
