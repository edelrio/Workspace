package cl.cursos.java.control;

public class Libro {
	
	private String tituloLibro;
	private String autor;
	private int ejemplares;
	private int ejemplaresPrestados;
	
	public Libro(){
		
		this.tituloLibro = "control";
		this.autor = "Eduardo Del Río";
		this.ejemplares = 10;
		this.ejemplaresPrestados = 0;
		
	}

	public String getTituloLibro() {
		return tituloLibro;
	}

	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	
		public void prestarLibro(){
			if(this.ejemplares > this.ejemplaresPrestados);
			System.out.println("Se hace entrega de Libro");
			this.ejemplares = this.ejemplares - 1;
			
			if(this.ejemplares < ejemplaresPrestados)
				System.out.println("No hay stock para prestar libros");
		
				
		}
		public void devolverLibro(){
			
			this.ejemplares = ejemplares + 1;
		}
		public void imprimir(){
			System.out.println("El libro " + this.tituloLibro);
			System.out.println("Su autor es " + this.autor);
			System.out.println("Stock " + this.ejemplares);
			System.out.println("Libros prestados " + this.ejemplaresPrestados);
		}
		
}
