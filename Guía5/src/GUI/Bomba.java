package GUI;

public class Bomba extends Thread {

	private String[] numerosStr = { "Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve" };

	@Override
	public void run() {
		for (int i = 9; i >= 0; i--) {

			try {
				System.out.println(numerosStr[i]);
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();

			}
		}
	}

	public static void main(String[] s) throws InterruptedException {
		Bomba timer = new Bomba();
		System.out.println("Comienza la cuenta regresiva... ");
		timer.start();
		timer.join();
		System.out.println("BOOM!!!");

	}
}