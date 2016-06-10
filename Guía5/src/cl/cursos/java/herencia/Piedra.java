package cl.cursos.java.herencia;

public class Piedra extends Jugada {

	@Override
	public void jugar(Jugada jugada) {

		if (jugada instanceof Papel) {
			System.out.println("Pierde Piedra");

		}
		if (jugada instanceof Tijera) {
			System.out.println("Gana Piedra");
		}
	}

}
