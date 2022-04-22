package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
	//Atributos
	int num1;
	int num2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	//Metodos
	
	//Metodo para pedirle al usario que nos dige 2 numeros
	
	public void leerNumero() {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
	}
	//Metodo para sumar ambos numeros
	public void suma() {
		suma = num1+ num2;
	}
	
	//Metodo para restar ambos numeros
	public void resta() {
		resta = num1-num2;
	}
	//Metodos para multiplicar ambos numeros
	public void multiplicacion() {
		multiplicacion = num1*num2;
	}
	
	//Metodo para dividir ambos numeros
	public void division() {
		if (num2 ==0) {
			System.out.println("No se puede dividir entre 0");
		} else {
			division = num1/num2;
		}
	}
	
	public void mostrar() {
		System.out.println("SUMA: "+ suma);
		System.out.println("RESTA: "+ resta);
		System.out.println("MULTIPLICACION: "+ multiplicacion);
		System.out.println("DIVISION: "+ division);
	}
}
