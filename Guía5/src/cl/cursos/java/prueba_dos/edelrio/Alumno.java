/**
 * 
 */
package cl.cursos.java.prueba_dos.edelrio;

/**
 * @author edelrio
 *
 */
public class Alumno implements Imprimible {

	private String nombre;
	private double promedio;

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub

	}

	/**
	 * @param nombre
	 * @param promedio
	 * @param i
	 */
	public Alumno(String nombre, double promedio, int i) {
		super();
		this.nombre = nombre;
		this.promedio = promedio;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the promedio
	 */
	public double getPromedio() {
		return promedio;
	}

	/**
	 * @param promedio
	 *            the promedio to set
	 */
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

}
