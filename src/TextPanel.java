
import javax.swing.*;
/**
 * 
 * @author James Woodward
 *
 */
public class TextPanel extends JPanel{
	
	  final static String TEXTPANEL = "TEXT PANEL";
	  	private javax.swing.JButton jButtonCreate;
	    private javax.swing.JButton jButtonCancel;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JTextField jTextField1;
	    private static String userName;
	    private CustomerDB custdb;
	public TextPanel(){

		initComponents();
		
	}
	
	private void initComponents() {
		
		custdb = new CustomerDB();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonCreate = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();


        jLabel1.setText("Enter Email");
        
        
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        jButtonCreate.setText("Create");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	userName = jTextField1.getText();
            	custdb.mName = userName;
            	custdb.createUser();
            	UserWelcomePanel.setUserName(userName);
            	
            	MainFrame.cl.show(MainFrame.cards, UserWelcomePanel.USERWELCOMEPANEL);
                jButton1ActionPerformed(evt);
            }
        });
        //create a class to 

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	MainFrame.cl.show(MainFrame.cards, MainPanel.MAINPANEL);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCancel)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCreate)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreate)
                    .addComponent(jButtonCancel))
                .addContainerGap(214, Short.MAX_VALUE))
        );
    }                     

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    
    }                                        
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	
    }     
    
    public static String getStringTextValueField(){
    	return userName;
    }
	public static String getUserName() {
		return userName;
	}
                  
}



