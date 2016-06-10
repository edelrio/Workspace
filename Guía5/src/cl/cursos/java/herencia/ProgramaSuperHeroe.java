package cl.cursos.java.herencia;


public class ProgramaSuperHeroe {
	
	public static void main(String[] args){
		
		Batman batman = new Batman();
		Superman superman = new Superman();
		Granada granada = new Granada();
		Kriptonita kriptonita = new Kriptonita();
		
		batman.recibirAtaque(granada);
		batman.recibirAtaque(kriptonita);
		
		superman.recibirAtaque(granada);
		superman.recibirAtaque(kriptonita);
		
		
	}

}
