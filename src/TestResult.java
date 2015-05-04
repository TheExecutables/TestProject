import java.util.ArrayList;

/**
 * Created by James on 5/3/2015.
 */
public class TestResult {
    private int wins;
    private int lose;
    private int neither;
    private String word;
    private ArrayList<TestResult> results;

    TestResult(String word, int wins, int lose, int neither) {
        this.wins = wins;
        this.lose = lose;
        this.neither = neither;
        this.word = word;
        createResultsList();

    }

    public String toString() {
        return "'" + word + "'" + wins + "," + lose + "," + neither;

    }
    public  void createResultsList(){
        results = new ArrayList<>();
        ///results.add(new TestResult("james", 0,0,0);
    }
}
