

/**
 * Customer object (has same fields as CUSTOMER table in database)
 * 
 * @author Cara Tang
 */
public class Customer {

	static String name;

	
	public Customer(String name) {

		Customer.name = name;

	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Customer , name=" + name
				;
	}

}
