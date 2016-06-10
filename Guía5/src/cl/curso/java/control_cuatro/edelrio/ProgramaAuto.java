/**
 * 
 */
package cl.curso.java.control_cuatro.edelrio;

/**
 * @author Edelrio
 *
 */
public class ProgramaAuto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Auto auto = new Auto("Toyota", "Zelas", 2012, 0);

		try {
			auto.venderAuto();

		} catch (SinStockException e) {
			System.out.println(e + "No es posible vender auto. No hay stock");
		}

	}

}
