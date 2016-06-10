package cl.cursos.java.guia11;

public class Asiento {
	
	
	private boolean reservado;
	
	public Asiento(){
		this.reservado = false;
	}
	
	
	/**
	 * @return the reservado
	 */
	public boolean isReservado() {
		return reservado;
	}

	/**
	 * @param reservado the reservado to set
	 */
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	/**
	 * @param reservado
	 */
	public Asiento(boolean reservado) {
		super();
		this.reservado = reservado;
	}

	;
	

}
