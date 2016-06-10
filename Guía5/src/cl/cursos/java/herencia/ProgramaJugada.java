package cl.cursos.java.herencia;

public class ProgramaJugada {

	public static void main(String[] args) {

		Piedra piedra = new Piedra();
		Papel papel = new Papel();
		Tijera tijera = new Tijera();

		piedra.jugar(papel);

		piedra.jugar(tijera);

		papel.jugar(tijera);

		papel.jugar(piedra);

		tijera.jugar(piedra);

		tijera.jugar(papel);
	}

}
