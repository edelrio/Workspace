package cl.cursos.java.guia10;

public class FiguraGeometrica {

	private String color;
	private int cantidadLados;
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the cantidadLados
	 */
	public int getCantidadLados() {
		return cantidadLados;
	}
	/**
	 * @param cantidadLados the cantidadLados to set
	 */
	public void setCantidadLados(int cantidadLados) {
		this.cantidadLados = cantidadLados;
	}
	/**
	 * @param color
	 * @param cantidadLados
	 */
	public FiguraGeometrica(String color, int cantidadLados) {
		super();
		this.color = color;
		this.cantidadLados = cantidadLados;
	}

	public void dibujar()
	{
		
	}
	
	public double calcularArea()
	{
		
	}
}
