package cl.cursos.java.ejemplos;

public class Persona {

	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	int edad;

	public Persona() {

		this.nombre = "Eduardo";
		this.apellidoPaterno = "Del Río";
		this.apellidoMaterno = "Vera";
		this.edad = 23;

	}

	public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void imprimir() {
		System.out.println("Nombre : " + this.nombre);
		System.out.println("Apellido Paterno : " + this.apellidoPaterno);
		System.out.println("Apellido Materno : " + this.apellidoMaterno);
		System.out.println("Edad : " + this.edad);
	}
}
