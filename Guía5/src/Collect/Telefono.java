package Collect;

import java.util.ArrayList;
import java.util.Iterator;

public class Telefono {

	private ArrayList<Contacto> contacto;

	/**
	 * @param contacto
	 */
	public Telefono(ArrayList<Contacto> contacto) {
		super();
		this.contacto = contacto;
	}

	/**
	 * @return the contacto
	 */
	public ArrayList<Contacto> getContacto() {
		return contacto;
	}

	/**
	 * @param contacto
	 *            the contacto to set
	 */
	public void setContacto(ArrayList<Contacto> contacto) {
		this.contacto = contacto;
	}

	public void imprimirFor() {

		for (int i = 0; i < this.contacto.size(); i++) {
			System.out.println(contacto.get(i));

		}
	}

	public void imprimirEach() {

		for (Contacto contacto : this.getContacto()) {
			System.out.println(contacto);
		}
	}

	public void imprimirIterador() {
		Iterator<Contacto> it = this.getContacto().iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getNombre());
		}

	}
}
