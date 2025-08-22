/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assurance;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author khayatti
 */
public class Employees extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Employees() {
        initComponents();
    }

    String test;
    Employees(String text) {
        initComponents();
        this.test = text;
        txtemployee.setText(text);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        imagee = new javax.swing.JLabel();
        txtemployee = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employée");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mes Coordonnées", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 24))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assurance/home.png"))); // NOI18N
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 300, 270));

        jButton7.setBackground(new java.awt.Color(153, 255, 153));
        jButton7.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton7.setText("Modifier");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 210, 50));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 390, 410));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 480, 490));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagee.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        imagee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assurance/logoa.png"))); // NOI18N
        jPanel2.add(imagee, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 420, 80));

        txtemployee.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        txtemployee.setForeground(new java.awt.Color(51, 51, 51));
        txtemployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtemployee.setText("Manager Jean Jerom");
        jPanel2.add(txtemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 450, 80));

        jButton4.setBackground(new java.awt.Color(255, 153, 153));
        jButton4.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton4.setText("Deconnecter");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 20, 180, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 100));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registres Enregistrés", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 24))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(102, 153, 255));
        jButton5.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton5.setText("Des Actes de production");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 310, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assurance/sinistre.png"))); // NOI18N
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 300, 270));

        jPanel7.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 390, 410));

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assurance/production.png"))); // NOI18N
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 300, 270));

        jButton6.setBackground(new java.awt.Color(255, 153, 153));
        jButton6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton6.setText("Des Sinistres");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 190, 50));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 400, 410));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 940, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        super.dispose();
        Login meconnecter = new Login();
        meconnecter.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try {
            Connect();
            pst = con.prepareStatement("select nom_utilisateur from login where nom_utilisateur=?");
            pst.setString(1, txtemployee.getText().trim());
            rs = pst.executeQuery();
            super.dispose();
            new Em_production(txtemployee.getText()).setVisible(true);     
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            Connect();
            pst = con.prepareStatement("select nom_utilisateur from login where nom_utilisateur=?");
            pst.setString(1, txtemployee.getText().trim());
            rs = pst.executeQuery();
            super.dispose();
            new Em_Sinistre(txtemployee.getText()).setVisible(true);     
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          try {
            Connect();
            pst = con.prepareStatement("select nom_utilisateur from login where nom_utilisateur=?");
            pst.setString(1, txtemployee.getText().trim());
            rs = pst.executeQuery();
            super.dispose();
            new Em_coordonnées(txtemployee.getText()).setVisible(true);     
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagee;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel txtemployee;
    // End of variables declaration//GEN-END:variables
}
