/**
 * 
 */
package cl.curso.java.control_cuatro.edelrio;

/**
 * @author Edelrio
 *
 */
public class ProgramaLibro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Libro libro = new Libro("JOJOJO", "JIJIJI", 10,3);
		ReservaLibroThread res1 = new ReservaLibroThread(libro);
		ReservaLibroThread res2 = new ReservaLibroThread(libro);
		ReservaLibroThread res3 = new ReservaLibroThread(libro);
		DevolverLibroThread dev1 = new DevolverLibroThread(libro);
		DevolverLibroThread dev2 = new DevolverLibroThread(libro);
		DevolverLibroThread dev3 = new DevolverLibroThread(libro);
		
		res1.start();
		res2.start();
		res3.start();
		dev1.start();
		dev2.start();
		dev3.start();
		
		
	}

}
