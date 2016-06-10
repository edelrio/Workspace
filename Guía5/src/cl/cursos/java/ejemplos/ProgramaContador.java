package cl.cursos.java.ejemplos;

public class ProgramaContador {

	public static void main(String[] args) {

		Contador contador = new Contador(0);
		AumentaThread aumenta1 =new AumentaThread(contador);
		AumentaThread aumenta2= new AumentaThread(contador);
		AumentaThread aumenta3= new AumentaThread(contador);
		
		aumenta1.start();
		aumenta2.start();
		aumenta3.start();
	}

}
