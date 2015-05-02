

/**
 * User object (has same fields as CUSTOMER table in database)
 * 
 * @author Cara Tang
 */
public class User {

	static String name;

	
	public User(String name) {

		User.name = name;

	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User , name=" + name
				;
	}

}
