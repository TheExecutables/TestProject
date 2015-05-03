

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Data access for customers in the FiredUp database CUSTOMER table
 * @author Cara Tang
 */
public class UserDB implements  TestItemDAO{
	//private static final String GET_CUSTOMERS_SQL = "SELECT CustomerID, Name, StreetAddress, ApartmentNbr, City, StateProvince, ZipCode, Country FROM CUSTOMER";
	static int mPersonID;
	static String mName;
	static String mEmail = "hobo";
	private static final String GET_CUSTOMERS_SQL = "SELECT word FROM Test;";
	//private static final String CREATE_USER_SQL = "INSERT INTO Users(PersonID, Name, Email)VALUES(" + mPersonID + "," + mName + "," + mEmail + ");";




	@Override
	public List<TestItem> getTestItems() {
		List<TestItem> items = new ArrayList<>();
		try (
				Connection connection = DBSetup.getConnection();
				PreparedStatement stmt = connection.prepareStatement(GET_CUSTOMERS_SQL);
				ResultSet rs = stmt.executeQuery()
		) {
			while (rs.next()) {
				items.add(new TestItem(rs.getString("word")));

			}
			return items;
		}
		catch (SQLException se) {
			System.err.println(se);
			return null;
		}
	}

	
	public void setUserID(int personID, String name, String email){
		UserDB.mPersonID = personID;
		UserDB.mName = name;
		UserDB.mEmail = email;
	}
	
	public void createUser(){
		
		String sql = "INSERT INTO Users( Name, Email)"
					+"VALUES" + "("  + "'" +  mName + "'" + "," + "'" + mEmail + "'" + ")" + ";";
		//System.out.println(mPersonID);
		System.out.println("sql = " + sql);
		try {
				System.out.println(mPersonID);
				System.out.println(mName);
				System.out.println(mEmail);
				
				Connection connection = DBSetup.getConnection();
				Statement stmt = connection.createStatement();		
				int rs = stmt.executeUpdate(sql);
				System.out.println("got to here");
				System.out.println(rs);
				
			}
		catch (SQLException se) {
			System.err.println(se.getStackTrace());
			
		}
		
		
	}

}
