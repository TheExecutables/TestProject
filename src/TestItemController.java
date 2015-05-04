import javax.swing.*;

/**
 * Controller for a word list model & view.
 *
 * @author Cara Tang
 */
public class TestItemController {
    private TestList model;
    private TestItemView view;

    public TestItemController(TestList model, TestItemView view) {
        this.model = model;
        this.view = view;

        updateView();
    }

    // To be called by view
    public void processNextWordEvent() {

        model.nextWord();
        updateView();
    }

    // To be called by view
    public void processPrevWordEvent() {
        model.prevWord();
        updateView();
    }

    private void updateView() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                view.updateWord(model.getCurrentWord().getFirst(), model.getCurrentWord().getSecond());

            }
        });
    }
    //update



}