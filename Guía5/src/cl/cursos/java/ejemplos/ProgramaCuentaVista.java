package cl.cursos.java.ejemplos;

public class ProgramaCuentaVista {

	public static void main(String[] args) {
		CuentaVista cuenta1 = new CuentaVista();
		cuenta1.setSaldo(100000);
		cuenta1.setGiroMaximo(50000);
		
		cuenta1.depositar(20000);
		cuenta1.girar(400000);
	}

}
