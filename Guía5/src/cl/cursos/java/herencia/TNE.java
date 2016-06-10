package cl.cursos.java.herencia;

public abstract class TNE extends TarjetaBip {

	private String nombre;
	private Date date;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * 
	 */
	public TNE() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param saldo
	 * @param numeroTarjeta
	 * @param color
	 */
	public TNE(int saldo, int numeroTarjeta, String color) {
		super(saldo, numeroTarjeta, color);
		// TODO Auto-generated constructor stub
	}

	public void imprimir()
	{
	
		super.imprimir();
		System.out.println( this.getNombre());
		System.out.println( this.date);
		
	}
	
}
