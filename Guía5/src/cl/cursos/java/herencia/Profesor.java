package cl.cursos.java.herencia;

/**
 * 
 * @author usuario
 *
 */

public class Profesor extends Persona {
	
	private String[] cursos;

	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	public Profesor(String[] cursos) {
		super();
		
	}

	public Profesor(String rut, String nombre, String apellidoPaterno, String apellidoMaterno) {
		super(rut, nombre, apellidoPaterno, apellidoMaterno);
		
	
	}


	
}
