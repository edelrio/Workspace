package cl.cursos.java.guia11;

public class ProgramaBus {

	public static void main(String[] args) {

		Asiento[] asiento = {new Asiento(), new Asiento(), new Asiento()};
		Bus bus = new Bus("K1000-0", asiento);
		ReservaThread hilo1= new ReservaThread(bus, 1);
		ReservaThread hilo2= new ReservaThread(bus, 2);
		hilo1.start();
		hilo2.start();
		bus.reservarAsiento(1);
	}

}
