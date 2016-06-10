package cl.cursos.java.ejemplos;

public class AumentaThread extends Thread {

	private Contador contador;

	/**
	 * @param contador
	 */
	public AumentaThread(Contador contador) {
		super();
		this.contador = contador;
	}

	/**
	 * @return the contador
	 */
	public Contador getContador() {
		return contador;
	}

	/**
	 * @param contador the contador to set
	 */
	public void setContador(Contador contador) {
		this.contador = contador;
	}

	public void run(){
		
		this.contador.aumentarCuenta();
		this.contador.aumentarCuenta();
		this.contador.aumentarCuenta();
	}
	
	
}
