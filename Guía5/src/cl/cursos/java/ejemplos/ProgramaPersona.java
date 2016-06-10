package cl.cursos.java.ejemplos;

public class ProgramaPersona {

	public static void main(String[] args) {

		Persona infoPersona = new Persona("Matías", "Solar", "Del Río", 2);
		Persona personaInfo = new Persona();
		infoPersona.imprimir();
		personaInfo.imprimir();

	}

}
