package cl.cursos.java.ejemplos;

public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;
	
	
	public Cafetera(){
		
		this.capacidadMaxima = 1000;
		this.cantidadActual = 1000;
	}


	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}


	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}


	public int getCantidadActual() {
		return cantidadActual;
	}
	

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
	public Cafetera(int capacidadMaxima, int cantidadActual){
		
	}
}
