import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * 
 * @author James Woodward
 *
 */

public class MainFrame extends JFrame implements TestItemView {
    private TestPanel testPanel;
    private TestItemController controller;
    private final static Dimension dim = new Dimension(420, 300);
    static JPanel cards = new JPanel();
    public static CardLayout cl = new CardLayout();

    public MainFrame() {
        lookAndFeel();
        setSize(dim);
        cards.setLayout(cl);
        cards.add(new MainPanel(), MainPanel.MAINPANEL);
        cards.add(new CreateUserPanel(), CreateUserPanel.CREATEUSERPANEL);
        cards.add(createTestPanel(), TestPanel.TESTSELECTPANEL);
        cards.add(new UserWelcomePanel(), UserWelcomePanel.USERWELCOMEPANEL);
        cards.add(new TestResultsListPanel(), TestResultsListPanel.LISTPANEL);
        cards.add(new AdminPanel(), AdminPanel.ADMINPANEL);
        cards.add(new TestResultsListPanel(), TestResultsListPanel.LISTPANEL);
        setJMenuBar(new MenuBar());
        showGUI();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
            }
        });
    }

    public void lookAndFeel(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }


 //WAIT WAIT MAKE ALL your CONTROLLERS THEN WRAP THEM IN THE CARDS.
    public TestPanel createTestPanel(){
        testPanel = new TestPanel();
        testPanel.addNextButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.processNextWordEvent();

            }
        });

        testPanel.addPrevButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                controller.processPrevWordEvent();

            }
        });
        return testPanel;

    }


    public void showGUI() {

        setContentPane(cards);

    }


    @Override
    public void updateWord(String newWord) {
       // testPanel.setWord(newWord);
        System.out.println("If this works this is huge");
    }

    @Override
    public void registerController(TestItemController controller) {
        this.controller = controller;
    }
}

/*
	public static void main(String args[]) {


        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TestList model = new TestList();
                model.setWords(createWordList());
                TestItemView view = new MainFrame();
                TestItemController controller = new TestItemController(model, view);
                view.registerController(controller);

            }
        });
        */






/*
    private WordPanel createWordPanel() {
        WordPanel wordPanel = new WordPanel();

        return wordPanel;
    }
}


    public WordListReaderFrame() {
        super("Word List Reader");

        wordPanel = createWordPanel();
        getContentPane().add(wordPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private WordPanel createWordPanel() {
        WordPanel wordPanel = new WordPanel();

        return wordPanel;
    }


}
*/

