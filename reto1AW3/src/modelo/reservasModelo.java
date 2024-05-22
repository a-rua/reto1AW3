package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import objetos.reservas;

public class reservasModelo {
	
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
	
	public static ArrayList<reservas> getReserva() {
		ArrayList<reservas> ListaReserva = new ArrayList<>();
		Connection c = conexion();
		
		try {
			Statement st = c.createStatement();
			String sql = "SELECT * FROM `reservas`;";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int identificador_reserva = rs.getInt("identificador_reserva");
				String DNI = rs.getString("DNI");
				String nombre_evento = rs.getString("nombre_evento");
				int grupo = rs.getInt("grupo");
				int identificador_concierto = rs.getInt("identificador_concierto");
				
				reservas r = new reservas(identificador_reserva, DNI, nombre_evento, grupo, identificador_concierto);
				ListaReserva.add(r);
				
			}
;			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ListaReserva;
		
	}

}
