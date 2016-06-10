
public class Verde extends EstadoSemaforo {

	@Override
	public void siguienteColor(Semaforo semaforo) {
		semaforo.setEstadoSemaforo( new Amarillo());

	}

}
