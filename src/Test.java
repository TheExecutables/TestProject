import org.paukov.combinatorics.CombinatoricsVector;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;
import org.paukov.combinatorics.combination.simple.SimpleCombinationGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {
    private TestItemDAO testItemDAO = DAOFactory.getTestItemDAO();
    private List<TestItem> testItems = testItemDAO.getTestItems();


    public Test() {

        make2Array();
        printList();
    }


    // stole this from https://code.google.com/p/combinatoricslib/
    // make sure I credit.
     public ArrayList<Holds2>  make2Array(){
         ArrayList<Holds2> twoItemArray = new ArrayList<>();
        // create combinatorics vector
        ArrayList tempArray = getTestItemArrayList();
        CombinatoricsVector<String> initialVector = new CombinatoricsVector<String>(tempArray);

        // create simple combination generator to generate 3-combination
        Generator<String> gen = new SimpleCombinationGenerator<String>(initialVector , 2);

        // create iterator
        Iterator<ICombinatoricsVector<String>> itr = gen.createIterator();


        // print the number of combinations
        System.out.println("Number of combinations is: " + gen.getNumberOfGeneratedObjects());

        // go through the iterator
        while (itr.hasNext()) {
            ICombinatoricsVector<String> combination = itr.next();
            twoItemArray.add(new Holds2(combination.getValue(0), combination.getValue(1)));
            //System.out.println(combination);
        }

         Collections.shuffle(twoItemArray);
        return twoItemArray;


    }


    public ArrayList getTestItemArrayList(){
        ArrayList<String> list =  new ArrayList<>();
        for (TestItem item : testItems) {
            list.add(item.getWord());
        }
        return list;
    }


    public void printList() {
        ArrayList<Holds2> tacos = make2Array();
        for (Holds2 item : tacos) {
            System.out.println(item.getFirst()+ "  " + item.getSecond());


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