package cl.cursos.java.control;

public class Articulo {

	private String producto;
	private int costoBase;
	private double ventaDetalle;
	private double ventaMayor;
	
	public Articulo(){
		
		this.producto = "producto";
		this.costoBase = 100;
		this.ventaDetalle = 0.15;
		this.ventaMayor = 0.3;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getCostoBase() {
		return costoBase;
	}

	public void setCostoBase(int costoBase) {
		this.costoBase = costoBase;
	}

	public double getVentaDetalle() {
		return ventaDetalle;
	}

	public void setVentaDetalle(int ventaDetalle) {
		this.ventaDetalle = ventaDetalle;
	}

	public double getVentaMayor() {
		return ventaMayor;
	}

	public void setVentaMayor(int ventaMayor) {
		this.ventaMayor = ventaMayor;
	}
	public void precioAlDetalle(){
		this.ventaDetalle = costoBase + (costoBase * ventaDetalle);
		
	}
	public void precioAlMayor(){
		this.ventaMayor = costoBase + (costoBase * ventaMayor);
	}
	public void imprimir(){
		System.out.println("El Articulo " + this.producto);
		System.out.println("su valor es de " + this.costoBase);
		System.out.println("El precio por detalle es de " + this.ventaDetalle);
		System.out.println("El precio por mayor es de " + this.ventaMayor);
		
	}
}
