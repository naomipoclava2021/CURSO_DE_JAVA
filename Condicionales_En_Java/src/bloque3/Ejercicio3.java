package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que lea un caracter por teclado y compruebe si es una letra mayuscula.
		char letra;
		
		letra= JOptionPane.showInputDialog("Ingresar un una letra: ").charAt(0); //charAt(0) gurda la primera posicion de una cadena
		
		if (Character.isUpperCase(letra)) { 
			JOptionPane.showMessageDialog(null, "SI ES MAYUSCULA");
		}else {
			JOptionPane.showMessageDialog(null, "ES UNA LETRA MINUSCULA");
		}
		

	}

}
