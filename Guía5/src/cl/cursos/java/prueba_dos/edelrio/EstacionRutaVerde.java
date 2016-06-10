/**
 * 
 */
package cl.cursos.java.prueba_dos.edelrio;

/**
 * @author edelrio
 *
 */
public class EstacionRutaVerde extends Estacion {

	public EstacionRutaVerde(String nombre, String linea) {
		super(nombre, linea);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.cursos.java.prueba_dos.edelrio.Estacion#seDetieneTrenRutaRoja()
	 */
	@Override
	public boolean seDetieneTrenRutaRoja() {
		// TODO Auto-generated method stub
		return super.seDetieneTrenRutaRoja();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.cursos.java.prueba_dos.edelrio.Estacion#seDetieneTrenRutaVerde()
	 */
	@Override
	public boolean seDetieneTrenRutaVerde() {
		if (this.seDetieneTrenRutaVerde()) {

		}

	}

}
