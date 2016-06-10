package cl.cursos.java.herencia;

public class Batman extends SuperHeroe {

	@Override
	public void recibirAtaque(Arma arma) {
		if (arma instanceof Granada) {
			System.out.println("Muere");
		} else {
			System.out.println("Sobrevive");
		}
	}

}
