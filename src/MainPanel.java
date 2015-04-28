

import javax.swing.JPanel;

// you can reference this panel with "MainPanel.MAINPANEL"
public  class MainPanel extends JPanel {
	
	final static String MAINPANEL = "MAIN PANEL";
	
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;


	public MainPanel( )   {
		initComponents();
	}



public void initComponents( ){
	 

    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();

    
    

    //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jButton1.setText("Create");
    
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
        	 MainFrame.cl.show(MainFrame.cards, TextPanel.TEXTPANEL);
        	
            
        }
    });
	
    jButton2.setText("Select");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
        	MainFrame.cl.show(MainFrame.cards, TestSelectPanel.TESTSELECTPANEL);
       }
    });

    jLabel1.setText("Please select an option");

    jLabel2.setText("Create a new user");

    jLabel3.setText("Select an exising user");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jLabel2)))
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jButton2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(jLabel3))))
                .addGroup(layout.createSequentialGroup()
                    .addGap(132, 132, 132)
                    .addComponent(jLabel1)))
            .addContainerGap(88, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(60, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(43, 43, 43)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jButton2))
            .addGap(135, 135, 135))
    );

  //  pack();
}
}          