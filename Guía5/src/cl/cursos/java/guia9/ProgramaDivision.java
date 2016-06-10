package cl.cursos.java.guia9;

import javax.swing.JOptionPane;

public class ProgramaDivision {

	public static void main(String[] args) {

		int dividendo = obtenerNumero("dividendo");
		int divisor = obtenerNumero("divisor");

		Division division = new Division(dividendo, divisor);
		try {
			division.hacerDivision();
			double resultado = division.hacerDivision();
			JOptionPane.showMessageDialog(null, "el resultado es " + resultado);
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Error al realizar la division" + e.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	public static int obtenerNumero(String nombreDelCampo) {

		int numero = 0;

		boolean numeroValido = false;
		do {

			try {
				String dividendo = JOptionPane.showInputDialog("Ingresar " + nombreDelCampo);
				numero = Integer.parseInt(dividendo);

				numeroValido = !numeroValido;

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error al ingresar el dividendo" + e.getMessage(), "Error",
						JOptionPane.ERROR_MESSAGE);

			}
		} while (!numeroValido);
		return numero;

	}

	// String divisor = JOptionPane.showInputDialog("Ingresar divisor");
	// Division division = new Division(Double.parseDouble(dividendo),
	// Double.parseDouble(divisor));

	// division.hacerDivision();
	// division.imprimir();

}
