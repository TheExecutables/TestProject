import javax.swing.JPanel;


public class AdminPanel extends JPanel {

	final static String ADMINPANEL = "ADMIN PANEL";
	

public AdminPanel() {
    initComponents();
}




private void initComponents() {

    

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 300, Short.MAX_VALUE)
    );


}
}
