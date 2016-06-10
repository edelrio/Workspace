package cl.curso.java.guia1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Ejercicio1 ejercicio =new Ejercicio1();
		int promedio = ejercicio.promedio(30,50,60);
		System.out.println(int promedio);
	
	}
	
	public int promedio( int nota1, int nota2, int nota3 )
	{
		int promedio = (nota1 + nota2 + nota3)/3;
		return promedio;
	}
	

}
