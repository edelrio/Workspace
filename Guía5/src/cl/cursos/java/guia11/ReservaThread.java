package cl.cursos.java.guia11;

public class ReservaThread extends Thread {

	private Bus bus;
	private int numeroAsiento;

	public Bus getBus() {
		return bus;
	}

	public ReservaThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public int getNumeroAsiento() {
		return numeroAsiento;
	}

	public void setNumeroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	public ReservaThread(Bus bus, int numeroAsiento) {
		super();
		this.bus = bus;
		this.numeroAsiento = numeroAsiento;
	}

	@Override
	public void run() {
	
		
		bus.reservarAsiento(this.getNumeroAsiento());
	}
	
}
