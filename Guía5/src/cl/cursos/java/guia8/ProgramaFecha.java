package cl.cursos.java.guia8;

public class ProgramaFecha {

	public static void main(String[] args) {

		Fecha fecha1 = new Fecha();
		System.out.println(fecha1);
		

		Fecha fecha2 = new Fecha(11, 5, 2016);
		System.out.println(fecha2 + toString());

		fecha1.imprimirFecha();
		fecha1.imprimirFechaFormato();

		fecha2.imprimirFecha();
		fecha2.imprimirFechaFormato();

		System.out.println(fecha1.validarDia());
		System.out.println(fecha2.validarDia());

		System.out.println(fecha1.validarMes());
		System.out.println(fecha2.validarMes());

	}

}
