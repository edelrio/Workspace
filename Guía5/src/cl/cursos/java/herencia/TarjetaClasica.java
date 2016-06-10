package cl.cursos.java.herencia;

public class TarjetaClasica extends TarjetaBip implements Pagable{

	@Override
	public void recargar(int monto) {
		if( monto <=25000)
		{
			this.setSaldo(this.getSaldo() + monto );
		}
		else
		{
			System.out.println( "Debe recargar un Monto" + "Menor a 25000");
			
		}
		
	}

	@Override
	public void pagarViaje(int monto) {

		if(this.getSaldo() >= 740 )
		{
			this.setSaldo( this.getSaldo() - 740 );
		}
	}


	@Override
	public void pagar(int monto) {
		this.pagarViaje(740);
		
	}

	@Override
	public void pagarNeto(int monto) {
		// TODO Auto-generated method stub
		
	}

	


}
