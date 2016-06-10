package cl.cursos.java.estados;

public class ConexionCerrada extends EstadoConexion {


	public void siguienteEstado(Conexion conexion) {
		conexion.setEstadoConexion(new ConexionAbierta());

	}

	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstadoConexion(new ConexionAbierta());
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void	cerrar(Conexion conexion) {
		
		throw new ConexionCerradaException("el estado de la conexion es cerrada");
		
		
		
	}

}
