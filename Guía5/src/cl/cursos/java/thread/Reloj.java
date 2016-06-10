package cl.cursos.java.thread;

public class Reloj {

	private int segundo;
	private int minuto;
	private int hora;
	private boolean estaEncendido;

	/**
	 * @param segundo
	 * @param minuto
	 * @param hora
	 * @param estaEncendido
	 */
	public Reloj(int segundo, int minuto, int hora, boolean estaEncendido) {
		super();
		this.segundo = segundo;
		this.minuto = minuto;
		this.hora = hora;
		this.estaEncendido = estaEncendido;
	}

	/**
	 * @return the segundo
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * @param segundo
	 *            the segundo to set
	 */
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	/**
	 * @return the minuto
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * @param minuto
	 *            the minuto to set
	 */
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * @param hora
	 *            the hora to set
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}

	


	/**
	 * @return the estaEncendido
	 */
	public boolean isEstaEncendido() {
		return estaEncendido;
	}

	/**
	 * @param estaEncendido the estaEncendido to set
	 */
	public void setEstaEncendido(boolean estaEncendido) {
		this.estaEncendido = estaEncendido;
	}

	public void avanzarSegundo() {
		this.segundo++;
		if (this.getSegundo() == 60) {
			this.setSegundo(0);
			this.avanzarMinuto();

		}

	}

	public void avanzarMinuto() {

		this.minuto++;

		if (this.getMinuto() == 60) {
			this.setMinuto(0);
			this.avanzarHora();

		}
	}

	public void avanzarHora() {
		this.hora++;
		if (this.getHora() == 60) {
			this.setHora(0);

		}

	}
	public void imprimir(){
		System.out.println(this.getHora() + ":" + this.getMinuto() + ":" + this.getSegundo());
	}

}
