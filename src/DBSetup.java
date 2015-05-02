

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Handle connection to FiredUp database
 * @author Cara Tang
 */
public class DBSetup {
	private static final String FIREDUP_URL = "jdbc:jtds:sqlserver://cisdbss.pcc.edu/234a_exe";
	private static final String USERNAME = "234a_exe";
	private static final String PASSWORD = "exe_a432#";

	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(FIREDUP_URL, USERNAME, PASSWORD);
		return connection;
	}
	
}
