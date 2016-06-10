package cl.cursos.java.herencia;

public abstract class TarjetaBip implements Pagable{

	private int saldo;
	private int numeroTarjeta;
	private String color;
	
	public static final 

	public TarjetaBip() {
		this.saldo = 100;
		this.numeroTarjeta = 32323232;
	}

	/**
	 * @param saldo
	 * @param numeroTarjeta
	 * @param color
	 */
	public TarjetaBip(int saldo, int numeroTarjeta, String color) {
		super();
		this.saldo = saldo;
		this.numeroTarjeta = numeroTarjeta;
		this.color = color;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void recargar(int monto);

	public abstract void pagarViaje(int monto);
	
	public void imprimir()
	{
	
		System.out.println(this.getNumeroTarjeta());
		System.out.println(this.getSaldo());
		
	}

}
