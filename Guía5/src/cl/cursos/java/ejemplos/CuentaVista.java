package cl.cursos.java.ejemplos;

public class CuentaVista {
	private int saldo;
	private int giroMaximo;

	public CuentaVista(){
		
		this.saldo = 0;
		this.giroMaximo = 200000;
		
	}

	public CuentaVista(int saldo, int giroMaximo) {

		this.saldo = saldo;
		this.giroMaximo = giroMaximo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getGiroMaximo() {
		return giroMaximo;
	}
	

	public void setGiroMaximo(int giroMaximo) {
		this.giroMaximo = giroMaximo;
	}
	public void depositar(int deposito){
		this.saldo = this.saldo + deposito;
	}
	public void girar( int montoAGirar){
		if (montoAGirar > this.giroMaximo){
			System.out.println("Ha superado el monto maximo de giro");
		}
		if(montoAGirar > this.saldo){
			System.out.println("El saldo a retirar excede su monto");
		}
		else
		{
			this.saldo = this.saldo - montoAGirar;
		}
	}

}
