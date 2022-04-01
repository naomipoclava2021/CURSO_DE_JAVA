package controlador;

import javax.swing.JOptionPane;

public class EntradaSalidaDeDatoConJoptionPane {//panel de opciones

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		int entero;
		char letra;
		double decimal;
		
		cadena = JOptionPane.showInputDialog("Ingrese una cadena de texto: ");
		System.out.println("El texto es: "+cadena);
		entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero: "));//convertir String a int con Integer.parseInt()
		System.out.println("El numero entero es: "+entero);
		letra = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0);
		System.out.println("El cacter es: "+letra);
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero decimal: "));//convertir String a Double con Double.parseDouble()
		System.out.println("EL numero con decimal es: "+decimal);
		
		JOptionPane.showMessageDialog(null,"El texto es: "+ cadena);
		JOptionPane.showMessageDialog(null,"EL entero es: "+entero);
		JOptionPane.showMessageDialog(null,"EL caracter es: "+ letra);
		JOptionPane.showMessageDialog(null,"EL decimal es: "+ decimal);
		

	}

}
