/**
 * 
 */
package cl.cursos.java.guia10;

/**
 * @author usuario
 *
 */
public class Circulo extends FiguraGeometrica {

	private double radio;

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio
	 *            the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	/**
	 * @param color
	 * @param cantidadLados
	 */
	public Circulo(String color, int cantidadLados) {
		super(color, cantidadLados);
		// TODO Auto-generated constructor stub
	}

}
