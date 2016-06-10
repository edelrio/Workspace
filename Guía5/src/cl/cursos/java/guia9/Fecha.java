package cl.cursos.java.guia9;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public void validarDia() throws DiaNoValidoException {
		if (validarMes()) {
			if (this.getMes() == 2 && this.esBisiesto()) {
				if (!(this.getDia() >= 1 && this.getDia() <= 29)) {
					throw new DiaNoValidoException("Si el año es bisiesto," + "puede exceder de 29 días");
				}

			} else {

				int cantDias = cantidadDiasMes[ this.getMes() -1];
				if( !(this.getDia() >= && this.getDia() <= cantdias)){
					throw new DiaNoValidoEception("Excede el numero maximo de dias" + "segun el mes " + this.getMes());
					
				}
			}
		}
	}

}
