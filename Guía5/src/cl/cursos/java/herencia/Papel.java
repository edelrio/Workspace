package cl.cursos.java.herencia;

public class Papel extends Jugada {

	@Override
	public void jugar(Jugada jugada) {

		if (jugada instanceof Tijera) {
			System.out.println("Pierde Papel");

		}
		if (jugada instanceof Tijera) {
			System.out.println("Gana Papel");
		}
	}
}
