package cl.curso.java.control_cinco.edelrio;

/**
 * 
 * @author Edelrio
 *
 */
public class Empleado extends Persona {

	private Departamento departamento;
	private int salario;

	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param departamento
	 * @param salario
	 */
	public Empleado(String rut, String nombre, String apellido, int edad, Departamento departamento, int salario) {
		super(rut, nombre, apellido, edad);
		this.departamento = departamento;
		this.salario = salario;
	}

	/**
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento
	 *            the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param salario
	 *            the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/**
	 * el metodo equals comparar� los empleados seg�n su rut.
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Empleado) {
			Empleado emp = (Empleado) obj;
			return this.getRut().equals(emp.getRut());

		}
		return false;
	}
}
