package cl.curso.java.control_cinco.edelrio;

import java.util.List;

import Collect.Contacto;

import java.util.Collections;
import java.util.Comparator;

import cl.cursos.java.prueba_dos.edelrio.Imprimible;

public class CuentaBancaria {

	private int numero;
	private List<Transaccion> transacciones;

	/**
	 * @param numero
	 * @param transacciones
	 */
	public CuentaBancaria(int numero, List<Transaccion> transacciones) {
		super();
		this.numero = numero;
		this.transacciones = transacciones;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the transacciones
	 */
	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	/**
	 * @param transacciones
	 *            the transacciones to set
	 */
	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	public void abono(Transaccion abono1) {
		this.getTransacciones().add(abono1);
	}

	public void deposito(Transaccion deposito1) {
		this.getTransacciones().add(deposito1);

	}

	public void ordenarTransaccionesPorFecha() {

		Collections.sort(transacciones, new Comparator<Transaccion>() {

			@Override
			public int compare(Transaccion t1, Transaccion t2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
	}

	public void ordenarTransaccionesPorTipo() {
		Collections.sort(transacciones, new Comparator<Transaccion>() {

			@Override
			public int compare(Transaccion o1, Transaccion o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
	}

	public void imprimir() {

		for (Transaccion transacciones : this.getTransacciones()) {
			System.out.println(transacciones);
		}
	}
}
