package bloque3;

import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//valor = (codicion) ? valor1:valor2
		
		int valor;
		String mensaje;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
		
		mensaje =  (valor % 2==0 )? "es par": "es impar";
		
		JOptionPane.showMessageDialog(null, mensaje);
		
	
		
		

	}

}
