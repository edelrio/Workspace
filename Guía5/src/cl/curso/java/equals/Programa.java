package cl.curso.java.equals;

public class Programa {

	public static void main(String[] args) {
		Persona per1 = new Persona("Eduardo", "17.677.838-5");
		Persona per2 = new Persona("Eduardo", "17.677.838-5");

		System.out.println(per1.equals(per2));
		System.out.println(per1 == per2);

	}

}
