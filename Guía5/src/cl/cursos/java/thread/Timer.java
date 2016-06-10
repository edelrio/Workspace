package cl.cursos.java.thread;

public class Timer extends Thread {

	private Reloj reloj;

	/**
	 * @param reloj
	 */
	public Timer(Reloj reloj) {
		super();
		this.reloj = reloj;
	}

	/**
	 * @return the reloj
	 */
	public Reloj getReloj() {
		return reloj;
	}

	/**
	 * @param reloj
	 *            the reloj to set
	 */
	public void setReloj(Reloj reloj) {
		this.reloj = reloj;
	}

	public void run() {

		
		while (this.getReloj().isEstaEncendido()) {
			//this.getReloj().isEstaEncendido();
			this.getReloj().imprimir();
			this.getReloj().avanzarSegundo();

			try {
				sleep(1000);

			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
			
		}



}
