package bloque4;

import javax.swing.JOptionPane;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio18: Hacer unas modificaciones al ajercicio anterior suponiendo que
		 * no se introduce el precio por litro. Solo existen tres productos con precios:
		 * 1- 0,6 $/litro 
		 * 2- 3 $/litro 
		 * 3- 1,25 $/litro
		 * 
		 */

		int codigo, litros, litrosArticulo1 = 0, conteoMasDe600 = 0;
		float precioLitro=0, importeFactura, facturacionTotal = 0;

		for (int i = 1; i <= 5; i++) {
			do {
				codigo = Integer.parseInt(JOptionPane.showInputDialog("Ariticulo N° " + i + "\n Ingrese el codigo: "));
			}while(codigo<1 || codigo>3);
			
			litros = Integer
					.parseInt(JOptionPane.showInputDialog("Ariticulo N° " + i + "\n Ingrese la cantidad de litros: "));
			
			switch (codigo) {
			case 1 : precioLitro = 0.6f; break;
			case 2 : precioLitro = 3f; break;
			case 3: precioLitro = 1.25f; break;
			}

			importeFactura = (float) litros * precioLitro; // Ganancia por factura

			facturacionTotal += importeFactura; // suma iterativa de las facturas

			if (codigo == 1) {
				litrosArticulo1 += litros;
			}

			if (importeFactura > 600) {
				conteoMasDe600++;
			}
		}

		System.out.println("Resumen de venta");
		System.out.println("Facturacion Total: " + facturacionTotal);
		System.out.println("Cantidad de litros vendidos del Articulo 1: " + litrosArticulo1);
		System.out.println("Cantidad de factura mayor a 600: " + conteoMasDe600);

	}

}
