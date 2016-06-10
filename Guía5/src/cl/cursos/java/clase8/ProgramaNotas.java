package cl.cursos.java.clase8;

import javax.swing.JOptionPane;

import cl.cursos.java.clase8.Nota;
import cl.cursos.java.clase8.Alumno;

public class ProgramaNotas {

	public static void main(String[] args) {
		
		Nota[] notas = { new Nota("ctrl 1 ", 50, 25), new Nota("cntrl 2 ", 70, 25), new Nota("ctrl 3", 30, 50) };
		Nota[] notax = new Nota[3];
		for (int i = 0; i < notax.length; i++) 
		{
			String nota = JOptionPane.showInputDialog("Ingresar nota" + i);
			String porcentaje = JOptionPane.showInputDialog("Ingresar porcentaje" + i);
			notax[i] = new Nota("", Integer.parseInt(notas), 0);
		}
		Alumno alumno = new Alumno("Eduardo", notax);
		JOptionPane.showMessageDialog(null, "Promedio es : " + alumno.calcularPromedio());

	}

}
