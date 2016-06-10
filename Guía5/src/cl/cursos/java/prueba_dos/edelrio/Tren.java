/**
 * 
 */
package cl.cursos.java.prueba_dos.edelrio;

/**
 * @author edelrio
 *
 */
public class Tren {

	private int numero;
	private String linea;

	/**
	 * @param numero
	 * @param linea
	 */
	public Tren(int numero, String linea) {
		super();
		this.numero = numero;
		this.linea = linea;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}

	/**
	 * @param linea
	 *            the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}

	public boolean seDetiene() {
		return false;

	}
}
