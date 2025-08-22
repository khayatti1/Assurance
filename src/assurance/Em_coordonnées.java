/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assurance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author khayatti
 */
public class Em_coordonnées extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Em_coordonnées() {
        initComponents();
        CoordoneEmployees();
        txttype.enable(false);
        txtcode.enable(false);
    }
String test;
    Em_coordonnées(String text) {
        initComponents();
        this.test = text;
        txtemployee.setText(text);
        CoordoneEmployees();
        txttype.enable(false);
        txtcode.enable(false);
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
   private void CoordoneEmployees() {
        try {
            Connect();
            int i = 1;
            String sql = "select code,type, nom, prenom, adresse,ville, numero,nom_utilisateur, mot_de_passe  from login where nom_utilisateur=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, txtemployee.getText());
            rs = pst.executeQuery();
            while (rs.next()) {
                txtcode.setText(rs.getString("code"));
                txtcode.enable(false);
                txttype.setSelectedItem(rs.getString("type"));
                txttype.enable(false);
                txtnom.setText(rs.getString("nom"));
                txtprenom.setText(rs.getString("prenom"));
                txtadresse.setText(rs.getString("adresse"));
                txtville.setText(rs.getString("ville"));
                txtnumero.setText(rs.getString("numero"));
                txtlogin.setText(rs.getString("nom_utilisateur"));
                txtpassword.setText(rs.getString("mot_de_passe"));
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        imagee = new javax.swing.JLabel();
        txtemployee = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprenom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtadresse = new javax.swing.JTextField();
        txtlogin = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        txttype = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtville = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vérifier Coordonnée");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagee.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        imagee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assurance/logoa.png"))); // NOI18N
        jPanel2.add(imagee, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 360, 80));

        txtemployee.setBackground(new java.awt.Color(204, 204, 255));
        txtemployee.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        txtemployee.setForeground(new java.awt.Color(204, 204, 255));
        txtemployee.setText("jLabel1");
        jPanel2.add(txtemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 50, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 100));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mes Coordonnées", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 24))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcode.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtcode.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 120, 30));

        jLabel3.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel3.setText("Type");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 60, 30));

        txtnom.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtnom.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 330, 30));

        jLabel4.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel4.setText("Code");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, 30));

        jLabel5.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel5.setText("Prenom");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 30));

        txtprenom.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtprenom.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 330, 30));

        jLabel7.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel7.setText("Adresse");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, 30));

        txtadresse.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtadresse.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtadresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 330, 30));

        txtlogin.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtlogin.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 330, 30));

        txtpassword.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtpassword.setPreferredSize(new java.awt.Dimension(6, 30));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel5.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 330, 30));

        txttype.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Directeur", "Employées", "Manager" }));
        jPanel5.add(txttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 140, 30));

        jLabel8.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel8.setText("Ville");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 30));

        txtville.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtville.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtville, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 330, 30));

        jLabel9.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel9.setText("Password");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 100, 30));

        txtnumero.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtnumero.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 330, 30));

        jLabel6.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel6.setText("Nom");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 30));

        jLabel10.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel10.setText("Numero");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, 30));

        jLabel11.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel11.setText("Login");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 100, 30));

        jButton10.setBackground(new java.awt.Color(255, 204, 153));
        jButton10.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton10.setText("accueil");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 130, 40));

        jButton11.setBackground(new java.awt.Color(153, 255, 153));
        jButton11.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton11.setText("Modifier");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 140, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 530, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       try {
            Connect();
            pst = con.prepareStatement("select nom_utilisateur from login where nom_utilisateur=?  ");
            pst.setString(1, txtemployee.getText().trim());
            rs = pst.executeQuery();
            super.dispose();
            new Employees(txtemployee.getText()).setVisible(true);     
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 try {
            Connect();
            pst = con.prepareStatement("update login set nom=?, prenom=?, adresse=?,ville=?, numero=?, nom_utilisateur=?,"
                + "mot_de_passe=? where code=?");

            pst.setString(1, txtnom.getText());
            pst.setString(2, txtprenom.getText());
            pst.setString(3, txtadresse.getText());
            pst.setString(4, txtville.getText());
            pst.setString(5, txtnumero.getText());
            pst.setString(6, txtlogin.getText());
            pst.setString(7, txtpassword.getText());
            pst.setString(8, txtcode.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Confirmer");
            CoordoneEmployees();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
       } 

    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Em_coordonnées.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Em_coordonnées.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Em_coordonnées.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Em_coordonnées.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Em_coordonnées().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagee;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtadresse;
    private javax.swing.JTextField txtcode;
    private javax.swing.JLabel txtemployee;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtprenom;
    private javax.swing.JComboBox<String> txttype;
    private javax.swing.JTextField txtville;
    // End of variables declaration//GEN-END:variables
}
