package cl.cursos.java.ejemplos;

import javax.swing.JOptionPane;

public class ProgramaCaluculadora {

	public static void main(String[] args) {
		String numero1 =JOptionPane.showInputDialog("Ingrese numero 1");
		String numero2 =JOptionPane.showInputDialog("Ingrese numero 2");
		int n1 = Integer.parseInt(numero1);
		int n2 = Integer.parseInt(numero2);
		
		Calculadora cal = new Calculadora(n1, n2);
		int suma = cal.suma();
		System.out.println("La Suma es : " + suma);

		int resta = cal.resta();
		System.out.println("La Resta es : " + resta);
		int division = cal.division();
		System.out.println("La Division es : " + division);
		int multi = cal.multi();
		System.out.println( "La Multiplicacion es : " + multi);

	}

}
