
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;

/**
 * 
 * @author James Woodward
 *
 */

public class TestPanel extends JPanel{
	
	final static String TESTSELECTPANEL = "Test Selection Panel";                 
	private javax.swing.JButton startBtn;
	private javax.swing.JButton submit;
	
	private javax.swing.JButton neither;
	private javax.swing.JFrame jFrame1;
	static javax.swing.JLabel labelB;
	static javax.swing.JLabel labelA;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.ButtonGroup buttonGroup;
    private boolean labelASelected = false;
    private boolean labelBSelected = false;

	// End of variables declaration       


	public TestPanel() {
    initComponents();
}

                       
    private void initComponents() {
    	

        jFrame1 = new javax.swing.JFrame();
        submit = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        neither = new javax.swing.JButton();
        startBtn = new javax.swing.JButton();
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


                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("CHOICE B");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jRadioButton2ActionPerformed(evt);
            }
        });
        

        neither.setText("Cancel");

        neither.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainFrame.cl.show(MainFrame.cards, MainPanel.MAINPANEL);
                jButton1ActionPerformed(evt);
            }
        });

        startBtn.setText("Start");

        labelB.setText(Test.testWord);
        labelB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        labelA.setText(Test.otherWord);
        labelA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

      
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {


            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(startBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(neither)
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
                    .addComponent(neither))
                .addGap(48, 48, 48)
                .addComponent(startBtn)
                .addGap(53, 53, 53))
        );
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
    }

    public void addNextButtonListener(ActionListener al) {
        jRadioButton2.addActionListener(al);

    }

    /**
     * Add the given listener to the "previous" button
     * @param al  an ActionListener
     */

    public void addPrevButtonListener(ActionListener al) {
        jRadioButton1.addActionListener(al);
    }






    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    selectLabelA();
        labelA.setText(Test.otherWord);
        labelA.setOpaque(true);
        labelA.setBackground(Color.LIGHT_GRAY);
        labelB.setOpaque(false);
        repaint();
    System.out.println("label A  = " + labelASelected);
    System.out.println("label B  = " + labelBSelected);
    // TODO add your handling code here:
}
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        selectLabelB();
        labelB.setText(Test.testWord);
        labelB.setOpaque(true);
        labelB.setBackground(Color.LIGHT_GRAY);
        labelA.setOpaque(false);
        repaint();
        System.out.println("label A  = " + labelASelected);
        System.out.println("label B  = " + labelBSelected);


    }

public void selectLabelA(){
        labelASelected = true;
        labelBSelected = false;

	}
	

public void selectLabelB(){
        labelBSelected = true;
        labelASelected = false;

}

}
