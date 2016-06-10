package cl.cursos.java.guia10;

public class Cuadrado extends FiguraGeometrica {

	private int lado;

	public Cuadrado() {
		lado = 4;

	}

	public Cuadrado(int lado) {
		this.lado = lado;
	}

	/**
	 * @return the lado
	 */
	public int getLado() {
		return lado;
	}

	/**
	 * @param lado
	 *            the lado to set
	 */
	public void setLado(int lado) {
		this.lado = lado;
	}

	/**
	 * @param color
	 * @param cantidadLados
	 */
	public Cuadrado(String color, int cantidadLados) {
		super(color, cantidadLados);
		this.setColor(this.getColor());
		this
	}

}
