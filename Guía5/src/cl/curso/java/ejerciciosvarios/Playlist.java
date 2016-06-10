package cl.curso.java.ejerciciosvarios;

import java.util.ArrayList;

public class Playlist {

	private String nombre;
	private ArrayList<Cancion> canciones;
	private ArrayList<Usuario> seguidores;

	/**
	 * @param nombre
	 * @param canciones
	 * @param seguidores
	 */
	public Playlist(String nombre, ArrayList<Cancion> canciones, ArrayList<Usuario> seguidores) {
		super();
		this.nombre = nombre;
		this.canciones = canciones;
		this.seguidores = seguidores;
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
	 * @return the canciones
	 */
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	/**
	 * @param canciones
	 *            the canciones to set
	 */
	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	/**
	 * @return the seguidores
	 */
	public ArrayList<Usuario> getSeguidores() {
		return seguidores;
	}

	/**
	 * @param seguidores
	 *            the seguidores to set
	 */
	public void setSeguidores(ArrayList<Usuario> seguidores) {
		this.seguidores = seguidores;
	}

	public void agregarCancion(Cancion cancionNueva) {
		boolean cancionRepetida = false;
		for (int i = 0; i < canciones.size(); i++) {
			if (canciones.get(i).equals(cancionNueva)) {
				cancionRepetida = true;
			}
		}
		if (cancionRepetida) {

			System.out.println("La cancion " + cancionNueva.getNombre() + " ya está agregada");
		} else {
			this.getCanciones().add(cancionNueva);
			System.out.println("La cancion " + cancionNueva.getNombre() + " se agregó correctamente");

		}
	}

	public void eliminarCancion(Cancion cancion) {

		this.getCanciones().remove(cancion);

	}

	public double duracion(Cancion cancion) {

		this.getCanciones().add(cancion); 
		return 0;

	}
}
