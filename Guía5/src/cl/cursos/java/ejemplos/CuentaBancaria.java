package cl.cursos.java.ejemplos;

public class CuentaBancaria implements Pagable {

	private int saldo;
	private int numeroCuenta;
	
	
	public CuentaBancaria(){
		
	}
	
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public void girar ( int monto ){
		System.out.println("girar" + monto);
	}
}
