import java.util.ArrayList;
import java.util.List;

/**
 * Data access object interface for Customers
 * Provides method to retrieve the list of customers
 * If we could update customer information there would also be methods for that, such as the commented methods below
 *
 * @author Cara Tang
 */
public interface TestItemDAO {
      List<TestItem> getTestItems();

    //boolean addCustomer(Customer customer);
    //boolean deleteCustomer(Customer customer);
    //boolean updateCustomer(Customer customer);
}