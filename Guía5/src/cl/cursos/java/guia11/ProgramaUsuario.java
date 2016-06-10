package cl.cursos.java.guia11;

public class ProgramaUsuario {

	public static void main(String[] args) {


		Usuario usuario= new Usuario("Eduardo", "delrio",2);
		try {
			usuario.login("Eduardo", "delrio");
		} catch (AutenticacionEsception e) {
			System.out.println("Usuario o contraseña no son validos");
		} catch (CuentaBloqueadaException e) {


			System.out.println("Cuenta Bloqueada");
		}

	}

}
