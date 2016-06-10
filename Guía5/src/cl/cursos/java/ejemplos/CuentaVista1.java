package cl.cursos.java.ejemplos;

public class CuentaVista1 extends CuentaBancaria {
	
	public void girar( int monto){
		
		if(this.getSaldo() <=(monto+300) ){
			this.setSaldo(this.getSaldo() - (monto+300) );
		}
		else{
			
		}
			
	}

		this
}
