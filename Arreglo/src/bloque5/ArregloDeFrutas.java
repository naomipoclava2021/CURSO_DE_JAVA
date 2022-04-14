package bloque5;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArregloDeFrutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ingreso = new Scanner(System.in);
		
		int cantidad;
		
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de vectores: "));
		
		String []palabra = new String[cantidad];
		
		
		for (int i =0; i<cantidad;i++) {
			System.out.print((i+1) +" Ingresar nombres de frutas: ");
			palabra[i] = ingreso.next();
		}
		System.out.println();
		
		System.out.println("Estas son las palabras");
		for (int i =0; i<cantidad;i++) {
			System.out.print(palabra[i]+ " ");
		}
			
		ingreso.close();
		
	}

}
