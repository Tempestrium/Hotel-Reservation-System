/**
 *
 * @author Lrrn
 */
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class signUp extends javax.swing.JFrame {
  
    public signUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jName = new javax.swing.JLabel();
        jEmail = new javax.swing.JLabel();
        jPass = new javax.swing.JLabel();
        jAnswer = new javax.swing.JLabel();
        jSecurityQ = new javax.swing.JLabel();
        jAddress = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        passText = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        answerText = new javax.swing.JTextField();
        addressText = new javax.swing.JTextField();
        signUpBtn = new javax.swing.JButton();
        logInBtn = new javax.swing.JButton();
        forgotPassBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(720, 1280));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/exit.jpg"))); // NOI18N
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 30, 30));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign Up");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 110, 40));

        jName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jName.setForeground(new java.awt.Color(255, 255, 255));
        jName.setText("Name");
        getContentPane().add(jName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, -1));

        jEmail.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jEmail.setForeground(new java.awt.Color(255, 255, 255));
        jEmail.setText("Email");
        getContentPane().add(jEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        jPass.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jPass.setForeground(new java.awt.Color(255, 255, 255));
        jPass.setText("Password");
        getContentPane().add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, -1));

        jAnswer.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jAnswer.setForeground(new java.awt.Color(255, 255, 255));
        jAnswer.setText("Answer");
        getContentPane().add(jAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, -1, -1));

        jSecurityQ.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jSecurityQ.setForeground(new java.awt.Color(255, 255, 255));
        jSecurityQ.setText("Security Question");
        getContentPane().add(jSecurityQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, -1));

        jAddress.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jAddress.setForeground(new java.awt.Color(255, 255, 255));
        jAddress.setText("Address");
        getContentPane().add(jAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, -1, -1));

        nameText.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        getContentPane().add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 300, -1));

        emailText.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        getContentPane().add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 300, -1));

        passText.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        getContentPane().add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 300, -1));

        jComboBox1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What high school did you attend?", "What was the name of your first stuffed animal?", "What is your first pet?", "What high school did you attend?", "What was your favorite food as a child?" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 300, -1));

        answerText.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        getContentPane().add(answerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 300, -1));

        addressText.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        getContentPane().add(addressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 300, -1));

        signUpBtn.setBackground(new java.awt.Color(153, 153, 153));
        signUpBtn.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        signUpBtn.setText("Sign Up");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(signUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 710, -1, -1));

        logInBtn.setBackground(new java.awt.Color(153, 153, 153));
        logInBtn.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        logInBtn.setForeground(new java.awt.Color(255, 255, 255));
        logInBtn.setText("Login");
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 710, -1, -1));

        forgotPassBtn.setBackground(new java.awt.Color(153, 153, 153));
        forgotPassBtn.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        forgotPassBtn.setForeground(new java.awt.Color(255, 255, 255));
        forgotPassBtn.setText("Forgot Password?");
        forgotPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPassBtnActionPerformed(evt);
            }
        });
        getContentPane().add(forgotPassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 790, -1, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Hotel de Furina");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Stay once, carry memories forever");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/image-530x510.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 530, 490));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/login1.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1280));

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String name = nameText.getText();
        String email = emailText.getText();
        String password = new String(passText.getPassword());
        Object item  = jComboBox1.getSelectedItem();
        String security = item.toString();
        String answer = answerText.getText();
        String address = addressText.getText();
        
            try (Connection connection = DBUtil.mycon();                 
                Statement s = connection.createStatement()){
                
                s.executeUpdate("INSERT INTO usertable (name, email, password, `security question`, `security answer`, address) "
             + "VALUES ('" + name + "', '" + email + "', '" + password + "', '" + security + "', '" + answer + "', '" + address + "')");
                
                JOptionPane.showMessageDialog(rootPane, "Your Account Created, You can now Log In");
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle the exception, e.g., show an error message
                JOptionPane.showMessageDialog(rootPane, "Error creating account: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            // This line is optional, but it helps in debugging to see the full stack trace.
            
            }   
            
                                                        
    }                                         

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        // log in function
        Login loginPage = new Login();
        loginPage.show();
        dispose();
    }//GEN-LAST:event_logInBtnActionPerformed

    private void forgotPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPassBtnActionPerformed
        // TODO add your handling code here:
        forgotPage forgotPage = new forgotPage();
        forgotPage.setVisible(true);
    }//GEN-LAST:event_forgotPassBtnActionPerformed

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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new signUp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField answerText;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton forgotPassBtn;
    private javax.swing.JLabel jAddress;
    private javax.swing.JLabel jAnswer;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jName;
    private javax.swing.JLabel jPass;
    private javax.swing.JLabel jSecurityQ;
    private javax.swing.JButton logInBtn;
    private javax.swing.JTextField nameText;
    private javax.swing.JPasswordField passText;
    private javax.swing.JButton signUpBtn;
    // End of variables declaration//GEN-END:variables
}
