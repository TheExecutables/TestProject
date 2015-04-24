

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Handle connection to FiredUp database
 * @author Cara Tang
 */
public class FiredUpDB {
	private static final String FIREDUP_URL = "jdbc:jtds:sqlserver://cisdbss.pcc.edu/FiredUp";
	private static final String USERNAME = "275student";
	private static final String PASSWORD = "275student";

	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(FIREDUP_URL, USERNAME, PASSWORD);
		return connection;
	}
	
}
