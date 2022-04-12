package bloque4;

import javax.swing.JOptionPane;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio17 Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. 
		 * En cada factura figura: el codigo del articulo,la cantidad vendida en litros y el precio por litro. Se pide de 5
		 * facturas introducidas: Facturacion total, cantidad en litros vendidos del articulo 1 y cuantas facturas se emitieron de
		 * mas de $600.
		 */
		
		int codigo, litros, litrosArticulo1 =0, conteoMasDe600 =0;
		float precioLitro, importeFactura, facturacionTotal=0 ;
		
		for (int i = 1; i<=5; i++) {
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Ariticulo N° " + i + "\n Ingrese el codigo: "));
			litros = Integer.parseInt(JOptionPane.showInputDialog("Ariticulo N° " + i + "\n Ingrese la cantidad de litros: "));
			precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo N° "+ i+ "\n Ingrese el precio * litro: "));
			
			
			importeFactura = (float) litros* precioLitro; //Ganancia por factura
			
			facturacionTotal += importeFactura; //suma iterativa de las facturas
			
			if(codigo == 1) {
				litrosArticulo1+=litros;
			}
			
			if (importeFactura > 600) {
				conteoMasDe600++;
			}
		}
		
		System.out.println("Resumen de venta");
		System.out.println("Facturacion Total: "+ facturacionTotal);
		System.out.println("Cantidad de litros vendidos del Articulo 1: "+ litrosArticulo1);
		System.out.println("Cantidad de factura mayor a 600: "+ conteoMasDe600);
		

	}

}
