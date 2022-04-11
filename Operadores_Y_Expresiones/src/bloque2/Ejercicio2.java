package bloque2;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio2 Hacer un programa que calcule e imprima el salario semanal de un empleado a partie de sus horas semanales trabajadas
		//y de su salario por hora.
		Scanner ingreso = new Scanner(System.in);
		int horasSemanales;
		float pagoPorHoras, salarioTotal;
		
		System.out.println("Igrese la cantidad de horas que trabajo durante la semana: ");
		horasSemanales = ingreso.nextInt();
		System.out.println("Usted trabajo "+ horasSemanales+ " horas");
		
		System.out.println("Ingrese las cuanto le pagan por hora: ");
		pagoPorHoras = ingreso.nextFloat();
		System.out.println("Le pagan por hora: "+pagoPorHoras);
		
		salarioTotal = horasSemanales * pagoPorHoras;
		System.out.println("su salario final es igual = "+ salarioTotal);
		
		ingreso.close();

	}

}
