package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
		
		private static final String CONTROLADOR = "org.postgresql.Driver";
		private static final String URL = "jdbc:postgresql://localhost:5432/Tienda";
		private static final String USUARIO = "postgres";
<<<<<<< HEAD
		private static final String CLAVE = "123456";
=======
		private static final String CLAVE = "54321";
>>>>>>> feature/RRamirez/inc-002
		Connection conexion = null;

		static {
			try {
				Class.forName(CONTROLADOR);
			} catch (ClassNotFoundException e) {
				System.out.println("Error a cargar el controlador" + e);
				e.printStackTrace();
			}
		}

		public Connection conectar() {

			try {

				conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
				//System.out.println("Conexion OK");

			} catch (SQLException e) {
				System.out.println("Error en la conexion" + e.getMessage());
				e.printStackTrace();
			}
			return conexion;
		}
}
