package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getDBConnection() throws ClassNotFoundException, SQLException
	{
		// Registering a Driver class
		Class.forName("com.mysql.jdbc.Driver");
		// Opening Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atlas","root","root");
		
		return con;
	}
}
