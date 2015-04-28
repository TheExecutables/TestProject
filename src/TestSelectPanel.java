
import java.awt.Color;
import java.awt.event.ComponentListener;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * 
 * @author James Woodward
 *
 */

public class TestSelectPanel extends JPanel{
	
	final static String TESTSELECTPANEL = "Test Selection Panel";                 
	private javax.swing.JButton cancel;
	private javax.swing.JButton submit;
	
	private javax.swing.JButton jButton1;
	private javax.swing.JFrame jFrame1;
	private javax.swing.JLabel labelB;
	private javax.swing.JLabel labelA;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.ButtonGroup buttonGroup;

	// End of variables declaration       


	public TestSelectPanel() {
    initComponents();
}

                       
    private void initComponents() {
    	

        jFrame1 = new javax.swing.JFrame();
        submit = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        labelB = new javax.swing.JLabel();
        labelA = new javax.swing.JLabel();
        buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        
        
        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jRadioButton1.setText("CHOICE A");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	selectLabelA();
            	repaint();
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("CHOICE B");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	selectLabelB();
            	repaint();
                jRadioButton1ActionPerformed(evt);
            }
        });
        

        jButton1.setText("Neither");

        cancel.setText("cancel");

        labelB.setText("TEST QUESTION B");
        labelB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        labelA.setText("TEST QUESTION A");
        labelA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

      
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	 MainFrame.cl.show(MainFrame.cards, MainPanel.MAINPANEL);
            	
                
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelA, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(labelB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jButton1))
                .addGap(48, 48, 48)
                .addComponent(cancel)
                .addGap(53, 53, 53))
        );
    }
    

private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
    // TODO add your handling code here:
}                                             
//going to duplicate fix later 

public void selectLabelA(){
		labelA.setOpaque(true);
		labelA.setBackground(Color.LIGHT_GRAY);
		labelB.setOpaque(false);

	}
	

public void selectLabelB(){
		labelB.setOpaque(true);
		labelB.setBackground(Color.LIGHT_GRAY);
		
		labelA.setOpaque(false);

}
}
