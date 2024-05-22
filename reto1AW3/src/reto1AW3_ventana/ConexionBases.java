package reto1AW3_ventana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import objetos.persona;

public class ConexionBases {

	private static Connection conexion() {
		String URI = "jdbc:mysql://localhost:3306/reservaconcierto";
		String usuarios = "root";
		String contraseña = "";

		Connection conect = null;

		try {
			conect = DriverManager.getConnection(URI, usuarios, contraseña);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error al conectar a la base de datos");
		}

		return conect;

	}

	public static ArrayList<persona> getUsuarios() {
		ArrayList<persona> ListaUsuarios = new ArrayList<>();
		Connection conect = conexion();

		try {
			Statement st = conect.createStatement();
			String sql = "SELECT * FROM `persona`;";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String DNI = rs.getString("DNI");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("apellido");
				String rol = rs.getString("rol");
				String mail = rs.getString("mail");
				int telefono = rs.getInt("telefono");
				String contrasena = rs.getString("contrasena");

				persona p = new persona(DNI, nombre, apellido, rol, mail, telefono, contrasena);
				ListaUsuarios.add(p);
			}

		} catch (SQLException e) {
			System.err.println("Error en el statement de getUsuarios");
		}

		return ListaUsuarios;

	}
}
