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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khayatti
 */
public class Dr_production extends javax.swing.JFrame {
  Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public Dr_production() {
        initComponents();
        TableClt();
    }
    
     String test;
    Dr_production(String text) {
        initComponents();
        this.test = text;
        txtdirecteur.setText(text);
                TableClt();

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
 private void TableClt() {
   
                 Connect();
                 DefaultTableModel modele = new DefaultTableModel();
  modele.setColumnIdentifiers(new String[] {"CIN", "NOM" ,"PRENOM", "ADRESSE", "NUMERO", "MATRICULE", "MARQUE","N°POLICE","CARBURANT","N°CHEVEUX","DATE D'EFFET","HEURE","PERIODE","DATE D'ECHEANCE","PRIX","PAIEMENT","RESTE","ETAT"});

                 String sql = "select * from client";
            try {
          
                pst  = con.prepareStatement(sql);
                rs = pst.executeQuery();
            while (rs.next()) {
               modele.addRow(new String[] {rs.getString("cin"),rs.getString("nom"),rs.getString("prenom"), rs.getString("adresse"),rs.getString("numero"), rs.getString("matricule"),rs.getString("marque"),rs.getString("police"), rs.getString("carburant"), rs.getString("cheveux"),rs.getString("date_effet"),rs.getString("heure"),rs.getString("période"), rs.getString("date_échéance"),rs.getString("prix"),rs.getString("paiement"),rs.getString("reste"),rs.getString("etat")});
            }     
                       table.setModel(modele);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
 
   private void showData(String x) throws SQLException{                 
        Connect();
        String sql = "select * from client where police like '" + x + "%' or nom like '" + x + "%' or matricule like '" + x + "%' or etat like '" + x + "%'";
        pst  = con.prepareStatement(sql);
        rs = pst.executeQuery();
        DefaultTableModel md = new DefaultTableModel();
  md.setColumnIdentifiers(new String[] {"CIN", "NOM" ,"PRENOM", "ADRESSE", "NUMERO", "MATRICULE", "MARQUE","N°POLICE","CARBURANT","N°CHEVEUX","DATE D'EFFET","HEURE","PERIODE","DATE D'ECHEANCE","PRIX","PAIEMENT","RESTE","ETAT"});
        try {
          while(rs.next()){
               md.addRow(new String[] {rs.getString("cin"),rs.getString("nom"),rs.getString("prenom"), rs.getString("adresse"),rs.getString("numero"), rs.getString("matricule"),rs.getString("marque"),rs.getString("police"), rs.getString("carburant"), rs.getString("cheveux"),rs.getString("date_effet"),rs.getString("heure"),rs.getString("période"), rs.getString("date_échéance"),rs.getString("prix"),rs.getString("paiement"),rs.getString("reste"),rs.getString("etat")});
          }  
        } 
        catch (SQLException e) {}
        table.setModel(md);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtdirecteur = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        ref = new javax.swing.JTextField();
        txtdirecteur1 = new javax.swing.JLabel();
        txtdirecteur2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Suivi production");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registre des actes de production", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 24))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1690, 440));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1710, 500));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1730, 570));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtdirecteur.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        txtdirecteur.setForeground(new java.awt.Color(204, 204, 255));
        txtdirecteur.setText("ss");
        jPanel2.add(txtdirecteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 30, 20));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jButton4.setText("Deconnecter");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 30, 180, 50));

        jButton12.setBackground(new java.awt.Color(255, 204, 153));
        jButton12.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton12.setText("Accueil");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 30, 170, 50));

        ref.setBackground(new java.awt.Color(204, 204, 255));
        ref.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ref.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                refKeyReleased(evt);
            }
        });
        jPanel2.add(ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 330, 50));
        jPanel2.add(txtdirecteur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 120, 20));

        txtdirecteur2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtdirecteur2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assurance/logoa.png"))); // NOI18N
        jPanel2.add(txtdirecteur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 390, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1730, 110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void refKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_refKeyReleased
        try {
            showData(ref.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Dr_production.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_refKeyReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
      
    }//GEN-LAST:event_tableMouseClicked

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased

    }//GEN-LAST:event_tableMouseReleased

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed

    }//GEN-LAST:event_tableKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        super.dispose();
        Login meconnecter = new Login();
        meconnecter.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

            try {
            Connect();
            pst = con.prepareStatement("select nom_utilisateur from login where nom_utilisateur=?");
            pst.setString(1, txtdirecteur.getText().trim());
            rs = pst.executeQuery();
            super.dispose();
            new Directeur(txtdirecteur.getText()).setVisible(true);     
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(Dr_production.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dr_production.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dr_production.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dr_production.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dr_production().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField ref;
    private javax.swing.JTable table;
    private javax.swing.JLabel txtdirecteur;
    private javax.swing.JLabel txtdirecteur1;
    private javax.swing.JLabel txtdirecteur2;
    // End of variables declaration//GEN-END:variables
}
