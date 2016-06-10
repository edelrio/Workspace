package cl.curso.java.ejerciciosvarios;

import java.util.ArrayList;

public class ProgramaPlaylist {

	public static void main(String[] args) {
		Usuario usuarioVacio1 = new Usuario();
		Usuario usuarioVacio2 = new Usuario(null, null);

		Cancion can1 = new Cancion("ejemplo1", "ejemplo1", 1);
		Cancion can2 = new Cancion("ejemplo2", "ejemplo2", 2);
		Cancion can3 = new Cancion("ejemplo3", "ejemplo3", 3);
		Cancion can4 = new Cancion("ejemplo4", "ejemplo4", 4);

		ArrayList<Cancion> listaCanciones1 = new ArrayList<Cancion>();
		ArrayList<Usuario> listaSeguidores = new ArrayList<Usuario>();
		ArrayList<Playlist> listaPlaylist = new ArrayList<Playlist>();

		listaCanciones1.add(can1);
		listaCanciones1.add(can2);
		listaCanciones1.add(can3);

		listaSeguidores.add(usuarioVacio1);
		listaSeguidores.add(usuarioVacio2);

		Playlist playlist1 = new Playlist("EJEMPLO1", listaCanciones1, listaSeguidores);

		listaPlaylist.add(playlist1);

	}

}
