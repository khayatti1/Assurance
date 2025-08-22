
package assurance;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Manager extends javax.swing.JFrame {

 
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Manager() {
               
      initComponents();
     

    }
    String test;

    Manager(String mana) {
        initComponents();
        this.test = mana;
        txtmanager.setText("Bienvenue" +"   "+ mana);
        Table();
        Actualiser();    
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
     private void showData(String x) throws SQLException{                 
        Connect();
        String sql = "select * from login where nom_utilisateur like '" + x + "%'";
        pst  = con.prepareStatement(sql);
        rs = pst.executeQuery();
        DefaultTableModel m = new DefaultTableModel();
                      m.setColumnIdentifiers(new String[] {"CODE", "TYPE","NOM", "PRENOM", "ADRESSE", "VILLE", "NUMERO", "LOGING", "PASSWORD"});
        try {
          while(rs.next()){
              m.addRow(new String[] {rs.getString("code"),rs.getString("type"),rs.getString("nom"),rs.getString("prenom"),rs.getString("adresse"),rs.getString("ville"),rs.getString("numero"),rs.getString("nom_utilisateur"),rs.getString("mot_de_passe")});
          }  
        } 
        catch (SQLException e) {}
        table.setModel(m);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtmanager = new javax.swing.JLabel();
        imagee = new javax.swing.JLabel();
        panagenda = new javax.swing.JPanel();
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
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtville = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        ref = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtmanager.setFont(new java.awt.Font("Corbel Light", 1, 36)); // NOI18N
        txtmanager.setForeground(new java.awt.Color(51, 51, 51));
        txtmanager.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtmanager.setText("Manager Jean Jerom");
        jPanel2.add(txtmanager, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 390, 80));

        imagee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assurance/logoa.png"))); // NOI18N
        jPanel2.add(imagee, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 420, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 100));

        panagenda.setBackground(new java.awt.Color(204, 204, 255));
        panagenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ajoute des Personnels", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 24))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcode.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtcode.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 100, 30));

        jLabel3.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel3.setText("Type");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 60, 30));

        txtnom.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtnom.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 320, 30));

        jLabel4.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel4.setText("Nom");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 90, 30));

        jLabel5.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel5.setText("Prenom");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 90, 30));

        txtprenom.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtprenom.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 320, 30));

        jLabel7.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel7.setText("Adresse");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 90, 30));

        txtadresse.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtadresse.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtadresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 320, 30));

        txtlogin.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtlogin.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 300, 30));

        txtpassword.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtpassword.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 250, 30));

        txttype.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Directeur", "Employées" }));
        jPanel5.add(txttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 150, 30));

        jButton5.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton5.setText("Login");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 90, 30));

        jButton6.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton6.setText("Password");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 140, 30));

        jButton7.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton7.setText("Cin");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 30));

        jLabel8.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel8.setText("Ville");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 90, 30));

        txtville.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtville.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtville, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 300, 30));

        jLabel9.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel9.setText("Numero");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 90, 30));

        txtnumero.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtnumero.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 300, 30));

        panagenda.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 1040, 230));

        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        table.setRowHeight(20);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        panagenda.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 1040, 180));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 24))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setBackground(new java.awt.Color(0, 102, 204));
        jButton8.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton8.setText("Enregistrer");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 160, 50));

        jButton9.setBackground(new java.awt.Color(51, 255, 51));
        jButton9.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton9.setText("Modifier");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 140, 50));

        jButton10.setBackground(new java.awt.Color(255, 102, 102));
        jButton10.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton10.setText("Supprimer");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 140, 50));

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
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
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, 50));

        panagenda.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 700, 110));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 24))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ref.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ref.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                refKeyReleased(evt);
            }
        });
        jPanel8.add(ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 50));

        panagenda.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 300, 110));

        jPanel1.add(panagenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1120, 580));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        super.dispose();
        Login meconnecter = new Login();
        meconnecter.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String nom = txtnom.getText();
        String cin = txtcode.getText();
        txtlogin.setText(nom +"."+ cin);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int max = 1000;
        int min = 100;

        Random random = new Random();
        int show = min + random.nextInt(max);
        txtpassword.setText(String.valueOf(show));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int max = 100;
        int min = 1;

        Random random = new Random();
        int show = min + random.nextInt(max);
        txtcode.setText(String.valueOf(show));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            try {
                Connect();
                pst = con.prepareStatement("insert into login (code, type,nom, prenom, adresse,ville, numero, nom_utilisateur,"
                        + "mot_de_passe) values(?,?,?,?,?,?,?,?,?)");
                pst.setString(1, txtcode.getText());
                pst.setString(2, txttype.getSelectedItem().toString());
                pst.setString(3, txtnom.getText());
                pst.setString(4, txtprenom.getText());
                pst.setString(5, txtadresse.getText());
                pst.setString(6, txtville.getText());
                pst.setString(7, txtnumero.getText());
                pst.setString(8, txtlogin.getText());
                pst.setString(9, txtpassword.getText());
                pst.executeUpdate();
              
                JOptionPane.showMessageDialog(null, txttype.getSelectedItem().toString() + " Ajouter");
                Table();
                Actualiser();
                 con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                e.printStackTrace();
            }
           
   

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            Connect();
            pst = con.prepareStatement("update login set type=?, nom=?, prenom=?, adresse=?,ville=?, numero=?, nom_utilisateur=?,"
                + "mot_de_passe=? where code=?");

            pst.setString(1, txttype.getSelectedItem().toString());
            pst.setString(2, txtnom.getText());
            pst.setString(3, txtprenom.getText());
            pst.setString(4, txtadresse.getText());
            pst.setString(5, txtville.getText());
            pst.setString(6, txtnumero.getText());
            pst.setString(7, txtlogin.getText());
            pst.setString(8, txtpassword.getText());
            pst.setString(9, txtcode.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, txttype.getSelectedItem().toString() + " Modifier");
            Table();
            Actualiser();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
       } 

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            Connect();
            pst = con.prepareStatement("delete  from login where code=?");
            pst.setString(1, txtcode.getText());
            pst.executeUpdate();
          JOptionPane.showMessageDialog(null, txttype.getSelectedItem().toString() + " Supprimer");
           Table();
           Actualiser();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
      
    }//GEN-LAST:event_jButton10ActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        int selectioner = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        txtcode.setText(model.getValueAt(selectioner, 0).toString());
        txttype.setSelectedItem(model.getValueAt(selectioner, 1).toString());
        txtnom.setText(model.getValueAt(selectioner, 2).toString());
        txtprenom.setText(model.getValueAt(selectioner, 3).toString());
        txtadresse.setText(model.getValueAt(selectioner, 4).toString());
        txtville.setText(model.getValueAt(selectioner, 5).toString());
        txtnumero.setText(model.getValueAt(selectioner, 6).toString());
        txtlogin.setText(model.getValueAt(selectioner, 7).toString());
        txtpassword.setText(model.getValueAt(selectioner, 8).toString());
    }//GEN-LAST:event_tableMouseReleased

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyPressed

    private void refKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_refKeyReleased
        try {
            showData(ref.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Dr_production.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_refKeyReleased

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }
    private void Actualiser() {

        txttype.setSelectedItem(null);
        txtnom.setText("");
        txtcode.setText("");
        txtprenom.setText("");
        txtadresse.setText("");
        txtville.setText("");
        txtnumero.setText("");
        txtlogin.setText("");
        txtpassword.setText("");
    }
   
      public void Table() {
                      Connect();
                      DefaultTableModel modele = new DefaultTableModel();
                      modele.setColumnIdentifiers(new String[] {"CODE", "TYPE","NOM", "PRENOM", "ADRESSE", "VILLE", "NUMERO", "LOGING", "PASSWORD"});
                      String sql = "select * from login";
            try {
          
                pst  = con.prepareStatement(sql);
                rs = pst.executeQuery();
            while (rs.next()) {
              modele.addRow(new String[] {rs.getString("code"),rs.getString("type"),rs.getString("nom"),rs.getString("prenom"),rs.getString("adresse"),rs.getString("ville"),rs.getString("numero"),rs.getString("nom_utilisateur"),rs.getString("mot_de_passe")});
            }     
                       table.setModel(modele);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
      
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagee;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panagenda;
    private javax.swing.JTextField ref;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtadresse;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JLabel txtmanager;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtprenom;
    private javax.swing.JComboBox<String> txttype;
    private javax.swing.JTextField txtville;
    // End of variables declaration//GEN-END:variables
}
