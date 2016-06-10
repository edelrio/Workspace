package cl.cursos.java.ejemplos;

public class Auto {
	String color;
	String marca;
	String patente;
	Motor motor;
	int kilometrosRecorridos;

	public Auto() {
		color = "azul";
		marca = "default";
		patente = "jjjj23";

	}

	public Auto(String color, String marca, String patente) {
		this.color = color;
		this.marca = marca;
		this.patente = patente;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;

	}

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getColor() {
		return this.color;

	}

	public void setColor(String color) {
		this.color = color;
	}

	public void avanzar(int kilometros) {
		if (this.motor.isEncendido()) {
			
			
			this.kilometrosRecorridos =this.kilometrosRecorridos + kilometros;
			
			System.out.println("el vehiculo se está desplazando");
			
		} else {
			System.out.println("El auto no está encendido");
		}
	}

	public void encender() {
		this.motor.setEncendido(true);
		System.out.println(" El vehiculo está encendido");
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public void imprimir() {
		System.out.println("El color es " + this.color);
		System.out.println("La marca del vehiculo es " + this.marca);
		System.out.println("La patente del vehiculo es " + this.patente);
		System.out.println("el vehiculo ha avanzado" + this.kilometrosRecorridos);
	}

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}
}
