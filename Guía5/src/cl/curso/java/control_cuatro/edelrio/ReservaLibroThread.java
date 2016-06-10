/**
 * 
 */
package cl.curso.java.control_cuatro.edelrio;

/**
 * @author Edelrio
 *
 */
public class ReservaLibroThread extends Thread {
	private Libro libro;

	/**
	 * 
	 */
	public ReservaLibroThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param libro
	 */
	public ReservaLibroThread(Libro libro) {
		super();
		this.libro = libro;
	}

	/**
	 * @return the libro
	 */
	public Libro getLibro() {
		return libro;
	}

	/**
	 * @param libro
//	 *            the libro to set
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public void run() {

		libro.reservarLibro(this.getLibro());
	}

}
