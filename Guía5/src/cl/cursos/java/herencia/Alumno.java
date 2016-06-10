package cl.cursos.java.herencia;

public class Alumno extends Persona {

	private int[] notas;

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, int[] notas) {
		super(rut, nombre, apellidoPaterno, apellidoMaterno);
		this.notas = notas;
	}

}
