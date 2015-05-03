import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;

/**
 * 
 * @author James Woodward
 *
 */

public class TestPanel extends JPanel{
	
	final static String TESTSELECTPANEL = "Test Selection Panel";                 
	private javax.swing.JButton cancel;
	private javax.swing.JButton submit;
	private javax.swing.JFrame jFrame1;
	static javax.swing.JLabel labelB;
	static javax.swing.JLabel labelA;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
	private javax.swing.ButtonGroup buttonGroup;

    private boolean labelASelected = false;
    private boolean labelBSelected = false;
    private boolean labelNeitherSelected = false;
    private int win;
    private int lose;
    private int neither;



	// End of variables declaration       



	public TestPanel() {
        initComponents();
    }

    public  void  evalute(){
        if(labelNeitherSelected){
            win = 1;
            lose = 0;
            neither = 1;
        }
        else if (labelBSelected){
            win = 1;
            lose = 0;
            neither = 0;
        }
        else if (labelASelected){
            win = 1;
            lose = 1;
            neither = 0;
        }
        labelASelected = false;
        labelBSelected = false;
        labelNeitherSelected = false;

    }
                       
    private void initComponents() {
    	

        jFrame1 = new JFrame();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        cancel = new JButton();
        submit = new JButton();
        labelB = new JLabel();
        labelA = new JLabel();
        buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);
        jRadioButton3.setText("Neither");
        
        GroupLayout jFrame1Layout = new GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        jRadioButton1.setText("CHOICE A");
        jRadioButton1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        jRadioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {


                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("CHOICE B");
        jRadioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                jRadioButton2ActionPerformed(evt);
            }
        });
        

        cancel.setText("Cancel");

        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MainFrame.cl.show(MainFrame.cards, MainPanel.MAINPANEL);
                jButton1ActionPerformed(evt);
            }
        });

        submit.setText("Submit");


        labelB.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));


        labelA.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
      
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                 new SwingWorker() {
                    @Override
                    protected Object doInBackground() throws Exception {
                        UserDB userDB = new UserDB();
                        evalute();
                        userDB.saveTestItem(labelA.getText(),win, lose, neither );
                        userDB.saveTestItem(labelB.getText(),win, lose, neither );
                        return null;
                    }
                };




            }
        });
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(labelB, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
                                                .addGap(86, 86, 86)
                                                .addComponent(labelA, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(49, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addGap(83, 83, 83)
                                                .addComponent(jRadioButton3)
                                                .addGap(116, 116, 116)
                                                .addComponent(jRadioButton2)
                                                .addGap(158, 158, 158))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(cancel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(submit)
                                                .addGap(118, 118, 118))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelA, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                        .addComponent(labelB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jRadioButton3)
                                        .addComponent(jRadioButton2)
                                        .addComponent(jRadioButton1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancel)
                                        .addComponent(submit))
                                .addGap(80, 80, 80))
        );
    }// </editor-fold>


    private void jButton1ActionPerformed(ActionEvent evt) {
    }



    public void setWordLabelA(String word) {

        labelA.setText(word);

    }
    public void  setWordLabelB(String word){
        labelB.setText(word);
    }




    /**
     * Add the given listener to the "next" button
     * @param al  an ActionListener
     */
    public void addNextButtonListener(ActionListener al) {

        submit.addActionListener(al);
    }

    /**
     * Add the given listener to the "previous" button
     * @param al  an ActionListener
     */
    public void addPrevButtonListener(ActionListener al) {

        //jRadioButton2.addActionListener(al);
    }





    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        selectLabelA();
        labelB.setOpaque(true);
        labelB.setBackground(Color.LIGHT_GRAY);
        labelA.setOpaque(false);
        repaint();

        System.out.println("label A  = " + labelASelected);
        System.out.println("label B  = " + labelBSelected);


    }
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        selectLabelB();
        labelA.setOpaque(true);
        labelA.setBackground(Color.LIGHT_GRAY);
        labelB.setOpaque(false);
        repaint();
        System.out.println("label A  = " + labelASelected);
        System.out.println("label B  = " + labelBSelected);
        // TODO add your handling code here:

    }
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        labelA.setOpaque(false);
        labelB.setOpaque(false);
        labelASelected = false;
        labelBSelected = false;
        labelNeitherSelected = true;
        System.out.println(labelBSelected);
        System.out.println(labelASelected);
        System.out.println(labelNeitherSelected);


        repaint();

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

