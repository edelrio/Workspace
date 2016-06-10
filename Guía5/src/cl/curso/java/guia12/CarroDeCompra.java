package cl.curso.java.guia12;

import java.util.Collections;
import java.util.List;

public class CarroDeCompra {

	private Usuario usuario;
	private List<Producto> productos;

	/**
	 * @param usuario
	 * @param productos
	 */
	public CarroDeCompra(Usuario usuario, List<Producto> productos) {
		super();
		this.usuario = usuario;
		this.productos = productos;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the productos
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * @param productos
	 *            the productos to set
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public void agregarProducto(Producto productos) {

		this.getProductos().add(productos);

	}

	public void eliminarProducto(Producto productos) {

		if(this.getProductos().contains(productos))
		
		
		this.getProductos().remove(productos);

	}

	public void ordenarPorPrecio() {
		Collections.sort(productos);
	}

	public void totalCompra() {

	}

	public void imprimir() {

	}
}
