package cl.cursos.java.herencia;

public class Tijera extends Jugada {

	@Override
	public void jugar(Jugada jugada) {

		if (jugada instanceof Piedra) {
			System.out.println("Pierde Tijera");

		}

		if (jugada instanceof Papel) {
			System.out.println("Gana Tijera");
		}
	}

}
