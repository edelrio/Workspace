
public class Amarillo extends EstadoSemaforo {

	@Override
	public void siguienteColor(Semaforo semaforo) {
		semaforo.setEstadoSemaforo( new Rojo());

	}

}
