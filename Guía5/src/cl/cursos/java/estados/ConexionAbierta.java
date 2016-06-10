package cl.cursos.java.estados;

public class ConexionAbierta extends EstadoConexion {


	@Override
	public void abrir(Conexion conexion) {
		throw new ConexionAbiertaException("el estado de la conexion es abierta");

	}

	@Override
	public void cerrar(Conexion conexion){
		conexion.setEstadoConexion(String message);
		super(message);

	
	}

}
