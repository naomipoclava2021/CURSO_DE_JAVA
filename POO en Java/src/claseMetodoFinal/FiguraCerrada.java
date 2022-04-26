package claseMetodoFinal;

public class FiguraCerrada extends Figura {
	private int  nlados;
	
	public FiguraCerrada(double tamanio, int nlados) {
		super(tamanio);
		this.nlados= nlados;	
		
	}
	
	public final void  dibujar1() {
		System.out.println("La figura es cerrada");
		
	}

}
