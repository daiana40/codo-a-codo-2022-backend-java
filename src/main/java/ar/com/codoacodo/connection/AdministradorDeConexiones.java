package ar.com.codoacodo.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {

	public static Connection getConnection() {
		
		
		
		String url = System.getenv("DATASOURCE_URL");
		String user = System.getenv("DATASOURCE_USERNAME");
		String password = System.getenv("DATASOURCE_PASSWORD");
		String driverName = System.getenv("DATASOURCE_DRIVER");
		
		//control de errores
		
		Connection con = null;
		try {
			Class.forName(driverName); //carga en memoria el driver
			con = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			e.printStackTrace(); //Se que pasó o por qué falló
		}
		return con;
	}

	public static void main(String[] args) {
		Connection con = AdministradorDeConexiones.getConnection();
		
		if (con != null) {
			System.out.println("Conexion ok");
		}else {
			System.err.println("Conexion fail");
		}
		}
}
