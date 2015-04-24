

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data access for customers in the FiredUp database CUSTOMER table
 * @author Cara Tang
 */
public class CustomerDB {
	//private static final String GET_CUSTOMERS_SQL = "SELECT CustomerID, Name, StreetAddress, ApartmentNbr, City, StateProvince, ZipCode, Country FROM CUSTOMER";
	private static final String GET_CUSTOMERS_SQL = "SELECT name FROM customer WHERE CustomerID = 101";
	public Customer getCustomers() {
		Customer customer = null; 
		//List<Customer> customers = new ArrayList<>();
		try (
				Connection connection = FiredUpDB.getConnection();
				PreparedStatement stmt = connection.prepareStatement(GET_CUSTOMERS_SQL);
				ResultSet rs = stmt.executeQuery()
			) {
			while (rs.next()) {
				 customer = new Customer(rs.getString("Name"));
			}
			return customer;
		}
		catch (SQLException se) {
			System.err.println(se);
			return null;
		}
	}

}
