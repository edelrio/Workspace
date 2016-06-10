/**
 * 
 */
package cl.cursos.java.guia10;

/**
 * @author usuario
 *
 */
public class Triangulo extends FiguraGeometrica {
	private int base;
	private int altura;

	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base
	 *            the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura
	 *            the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * @param color
	 * @param cantidadLados
	 */
	public Triangulo(String color, int cantidadLados) {
		super(color, cantidadLados);
		// TODO Auto-generated constructor stub
	}

}
