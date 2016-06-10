package cl.cursos.java.ejemplos;

public class Alumno {
	String nombre;
	int nota1;
	int nota2;
	int nota3;
	int promedio;
	
	public int getPromedio() {
		return promedio;
	}

	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}

	public Alumno(){
		this.nombre = "Eduardo";
		this.nota1 = 40;
		this.nota2 = 40;
		this.nota3 = 40;
		
	}

	public Alumno(String nombre, int nota1, int nota2, int nota3){
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
				
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	public int promedio(){
		
		this.promedio = (this.nota1 + this.nota2 + this.nota3)/3;
		return this.promedio;
	}
	public void imprimir(){
		System.out.println("Nombre : " + this.nombre);
		System.out.println("Nota 1 : " + this.nota1);
		System.out.println("Nota 2 :" + this.nota2);
		System.out.println("nota 3 :" + this.nota3);
		System.out.println("El promedio es :" + this.promedio);
		
	}
	
}
