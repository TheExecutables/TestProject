import java.util.ArrayList;
import java.util.List;

/**
 * Created by James on 5/2/2015.
 */



/**
 * A list of words with position pointer indicating which is the current word
 * The position pointer starts out at the first word and
 * may be moved backward and forward through the list.
 * The current word may be retrieved.
 *
 * @author Cara Tang
 *
 */
public class TestList {
    private ArrayList<Holds2> words;
    private int pos;

    public TestList() {
        words = new ArrayList<>();
        pos = 0;
    }



    /**
     * Set the word list to the list given, and reset the position pointer to the first word
     *
     * @param words a list of words
     */
    public void setWords(ArrayList<Holds2> words) {
        this.words = words;
        this.pos = 0;
    }

    /**
     * @return the current word, or null if the word list is empty
     */
    public Holds2 getCurrentWord() {
        if (pos < words.size()) {
                return words.get(pos);

            }
        else return null;
    }



    /**
     * Advance 1 position in the word list
     * If the position is already at the last word, it is not changed
     */
    public void nextWord() {
        if(pos < words.size()-1) {
                pos++;
        }
    }

    /**
     * Retreat 1 position in the word list
     * If the position is already at the first word, it is not changed
     */
    public void prevWord() {
        if (pos > 0) {
            pos--;
        }
    }

}