package cl.cursos.java.guia9;

public class Persona {

	private String nombre;
	private String apellido;
	private int telefono;

	public Persona() {
	}

	public Persona(String nombre, String apellido, int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.setTelefono(telefono);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	
		if((this.getTelefono() >= 100000000) && (this.getTelefono() <=999999999)){
			System.out.println("Numero ingresado no corresponde a un numero telefonico");
								
		}

	}

	public void imprimir() {
		System.out.println("Nombre : " + this.nombre);
		System.out.println("Apellido : " + this.apellido);
		System.out.println("Telefono : " + this.getTelefono());
	}
}
