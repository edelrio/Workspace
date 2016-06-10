package cl.cursos.java.guia11;

public class Bus {
	private String nombre;
	private Asiento[] asiento;

	/**
	 * @param nombre
	 * @param asiento
	 */
	public Bus(String nombre, Asiento[] asiento) {
		super();
		this.nombre = nombre;
		this.asiento = asiento;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the asiento
	 */
	public Asiento[] getAsiento() {
		return asiento;
	}

	/**
	 * @param asiento
	 *            the asiento to set
	 */
	public void setAsiento(Asiento[] asiento) {
		this.asiento = asiento;
	}

	public synchronized void reservarAsiento(int numeroAsiento) {
		if (!this.getAsiento()[numeroAsiento].isReservado()) {

			this.getAsiento()[numeroAsiento].setReservado(true);
			System.out.println("El asiento numero : "+ numeroAsiento+ " fue reservado con exito" );

		}else{
			System.out.println("El asiento numero : " + numeroAsiento+   " está reservado");
		}
	}

}
