
public class Rojo extends EstadoSemaforo {

	@Override
	public void siguienteColor(Semaforo semaforo) {
		semaforo.setEstadoSemaforo( new Verde());
		

	}

}
