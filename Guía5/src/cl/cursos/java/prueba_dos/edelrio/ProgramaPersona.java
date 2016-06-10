/**
 * 
 */
package cl.cursos.java.prueba_dos.edelrio;

/**
 * @author edelrio
 *
 */
public class ProgramaPersona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Persona persona = new Persona("Eduardo", 24, "17677838-5", 96, 1.64);
		persona.calcularIMC();
		persona.imprimir();

	}

}
