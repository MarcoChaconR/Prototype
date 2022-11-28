package entidades;

public abstract class Arbol {
	private double ancho;
	private double altura;

	public Arbol(double ancho, double altura) {
		this.ancho = ancho;
		this.altura = altura;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return " tiene un ancho de:" + ancho + " metros y una Altura de:" + altura +" metros.";
	}

	public abstract Arbol copy();
}
