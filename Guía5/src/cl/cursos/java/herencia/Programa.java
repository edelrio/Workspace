package cl.cursos.java.herencia;

public class Programa {

	public static void main(String[] args) {
		String[] cursos = { "java", "JEE" };

		Profesor profe = new Profesor("1-9", "eduardo", "del rio", "vera", cursos);

		int[] notas = { 70, 40 };
		Alumno alumno = new Alumno("19", "edu", "", "", notas);

		profe.irAClases();
		alumno.irAClases();

	}

}
