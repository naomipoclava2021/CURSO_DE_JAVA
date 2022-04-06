package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejericio 4: En MegaPlaza se hace un 20 %  de descuento a los clientes cuya compra supere los $300. ¿
		 * Cual sera la cantidad que pagara una persona por su compra ?
		 */
		
		double precioDeCompra, descuento;
		
		precioDeCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de compra"));
		
		if (precioDeCompra >300) {
			descuento = precioDeCompra - (precioDeCompra*0.20);
			System.out.println(descuento);
		}else {
			JOptionPane.showMessageDialog(null, "El precio es: "+ precioDeCompra);
		}
		
		

	}

}
