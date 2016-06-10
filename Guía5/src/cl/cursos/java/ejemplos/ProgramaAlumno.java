package cl.cursos.java.ejemplos;

public class ProgramaAlumno {

	public static void main(String[] args) {
		Alumno infoAlumno = new Alumno("zizarro", 35, 25, 70);
		Alumno alumnoInfo = new Alumno();
		infoAlumno.promedio();
		alumnoInfo.promedio();
		infoAlumno.imprimir();
		alumnoInfo.imprimir();
		
	}
	//public int getpromedio(){
		//return promedio;
	//}
}
