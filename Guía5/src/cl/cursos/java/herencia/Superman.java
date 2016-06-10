package cl.cursos.java.herencia;

public class Superman extends SuperHeroe {
	
	@Override
	public  void recibirAtaque( Arma arma ){
		if( arma instanceof Kriptonita){
			System.out.println("Muere");
			}
		else
		{
			System.out.println("Sobrevive");
		}
	}

}
