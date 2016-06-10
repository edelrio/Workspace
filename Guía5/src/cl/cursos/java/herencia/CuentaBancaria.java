package cl.cursos.java.herencia;

public class CuentaBancaria implements Pagable{
	private int numeroCuenta;
	private int saldo;
	
	public CuentaBancaria()
	{
		System.out.println("Constructor Cuenta Bancaria");
		
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public CuentaBancaria(int numeroCuenta, int saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	public void girar( int monto)
	{
		System.out.println("Girar [Cuenta Bancaria");
		
	}
	
	public void depositar( int monto)
	{
		System.out.println("Se depositara $" + monto);
		this.setSaldo(this.getSaldo() + monto);
		
	}
	
	public void imprimir()
	{
		System.out.println("Datos de la cuenta");
		System.out.println("N° cuenta : " + this.getNumeroCuenta());
		System.out.println("saldo : " + this.getSaldo());
		
	}

	@Override
	public void pagar(int monto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagarNeto(int monto) {
		// TODO Auto-generated method stub
		
	}

}
