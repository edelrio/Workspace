/**
 * 
 */
package cl.cursos.java.prueba_dos.edelrio;

/**
 * @author edelrio
 *
 */
public class Curso implements Imprimible {

	private String nombre;
	private Alumno[] alumnos;

	/**
	 * @param nombre
	 * @param alumnos
	 */
	public Curso(String nombre, Alumno[] alumnos) {
		super();
		this.nombre = nombre;
		this.alumnos = alumnos;

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
	 * @return the alumnos
	 */
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	/**
	 * @param alumnos
	 *            the alumnos to set
	 */
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public double calcularPromedioCurso(){
		
			double promedioFinal = 0;
			for( int i = 0 ; i < this.getAlumnos().length ; i++)
			{
				double nota = ( this.getAlumnos()[i].getAlumnos() * this.getAlumnos()[i];
				promedioFinal = promedioFinal + nota;
				
			}
		

		return promedioFinal;
	}

	public double obtenerMejorPromedio() {
		return 0;

	}

	@Override
	public void imprimir() {
		System.out.println(this.getNombre());
		System.out.println(this.getAlumnos());

	}

}
