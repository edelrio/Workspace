package cl.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;



public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("el programa se conecto");
			Connection  conexion = DriverManager.getConnection("jdbc:mysql://192.168.108:3306/curso","alumnos","java123");
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery("select * from alumnos");
			while(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getInt("idalumno"));
				
				System.out.println(rs.getString("nombre"));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString("apellido"));
				System.out.println(rs.getString(3));
				
							
			}
			String nombre = JOptionPane.showInputDialog("ingrese Nombre: ");
				
			int resultado = s.executeUpdate("INSERT INTO curso.alumnos(idalumno, nombre, apellido)" + " Values ('799', '"+nombre+"', 'Del Rio');");
			
			
		} catch (ClassNotFoundException e){
			
			System.out.println("el Driver requerido no esta cargado.");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
