/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assurance;

import java.awt.*;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author khayatti
 */
public class Login extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Login() {
        initComponents();
        
          ImageIcon ptt = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
         Image img1 = ptt.getImage();
         Image img4 = img1.getScaledInstance(imagee.getWidth(), imagee.getHeight(), Image.SCALE_SMOOTH);
         ImageIcon n = new ImageIcon(img4);
         imagee.setIcon(n);
         
      
    }

    public void Connect() {
        try {
        con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/allianz?useSSL=false&serverTimezone=UTC",
            "root",
            "khayatti22"
        );            
        System.out.println("Connection Etablie");
        } catch (Exception e) {
            System.out.println("Erreur de connection");
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtnomutilisateur = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txttype = new javax.swing.JComboBox<>();
        txtmdp = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        imagee = new javax.swing.JLabel();

        setTitle("Login");
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1040, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 30, 430));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 120, 30, 430));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnomutilisateur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnomutilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomutilisateurActionPerformed(evt);
            }
        });
        jPanel6.add(txtnomutilisateur, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 270, 40));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setText("Nom d'utilisateur");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 220, 34));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel4.setText("Mot de passe");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 180, 30));

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assurance/login.png"))); // NOI18N
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 106));

        jButton1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jButton1.setText("Connecter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 38));

        txttype.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        txttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Directeur", "Employées" }));
        jPanel7.add(txttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 190, 40));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 240, 250));

        txtmdp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel6.add(txtmdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 280, 40));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 610, 310));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 980, 430));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assurance/logo.png"))); // NOI18N
        jPanel8.add(imagee, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 710, 100));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 120));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            Connect();
            pst = con.prepareStatement("select nom_utilisateur from login where nom_utilisateur=? and type=? and  mot_de_passe=? ");
            pst.setString(1, txtnomutilisateur.getText().trim());
            pst.setString(2, txttype.getSelectedItem().toString());
            pst.setString(3, txtmdp.getText());
            rs = pst.executeQuery();

            if (rs.next()) {
                if (txttype.getSelectedItem().equals("Manager")) {
                    super.dispose();
                    new Manager(txtnomutilisateur.getText()).setVisible(true);
                } else if (txttype.getSelectedItem().equals("Directeur")) {
                    super.dispose();
                    new Directeur(txtnomutilisateur.getText()).setVisible(true);
                }
                else{
                    super.dispose();
                    new Employees(txtnomutilisateur.getText()).setVisible(true);

                }

            } else {
                JOptionPane.showMessageDialog(null, "Erreure de connexion");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnomutilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomutilisateurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomutilisateurActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagee;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField txtmdp;
    private javax.swing.JTextField txtnomutilisateur;
    private javax.swing.JComboBox<String> txttype;
    // End of variables declaration//GEN-END:variables

  
}
