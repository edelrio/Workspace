package cl.curso.java.control_cuatro.edelrio;

/**
 * 
 * @author edelrio
 *
 */
public class Libro {

	private String nombre;
	private String editorial;
	private int cantidadLibros;
	private int cantidadLibrosPrestados;

	/**
	 * @param nombre
	 * @param editorial
	 * @param cantidadLibros
	 * @param cantidadLibrosPrestados
	 */
	public Libro(String nombre, String editorial, int cantidadLibros, int cantidadLibrosPrestados) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
		this.cantidadLibros = cantidadLibros;
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
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
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial
	 *            the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the cantidadLibros
	 */
	public int getCantidadLibros() {
		return cantidadLibros;
	}

	/**
	 * @param cantidadLibros
	 *            the cantidadLibros to set
	 */
	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}

	/**
	 * @return the cantidadLibrosPrestados
	 */
	public int getCantidadLibrosPrestados() {
		return cantidadLibrosPrestados;
	}

	/**
	 * @param cantidadLibrosPrestados
	 *            the cantidadLibrosPrestados to set
	 */
	public void setCantidadLibrosPrestados(int cantidadLibrosPrestados) {
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	/**
	 * 
	 * @param libro
	 *            Este metodo tiene como objetivo descontar los libros del stock
	 *            y a su vez aumentar la cantidad de libros prestados.
	 */
	public synchronized void reservarLibro(Libro libro) {
		if (this.getCantidadLibros() > 0) {
			this.setCantidadLibrosPrestados(this.getCantidadLibros() + 1);
			this.setCantidadLibros(this.getCantidadLibros() - 1);

			System.out.println(" Reservar:" + "libros : " + this.cantidadLibros + "   Libros prestados : "
					+ this.cantidadLibrosPrestados);
		} else {
			System.out.println("Libro Agotado");
		}

	}

	/**
	 * 
	 * @param libro
	 *            este metodo tiene como fin aumentar la cantidad de libros en
	 *            stock y a su vez descontar la cantidad de libros prestados.
	 */
	public synchronized void devolverLibro(Libro libro) {

		this.setCantidadLibrosPrestados(this.getCantidadLibros() - 1);
		this.setCantidadLibros(this.getCantidadLibros() + 1);

		System.out.println("Devolver" + "libros : " + this.cantidadLibros + "   Libros prestados : "
				+ this.cantidadLibrosPrestados);

	}

}
