import java.util.ArrayList;

/**
 * Created by James on 5/2/2015.
 */
public class Main {

    public static void main(String args[]) {
        TestList model = new TestList();
        model.setWords(createWordList());

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                TestItemView view = new MainFrame();
                TestItemController controller = new TestItemController(model, view);
                view.registerController(controller);

            }
        });
    }
    private static ArrayList<Holds2> createWordList() {

        Test test = new Test();
        return test.make2Array();
    }

}