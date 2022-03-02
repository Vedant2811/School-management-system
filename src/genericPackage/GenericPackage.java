package genericPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericPackage {

	public static Connection getConnectionData() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldatabase", "root", "root");
		return con;
	}
	
}
