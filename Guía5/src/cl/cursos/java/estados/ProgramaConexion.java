package cl.cursos.java.estados;

public class ProgramaConexion {

	public static void main(String[] args) {

		try {
			
		
		ConexionAbierta open = new ConexionAbierta();
		Conexion conexion = new Conexion(open);
		conexion.abrir();
		conexion.cerrar();
		}
		
		catch ()
	}

}
