package ar.com.codoacodo.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministradorDeConexiones {

	public static Connection getConnection() {
		/*String url = "jdbc:mysql://127.0.0.1:3306/codo-a-codo?serverTimeZone=UTC&userSSL=false";
		String username = "root";
		String password = "Agustina15";
		
		String driverName = "com.mysql.cj.jdbc.Driver"; //mysql o postgres
		*/
		String url = System.getenv("DATASOURCE_URL");
		String user = System.getenv("DATASOURCE_USERNAME");
		String password = System.getenv("DATASOURCE_PASSWORD");
		String driverName = System.getenv("DATASOURCE_DRIVER");
		
		//control de errores
		Connection con = null;
		try {
			Class.forName(driverName);
		    con = DriverManager.getConnection(url, user, password);
			
		}catch(Exception e){
			e.printStackTrace();
			}
		return con;
			
		}
	public static void main(String[] args) {
		Connection con = AdministradorDeConexiones.getConnection();
		if(con != null) {
			System.out.println("Conexion OK");
		}else {
			System.out.println("Conexion Fail");
		}
	
	}
		
	}


