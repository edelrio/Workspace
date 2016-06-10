package cl.cursos.java.thread;

public class Programa {

	public static void main(String[] args) {

		Reloj reloj = new Reloj(0,0,0,false);
		reloj.setEstaEncendido(true);
		Timer timer = new Timer(reloj);
		
		timer.start();
		ApagarReloj apagar = new ApagarReloj(reloj, 25000);
		apagar.start();

	}

}
