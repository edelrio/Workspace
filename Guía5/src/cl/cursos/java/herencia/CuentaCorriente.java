package cl.cursos.java.herencia;


public class CuentaCorriente extends CuentaBancaria {

	private int lineaCredito;
	
	public CuentaCorriente()
	{
		System.out.println("Constructor de Cuenta Corriente");
	}

	public int getLineaCredito() {
		return lineaCredito;
	}

	public void setLineaCredito(int lineaCredito) {
		this.lineaCredito = lineaCredito;
	}
	
	public void girar( int monto)
	{
		if( monto <= (this.getSaldo() + this.getLineaCredito()) )
		{
			if(monto <= this.getSaldo())
			{
				this.setSaldo(this.getSaldo( ) - monto);
			}
			else
			{
				int resto = monto - this.getSaldo();
				this.setLineaCredito(this.getLineaCredito() - resto);
				this.setSaldo(0);
			}
		}
		else
		{
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void imprimir()
	{
		super.imprimir();
		
		//System.out.println(this.getNumeroCuenta());
		//System.out.println(this.getSaldo());
		System.out.println(" Linea de credito :" + this.getLineaCredito());
	}
}
