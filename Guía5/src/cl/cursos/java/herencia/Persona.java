package cl.cursos.java.herencia;

public class Persona {
	
	private String rut;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	
	/**
	 * 
	 */
	
	
	
	public Persona()
	{}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
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

	public Persona(String rut, String nombre, String apellidoPaterno, String apellidoMaterno) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}
	public void irAClases()
	{
		
		System.out.println("Ir a clases");
	}

}
