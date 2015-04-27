import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 * 
 * @author James Woodward
 *
 */

public class MenuBar extends JMenuBar implements ActionListener{

    private JMenu menu;
    private JMenu help;

    JMenuItem menuItem;
	
	public MenuBar() {
		createMenu();
		
	}
	
	public void createMenu(){
		menu = new JMenu("FILE");
		help = new JMenu("HELP");
		menuItem = new JMenuItem("yoolo");
		menuItem.addActionListener(this);
		MainFrame.cl.show(MainFrame.cards, MainPanel.MAINPANEL);
		add(menu);
		add(help);
		menu.add(menuItem);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		MainFrame.cl.show(MainFrame.cards, MainPanel.MAINPANEL);
		
	}

}


