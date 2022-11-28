package entidades;

public class ArbolCedro extends Arbol {

	private String nombre;

	public ArbolCedro(double ancho, double altura) {
		super(ancho, altura);
		this.nombre = "Cedro";
	}

	@Override
	public Arbol copy() {
		ArbolCedro cedroClon = new ArbolCedro(this.getAncho(), this.getAltura());
		return cedroClon;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {

		return "El arbol de " + this.nombre + super.toString();
	}

}
