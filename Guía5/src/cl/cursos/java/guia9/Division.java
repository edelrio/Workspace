package cl.cursos.java.guia9;

public class Division {

	private double dividendo;
	private double divisor;
	
	
	public double getDividendo() {
		return dividendo;
	}
	public void setDividendo(double dividendo) {
		this.dividendo = dividendo;
	}
	public double getDivisor() {
		return divisor;
	}
	public void setDivisor(double divisor) {
		this.divisor = divisor;
	}
	/**
	 * @param dividendo
	 * @param divisor
	 */
	public Division(double dividendo, double divisor) {
		super();
		this.dividendo = dividendo;
		this.divisor = divisor;
	}
	public double  hacerDivision(){
		return (this.getDividendo() / this.divisor);
		
	}
	
	
	public void imprimir(){
		
		System.out.println(this.dividendo + ":" + this.divisor);
		
	}
}
