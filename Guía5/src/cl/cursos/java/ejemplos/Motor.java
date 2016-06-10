package cl.cursos.java.ejemplos;

/**
 * 
 * @author usuario
 *
 */

public class Motor {

	int caballosDeFuerza;
	String tipo;
	boolean encendido;

	public Motor() {
		this.caballosDeFuerza = 1000;
	}

	public Motor(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}

	public int getCaballosDeFuerza() {
		return caballosDeFuerza;
		
	}

	public void setCaballosDeFuerza(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Motor(int caballosDeFuerza, String tipo) {
		super();
		this.caballosDeFuerza = caballosDeFuerza;
		this.tipo = tipo;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	
}
