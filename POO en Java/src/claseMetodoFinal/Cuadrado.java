package claseMetodoFinal;

public class Cuadrado extends FiguraCerrada {
	private double area;
	
	public Cuadrado(double tamanio, int nlados, double area) {
		super(tamanio, nlados);
		this.area = area;
	}
	
	public void dibujar() {
		System.out.println("Esto es un cuadrado");
		
	}

}
