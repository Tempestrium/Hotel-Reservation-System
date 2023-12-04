/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author kenneth
 */
public class forgotPage extends javax.swing.JFrame {

    /**
     * Creates new form forgotPage
     */
    public forgotPage() {
        initComponents();
        Connect();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public void Connect(){
        
        try {
            //Open Connection to MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            
        }catch(SQLException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textPanel = new javax.swing.JPanel();
        nameTf = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        emailTf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        questionCB = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        answerTf = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        addressTf = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        passwordTf = new javax.swing.JTextField();
        smallPanel = new javax.swing.JPanel();
        smallColorPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        colorPanel = new javax.swing.JPanel();
        resetBtn = new javax.swing.JButton();
        resetLbl = new javax.swing.JLabel();
        exitLbl = new javax.swing.JLabel();
        imgLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textPanel.setOpaque(false);

        nameTf.setBackground(new java.awt.Color(0,0,0,1));
        nameTf.setFont(new java.awt.Font("Georgia Pro Cond Light", 0, 14)); // NOI18N
        nameTf.setForeground(new java.awt.Color(204, 204, 204));
        nameTf.setText("Name");
        nameTf.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        emailTf.setBackground(new java.awt.Color(0,0,0,1));
        emailTf.setFont(new java.awt.Font("Georgia Pro Cond Light", 0, 14)); // NOI18N
        emailTf.setForeground(new java.awt.Color(204, 204, 204));
        emailTf.setText("Email");
        emailTf.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        questionCB.setBackground(new java.awt.Color(0,0,0,1));
        questionCB.setFont(new java.awt.Font("Georgia Pro Cond Light", 0, 14)); // NOI18N
        questionCB.setForeground(new java.awt.Color(204, 204, 204));
        questionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your first pet?", "What high school did you attend?", "What was the name of your first stuffed animal?", "What is your first pet?", "What was your favorite food as a child?" }));
        questionCB.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        answerTf.setBackground(new java.awt.Color(0,0,0,1));
        answerTf.setFont(new java.awt.Font("Georgia Pro Cond Light", 0, 14)); // NOI18N
        answerTf.setForeground(new java.awt.Color(204, 204, 204));
        answerTf.setText("Answer");
        answerTf.setBorder(null);

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        addressTf.setBackground(new java.awt.Color(0,0,0,1));
        addressTf.setFont(new java.awt.Font("Georgia Pro Cond Light", 0, 14)); // NOI18N
        addressTf.setForeground(new java.awt.Color(204, 204, 204));
        addressTf.setText("Address");
        addressTf.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));

        passwordTf.setBackground(new java.awt.Color(0,0,0,1));
        passwordTf.setFont(new java.awt.Font("Georgia Pro Cond Light", 0, 14)); // NOI18N
        passwordTf.setForeground(new java.awt.Color(204, 204, 204));
        passwordTf.setText("Password");
        passwordTf.setBorder(null);

        javax.swing.GroupLayout textPanelLayout = new javax.swing.GroupLayout(textPanel);
        textPanel.setLayout(textPanelLayout);
        textPanelLayout.setHorizontalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(emailTf)
                    .addComponent(nameTf)
                    .addComponent(jSeparator3)
                    .addComponent(questionCB, 0, 280, Short.MAX_VALUE)
                    .addComponent(answerTf)
                    .addComponent(jSeparator4)
                    .addComponent(addressTf)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator6)
                    .addComponent(passwordTf, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(70, 70, 70))
        );
        textPanelLayout.setVerticalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(questionCB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(textPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 100, 420, 460));

        smallColorPanel.setBackground(new Color(22,26,48, 150));

        javax.swing.GroupLayout smallColorPanelLayout = new javax.swing.GroupLayout(smallColorPanel);
        smallColorPanel.setLayout(smallColorPanelLayout);
        smallColorPanelLayout.setHorizontalGroup(
            smallColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        smallColorPanelLayout.setVerticalGroup(
            smallColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout smallPanelLayout = new javax.swing.GroupLayout(smallPanel);
        smallPanel.setLayout(smallPanelLayout);
        smallPanelLayout.setHorizontalGroup(
            smallPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(smallColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        smallPanelLayout.setVerticalGroup(
            smallPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(smallColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(smallPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 100, 420, 460));

        jPanel1.setMaximumSize(new java.awt.Dimension(640, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 720));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        colorPanel.setBackground(new Color(49,48,77, 150));

        resetBtn.setBackground(new java.awt.Color(176, 100, 90));
        resetBtn.setFont(new java.awt.Font("Georgia Pro", 0, 18)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(204, 204, 204));
        resetBtn.setText("Reset Password");
        resetBtn.setToolTipText("");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        resetLbl.setFont(new java.awt.Font("Georgia Pro Cond Semibold", 0, 36)); // NOI18N
        resetLbl.setForeground(new java.awt.Color(255, 255, 255));
        resetLbl.setText("Reset Account");
        resetLbl.setToolTipText("");

        exitLbl.setFont(new java.awt.Font("Georgia Pro Cond", 0, 24)); // NOI18N
        exitLbl.setForeground(new java.awt.Color(255, 255, 255));
        exitLbl.setText("X");
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(colorPanelLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(colorPanelLayout.createSequentialGroup()
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(colorPanelLayout.createSequentialGroup()
                        .addComponent(resetLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addComponent(exitLbl)
                        .addGap(19, 19, 19))))
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorPanelLayout.createSequentialGroup()
                .addGroup(colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(colorPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(resetLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(colorPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exitLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 494, Short.MAX_VALUE)
                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        jPanel1.add(colorPanel);
        colorPanel.setBounds(0, 0, 640, 720);

        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/city-view-of-tokyo-in-day-time-f0f23vzawv369a2a.jpg"))); // NOI18N
        jPanel1.add(imgLbl);
        imgLbl.setBounds(0, 0, 640, 720);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // Reset Account Password:
        String name = nameTf.getText();
        String email = emailTf.getText();
        String password = passwordTf.getText();
        String answer = answerTf.getText();
        String address = addressTf.getText();
        Object item = questionCB.getSelectedItem();
        String question = item.toString();
        String tableName = null, tableEmail = null, tableQuestion = null, tableAnswer = null, tableAddress = null;
   
        // Check if all the necessary fields are filled out
        if(name.isEmpty() || email.isEmpty() || password.isEmpty() || answer.isEmpty() || address.isEmpty() || question.isEmpty()){
        JOptionPane.showMessageDialog(this, "Please make sure all fields are filled out");
        return;
        }
        
        try{
            // Selects the Usertable
            String select = "SELECT * FROM usertable WHERE email='"+email+"'";
            pst = con.prepareStatement(select);
            rs = pst.executeQuery();

                while(rs.next())
                {
                    //Gets the email and password from the appropriate Column
                    tableName = rs.getString("name");
                    tableEmail = rs.getString("email");
                    tableQuestion = rs.getString("security_question");
                    tableAnswer = rs.getString("security_answer");
                    tableAddress = rs.getString("address");
                    
                }
                if(((name.equals(tableName)) && email.equals(tableEmail)) && (question.equals(tableQuestion)) && (answer.equals(tableAnswer)) && (address.equals(tableAddress))){
                    pst = con.prepareStatement("UPDATE usertable SET password=? WHERE email=?");
                    pst.setString(1, password);
                    pst.setString(2, email);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Successfully Updated!");
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Please Try Again");
                }
                    
                
        }catch(SQLException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex); 
        }
        
    }//GEN-LAST:event_resetBtnActionPerformed

    private void exitLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitLblMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(forgotPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTf;
    private javax.swing.JTextField answerTf;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JTextField emailTf;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField nameTf;
    private javax.swing.JTextField passwordTf;
    private javax.swing.JComboBox<String> questionCB;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel resetLbl;
    private javax.swing.JPanel smallColorPanel;
    private javax.swing.JPanel smallPanel;
    private javax.swing.JPanel textPanel;
    // End of variables declaration//GEN-END:variables
}
