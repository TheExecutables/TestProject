import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test {
    private TestItemDAO testItemDAO = DAOFactory.getTestItemDAO();
    private List<TestItem> testItems = testItemDAO.getTestItems();

    public Test() {
        //startTest();
        printList();
    }


    public void printList() {
        for (TestItem item : testItems) {
            System.out.println(item.getWord());
        }
    }
}

/*
    public void addTestItemToDB(){

        String sql = "INSERT INTO Test( word)"
                +"VALUES" + "("  + "'" +  mWord + "'" + "," + "'" + mEmail + "'" + ")" + ";";
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
    */

//    public void pullTestQuestionsFromDB(){

    //}



//}
// i need to add a screen to add testItems to the database.
// i need to read in test items from the database.
// i arelady have most the code in wordPanelDoc