package cl.curso.java.ejerciciosvarios;

public class Cancion {

	private String nombre;
	private String artista;
	private double duracion;

	/**
	 * @param nombre
	 * @param artista
	 * @param duracion
	 */
	public Cancion(String nombre, String artista, double duracion) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracion = duracion;
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
	 * @return the artista
	 */
	public String getArtista() {
		return artista;
	}

	/**
	 * @param artista
	 *            the artista to set
	 */
	public void setArtista(String artista) {
		this.artista = artista;
	}

	/**
	 * @return the duracion
	 */
	public double getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion
	 *            the duracion to set
	 */
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Cancion){
			Cancion track1 = (Cancion) obj;
			return this.getNombre().equals(track1.getNombre())&& this.getArtista().equals(track1.getArtista());
			
			
		}
		return false;
	}
	
}
