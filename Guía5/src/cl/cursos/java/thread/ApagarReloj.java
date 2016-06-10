package cl.cursos.java.thread;

public class ApagarReloj extends Thread{

	private Reloj reloj;
	private long mili;
	/**
	 * @param reloj
	 * @param mili
	 */
	public ApagarReloj(Reloj reloj, long mili) {
		super();
		this.reloj = reloj;
		this.mili = mili;
	}
	/**
	 * @return the reloj
	 */
	public Reloj getReloj() {
		return reloj;
	}
	/**
	 * @param reloj the reloj to set
	 */
	public void setReloj(Reloj reloj) {
		this.reloj = reloj;
	}
	/**
	 * @return the mili
	 */
	public long getMili() {
		return mili;
	}
	/**
	 * @param mili the mili to set
	 */
	public void setMili(long mili) {
		this.mili = mili;
	}
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
	try {
		sleep(this.getMili());
		this.getReloj().setEstaEncendido(false);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}


	
}
