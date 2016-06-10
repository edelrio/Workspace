package cl.cursos.java.guia9;

public class Vehiculo {
	
	private int codigoVehiculo;
	private String marca;
	private String tipo;
	private String modelo;
	private String patente;
	private int kilometraje;
	private int precioVenta;
	private int unidadVenta;
	public int getCodigoVehiculo() {
		return codigoVehiculo;
	}
	public void setCodigoVehiculo(int codigoVehiculo) {
		this.codigoVehiculo = codigoVehiculo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	public int getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getUnidadVenta() {
		return unidadVenta;
	}
	public void setUnidadVenta(int unidadVenta) {
		this.unidadVenta = unidadVenta;
	}
	/**
	 * @param codigoVehiculo
	 * @param marca
	 * @param tipo
	 * @param modelo
	 * @param patente
	 * @param kilometraje
	 * @param precioVenta
	 * @param unidadVenta
	 */
	public Vehiculo(int codigoVehiculo, String marca, String tipo, String modelo, String patente, int kilometraje,
			int precioVenta, int unidadVenta) {
		super();
		this.codigoVehiculo = codigoVehiculo;
		this.marca = marca;
		this.tipo = tipo;
		this.modelo = modelo;
		this.patente = patente;
		this.kilometraje = kilometraje;
		this.precioVenta = precioVenta;
		this.unidadVenta = unidadVenta;
	}
	

}
