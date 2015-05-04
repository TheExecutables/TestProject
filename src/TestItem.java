/**
 * Created by James on 4/30/2015.
 */
public class TestItem {
    private String word;
    //private int itemNumber;

        public TestItem(String word){
            this.word = word;
        }

        public String getWord(){
            return word;
        }

        //public int getItemNumber(){
        //    return itemNumber;
        //}

        public String toString(){
            return "Word : " + word  ;//+ //itemNumber;
        }


}
