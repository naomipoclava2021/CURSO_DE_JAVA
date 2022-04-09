package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hacer una programa que pase de Kg a otra unidad de medida dae masa, mostrar en pantalla un menu con las opciones posibles.
		 */
		int opciones;
		double kilogramos, conversion;
		
		kilogramos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de kilogramos: "));
		opciones = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al menu de opciones \n"
				+ "1) Hectogramos \n"
				+ "2) Decagramos \n"
				+ "3) Gramos \n"
				+ "4) Decigramos \n"
				+ "5) Centigramso \n"
				+ "6) Miligramos"));
		
		switch (opciones) {
		case 1:
			conversion = kilogramos*10;
			JOptionPane.showMessageDialog(null, "Ah Hectogramo: "+conversion); break;
		case 2:
			conversion = kilogramos*100;
			JOptionPane.showMessageDialog(null, "Ah Decagramo: "+ conversion); break;
		case 3:
			conversion = kilogramos* 1000;
			JOptionPane.showMessageDialog(null, "Ah Gramos: "+ conversion); break;
		case 4: 
			conversion = kilogramos * 10000;
			JOptionPane.showMessageDialog(null, "Ah Decigramos: "+ conversion); break;
		case 5: 
			conversion = kilogramos * 100000;
			JOptionPane.showMessageDialog(null, "Ah Centigramos: "+ conversion); break;
		case 6:
			conversion = kilogramos * (1e+6);
			JOptionPane.showMessageDialog(null, "Ah Miligramos: "+ conversion); break;
			
		default:
			JOptionPane.showMessageDialog(null, "error de menu");
		}
		

	}

}
