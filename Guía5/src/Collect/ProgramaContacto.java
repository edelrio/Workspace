package Collect;

import java.util.ArrayList;

public class ProgramaContacto {

	public static void main(String[] args) {

		ArrayList<Contacto> contacto = new ArrayList<Contacto>();
		contacto.add(new Contacto("Eduardo", 75388242, "e.delriovera@gmail.com"));
		contacto.add(new Contacto("Adrian", 67552853, "adrian.maturana30@gmail.com"));
		contacto.add(new Contacto("ejemplo", 12345667, "ejemplo@ejemplo.com"));

		Telefono telefono = new Telefono(contacto);
		telefono.imprimirFor();
		System.out.println("///////////");
		telefono.imprimirEach();
		System.out.println("///////////");
		telefono.imprimirIterador();

	}

}
