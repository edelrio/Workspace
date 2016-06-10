package cl.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProgramaInsertarRegistro {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		System.out.println("el programa se conecto");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.108:3306/curso", "alumnos", "java123");
		
		
		PreparedStatement pstatementInsert = conexion.prepareStatement("INSERT INTO alumnos(idalumno, nombre, apellido, apellidoMaterno)" 
		+ " VALUES (?,?,?,?);");
		pstatementInsert.setInt(1, 815);
		pstatementInsert.setString(2, "Edu");
		pstatementInsert.setString(3, "Del Rio");
		pstatementInsert.setString(4, "Vera");
		int resultpInsert = pstatementInsert.executeUpdate();
		System.out.println(resultpInsert);

		
		
		

	}

}
