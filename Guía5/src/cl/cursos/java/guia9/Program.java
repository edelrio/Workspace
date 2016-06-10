package cl.cursos.java.guia9;

public class Program {
	public static void main(String[] args){
		Permiso[] permisos = {new Permiso("permiso1"), new Permiso("permiso2")};
		for( int i = 0 < permisos.length ; i++)
		{
			Permiso permiso = permisos[i];
			System.out.println(permiso.getNombre());
			System.out.println(permisos[i].getNombre());
		}
	}

}
