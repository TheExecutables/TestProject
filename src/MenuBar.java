import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 * 
 * @author James Woodward, Andrew Seaton
 *
 */

public class MenuBar extends JMenuBar {

    private JMenu menu;
    private JMenu help;

	JMenuItem menuItem1;
	JMenuItem menuItem2;

	public MenuBar() {
		createMenu();
		
	}
	
	public void createMenu(){
		menu = new JMenu("File");
		help = new JMenu("Help");
		menuItem1 = new JMenuItem("Admin Login");
		menuItem2 = new JMenuItem("User Login");
		menuItem1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.cl.show(MainFrame.cards, AdminPanel.ADMINPANEL);
			}
		});
		menuItem2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame.cl.show(MainFrame.cards, MainPanel.MAINPANEL);
			}
		});
		// MainFrame.cl.show(MainFrame.cards, MainPanel.MAINPANEL);
		add(menu);
		add(help);
		menu.add(menuItem1);
		menu.add(menuItem2);
	}



}


