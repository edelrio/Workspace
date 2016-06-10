package cl.cursos.java.ejemplos;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		Auto autoToyota = new Auto("rojo", "toyota", "aaaa23");
		Motor motorToyota = new Motor(2000, "bencina");
		autoToyota.setMotor(motorToyota);
		autoToyota.setColor("verde");
		
		boolean opcionSalir = false;
		do {
			String opcion = JOptionPane.showInputDialog("Opcion 1 : Encender auto\n" + "Opcion 2 : Avanzar\n"
					+ "Opcion 3 : Imprimir\n" + "Opcion 4 : Salir");
			switch (opcion) {
			case "1": {
				autoToyota.encender();
				break;
			}
			case "2": {
				String kilometrosRecorridos = JOptionPane.showInputDialog("Ingrese los Kilómetros");
				int km = Integer.parseInt(kilometrosRecorridos);

				autoToyota.avanzar(km);
				
				break;
			}
			case "3": {
				autoToyota.imprimir();
				
				break;
			}
			case "4": {
				opcionSalir = !opcionSalir;
			}
			default: {
				break;
			}
			}
		} while (!opcionSalir);

		
//
//		autoToyota.avanzar();
//		autoToyota.encender();
//		autoToyota.avanzar();

	}

}
