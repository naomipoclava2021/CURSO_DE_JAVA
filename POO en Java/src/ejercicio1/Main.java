package ejercicio1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrilatero c1;
		
		float lado1,lado2;
		
		lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el ladoA: "));
		lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el ladob: "));
		
		if (lado1 == lado2) {
			c1 = new Cuadrilatero(lado1);
		} else {
			c1 = new Cuadrilatero(lado1,lado2);
		}
		
		System.out.println("El perimetro es: "+ c1.perimetro());
		System.out.println("El area es: "+ c1.area());
	
	}

}
