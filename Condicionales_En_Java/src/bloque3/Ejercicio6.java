package bloque3;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejercicio 6 : Hacer un programa que tome dos numeros y diga si es ambos son pares o impares
		 */
		
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));
	
		
		if (num1 % 2 ==0 && num2 % 2 ==0) {
			JOptionPane.showMessageDialog(null, "ambos numuros son pares");
		}else {
			if(num1 % 2 == 1 && num2 % 2 ==1) {
				JOptionPane.showMessageDialog(null, "ambos numeros son impares");
			}else {
				JOptionPane.showMessageDialog(null, "uno es hay uno que es par y otro impar");
			}
		}

	}

}
