import java.util.List;

/**
 * Created by James on 5/1/2015.
 */

public class DAOFactory {

    public static TestItemDAO getTestItemDAO() {
        TestItemDAO testItemDAO = new UserDB() ;
        return testItemDAO;
    }
}
