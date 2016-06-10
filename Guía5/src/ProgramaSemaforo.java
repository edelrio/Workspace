/**
 * 
 */

/**
 * @author usuario
 *
 */
public class ProgramaSemaforo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rojo rojo = new Rojo();
		Semaforo semaforo = new Semaforo(rojo);
		semaforo.cambiarColor();
		semaforo.cambiarColor();
		semaforo.cambiarColor();
		
		while( true)
		{
			semaforo.cambiarColor();
			Thread.sleep(1000);
			
		}

	}

}
