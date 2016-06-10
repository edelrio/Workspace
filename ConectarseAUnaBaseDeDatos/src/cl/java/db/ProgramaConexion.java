package cl.java.db;

public class ProgramaConexion {

	public static void main(String[] args) {

		try {Conexion con = Conexion.getInsncia();
		Conexion con2 = Conexion.getInsncia();
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
	}

}
