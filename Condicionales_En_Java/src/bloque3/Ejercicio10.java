package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio10: Pedir el dia, mes y año de una fecha e indicar si la fecha es
		 * correcta. Con meses de 28, 30 y 31 dias. Sin años bisiestos.
		 */
		
		int dia,mes, año;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un mas: "));
		año = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un año: "));
		
		if (año == 0) {
			JOptionPane.showMessageDialog(null, "Fecha Incorecta");
		}else if ((mes == 2 ) && (dia >=1 && dia <=28)) {
			JOptionPane.showMessageDialog(null, "Fecha Correcta");
		}else if ((mes ==  4 || mes == 6 || mes == 9 || mes == 11) && (dia >=1 && dia <=30)) {
			JOptionPane.showMessageDialog(null, "Fecha Correcta");
		}else if ((mes == 1 || mes== 3  || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >=1 && dia <=31)) {
			JOptionPane.showMessageDialog(null, "Fecha Correcta");
		}else {
			JOptionPane.showMessageDialog(null, "Fecha Incorecta");
		}

	}

}
