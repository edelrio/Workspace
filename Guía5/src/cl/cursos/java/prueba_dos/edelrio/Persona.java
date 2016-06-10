/**
 * 
 */
package cl.cursos.java.prueba_dos.edelrio;

/**
 * @author edelrio
 *
 */

public class Persona {

	private String nombre;
	private int edad;
	private String rut;
	private double peso;
	private double altura;

	/**
	 * @param nombre
	 * @param edad
	 * @param rut
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, String rut, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.rut = rut;
		this.peso = peso;
		this.altura = altura;
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad
	 *            the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut
	 *            the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso
	 *            the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura
	 *            the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * 
	 * @return con el siguiente metodo podremos calcular el IMC de cada persona
	 *         aplicando el calculo establecido para el calculo final del IMC
	 */
	public double calcularIMC() {
		double pesoIdeal = (this.getPeso() / (this.getAltura() * this.getAltura()));
		return pesoIdeal;
		if (pesoIdeal < 25 && pesoIdeal >= 20) {
			return 0;
		}
		if (pesoIdeal > 25) {
			return 1;

		}
		if (pesoIdeal < 20) {
			return -1;
		}
	}

	public boolean esMayorDeEdad() {
		if (this.getEdad() > 18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("NO es mayor de edad");
		}
		return false;

	}

	public void imprimir() {
		// System.out.println(this.getNombre(),this.getEdad(),this.getRut(),
		// this.getPeso(),this.getAltura());

		System.out.println(this.calcularIMC());

	}
}
