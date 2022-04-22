package Operacion3;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

		Operacion op = new Operacion();
		
		System.out.println("Suma: "+ op.sumar(n1, n2));
		System.out.println("Resta: "+ op.restar(n1, n2));
		System.out.println("Multiplicacion: "+op.multiplicar(n1, n2));
		System.out.println("Division: "+op.dividir(n1, n2));

	
		


	}

}
