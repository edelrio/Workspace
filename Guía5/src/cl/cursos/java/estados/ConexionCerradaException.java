package cl.cursos.java.estados;

import java.lang.RuntimeException;

public class ConexionCerradaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 748626085385901007L;
	@Override
	public void cerrar(Conexion conexion){
		conexion.setEstadoConexion(String message);
		super(message);

}
