package ejercicio9;

public abstract class Poligono {
	protected int numerolados;

	public Poligono(int numerolados) {
		this.numerolados = numerolados;
	}
	
	
	
	
	
	public int getNumerolados() {
		return numerolados;
	}





	public void setNumerolados(int numerolados) {
		this.numerolados = numerolados;
	}


	
	@Override
	public String toString() {
		return "numero lados= " + numerolados + ": ";
	}
	
	//Declaramos el metodo area como abstracto
	public abstract double area();
	

}
