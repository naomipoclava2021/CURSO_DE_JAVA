package bloque4;

import javax.swing.JOptionPane;

public class Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
		
		while (numero !=0) {
			if (numero %2 == 0) {
				JOptionPane.showMessageDialog(null, "El numero "+numero + " es par");
			} else if (numero %2 !=0) {
				JOptionPane.showMessageDialog(null, "El numero "+ numero + " es impar");
			} else {
				JOptionPane.showMessageDialog(null, "caso no conteplado");
			}
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
		}
		
	}

}
