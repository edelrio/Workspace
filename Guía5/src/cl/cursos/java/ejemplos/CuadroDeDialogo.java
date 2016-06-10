package cl.cursos.java.ejemplos;

import javax.swing.JOptionPane;

import cl.curso.java.guia1.Ejercicio1;

public class CuadroDeDialogo {

	public static void main(String[] args){
		String nota1 = JOptionPane.showInputDialog("Ingrese nota 1");
		String nota2 = JOptionPane.showInputDialog("Ingrese nota 2");
		String nota3 = JOptionPane.showInputDialog("Ingrese nota 3");
		
		int n1 = Integer.parseInt(nota1);
		int n2 = Integer.parseInt(nota2);
		int n3 = Integer.parseInt(nota3);
		
		Ejercicio1 ejercicio = new Ejercicio1();
		int promedio = ejercicio.promedio(n1, n2, n3);
		
		JOptionPane.showMessageDialog(null, promedio );
	}
	
}


