package cl.cursos.java.herencia;

public class TNEUniversitaria extends TarjetaBip implements Pagable {

	@Override
	public void pagar(int monto) {

		if( monto <= 10000)
		{
			this.setSaldo(this.getSaldo() + monto)
			
		}
	}

	@Override
	public void pagarNeto(int monto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void recargar(int monto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pagarViaje(int monto) {
		// TODO Auto-generated method stub

	}

}
