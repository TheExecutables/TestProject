import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * 
 * @author James Woodward
 *
 */
// "UserWelcomePanel.USERWELCOMEPANEL"
public class UserWelcomePanel extends JPanel {

	final static String USERWELCOMEPANEL = "USER WELCOME";
	private static String userName;
	private static JLabel jlabel1;
	public UserWelcomePanel() {
		initComponents();
		
}

	static void setUserName(String userName){
		UserWelcomePanel.userName = userName;
		jLabel1.setText("Welcome " + Customer.name);
	}
                        
private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    
    jLabel1.setText("Welcome," + userName );

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 33)); // NOI18N
    

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(44, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(50, 50, 50)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(105, Short.MAX_VALUE))
    );
}// </editor-fold>                        


// Variables declaration - do not modify                     
private static javax.swing.JLabel jLabel1;
// End of variables declaration                   
}