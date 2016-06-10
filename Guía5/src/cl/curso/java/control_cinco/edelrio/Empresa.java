package cl.curso.java.control_cinco.edelrio;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import Collect.Contacto;

public class Empresa {

	private String nombre;
	private List<Empleado> empleados;

	/**
	 * @param nombre
	 * @param empleados
	 */
	public Empresa(String nombre, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.empleados = empleados;
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
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados
	 *            the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void ordenarEmpleadosPorNombre() {
		Collections.sort(empleados, new Comparator<Empleado>() {

			@Override
			public int compare(Empleado e1, Empleado e2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});

	}

	public void ordenarEmpleadosPorDepartamento(){
		
		Collections.sort(empleados, new Comparator<Empleado>() {

			@Override
			public int compare(Empleado e1, Empleado e2) {
				{

					if(e1.getRut().compareTo(e2.getRut()){
						System.out.println("empleado encontrado");
					}
					
					
				}

		});
	}

	public void empleadoNoEncontrado() {

	}

	public Empleado buscarEmpleado(String rut) {

		if (this.getEmpleados().equals(getEmpleados())) {
			return (Empleado) getEmpleados();
		} else {
			System.out.println("empleado no encontrado");

		}
		return null;

	}

	public void imprimir() {
		Iterator<Empleado> it = this.getEmpleados().iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getDepartamento().getNombre());

		}
	}
}
