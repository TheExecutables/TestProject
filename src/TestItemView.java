
/**
 * Interface for a view of a WordList model
 *
 * @author Cara Tang
 */
public interface TestItemView {

    /**
     * Update the current word shown in this view to newWord.
     *
     * @param newWord  the new current word
     */

    public void updateWord(String first, String second);



    /**
     * Register the given controller with this view.
     * Methods on the controller are invoked when events in the view occur that could change the model.
     *
     * @param controller  the word list controller to register with this view
     */
    public void registerController(TestItemController controller);

}
