import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
/**
 * 
 * @author James Woodward
 *
 */

public class MainFrame extends JFrame {
	
	private final static Dimension dim = new Dimension(420,300);
	static JPanel cards = new JPanel();
	public static CardLayout cl = new CardLayout();
	private static String userName;
	//
	
	
	public MainFrame(){
		setSize(dim);
		//MainPanel
        System.out.println("nothing");
        Test test = new Test();
        System.out.println("nothing");
		//todo add controller class to handle model/views
		cards.setLayout(cl);
		cards.add(new MainPanel(), MainPanel.MAINPANEL);
		cards.add(new CreateUserPanel(), CreateUserPanel.CREATEUSERPANEL);
		cards.add(new TestPanel(), TestPanel.TESTSELECTPANEL);
		cards.add(new UserWelcomePanel(), UserWelcomePanel.USERWELCOMEPANEL);
		cards.add(new TestResultsListPanel(), TestResultsListPanel.LISTPANEL);
		cards.add(new AdminPanel(), AdminPanel.ADMINPANEL);
		cards.add(new TestResultsListPanel(), TestResultsListPanel.LISTPANEL);





		
		//UserDB custdb = new UserDB();
		//we cant set the text of the panel until the panel is created
		//custdb.setUserID(4, "ryan", "seacrest");
		//System.out.println(UserDB.mName);
		//custdb.createUser();
		//custdb.getCustomers();
		//custdb.createUser();
		
		 
		
		setJMenuBar(new MenuBar());
		showGUI();
		
	}
	
	public static void setUserName(String user){
		
		userName = user;
	}
	

	
	
	
	
	public  void showGUI(){
		
		setContentPane(cards);
		
	}
		
	

	public static void main(String args[]) {
   
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
        	
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	
                new MainFrame().setVisible(true);
                
            }
        });

	}

	public static String getUserName() {
		System.out.println(userName);
		return userName;
	}
}
