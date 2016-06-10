package cl.curso.java.guia12;

public class Producto implements Comparable<Producto> {

	private int identificador;
	private String nombre;
	private int precio;

	/**
	 * @param identificador
	 * @param nombre
	 * @param precio
	 */
	public Producto(int identificador, String nombre, int precio) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador
	 *            the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
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
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio
	 *            the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Producto) {
			Producto prod = (Producto) obj;
			return this.getIdentificador() == prod.getIdentificador();
			
		}

		return false;
	}

	@Override
	public int compareTo(Producto comp) {

		if(this.getPrecio() > comp.getPrecio())
		return 1;
		if(this.getPrecio() < comp.getPrecio())
		return -1;
		if(this.getPrecio() ==comp.getPrecio())
			return 0;
		return 0;
	}

}
