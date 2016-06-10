package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Programa {

	public static void main(String[] args) throws InterruptedException {

		Hilos hilo = new Hilos();
		// hilo.start();
		// hilo.join();
		Thread thread = new Thread(new Ejecucion());
		// thread.start();

		Thread threadx = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();

					}
				}
			}
		});
		hilo.start();
		thread.start();
		threadx.start();

		System.out.println("fin programa");

	}

}
