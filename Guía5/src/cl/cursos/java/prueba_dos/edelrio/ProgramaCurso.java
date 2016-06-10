/**
 * 
 */
package cl.cursos.java.prueba_dos.edelrio;

import cl.cursos.java.clase8.Nota;

/**
 * @author edelrio
 *
 */
public class ProgramaCurso implements Imprimible{
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Alumno[] alumno = { new Alumno("alumno1 ", 50, 25), new Alumno("alumno2", 70, 25), new Alumno("alumno", 30, 50) };
		Curso curso = new Curso("Eduardo", alumno);
		
		curso.imprimir();

	}

	

	
	
}
