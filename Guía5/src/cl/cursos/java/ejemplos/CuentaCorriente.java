package cl.cursos.java.ejemplos;

public class CuentaCorriente extends CuentaBancaria {

	
	private int lineaCredito;
	
	public void girar( int monto){
		if( monto <=(this.getSaldo() + this.getLineaCredito() ) ){
			
		}
		else{
			System.out.println("Saldo insuficiente");
		}
	}

	public int getLineaCredito() {
		return lineaCredito;
	}

	public void setLineaCredito(int lineaCredito) {
		this.lineaCredito = lineaCredito;
	}
}
