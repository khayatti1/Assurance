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
public class Em_Sinistre extends javax.swing.JFrame {
   Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public Em_Sinistre() {
        initComponents();
        RechercheClient();
        txtetat.enable(false);
        txtcompensation.enable(false);
        TableSiniste();
        Actualiser();
        

    }
String test;
    Em_Sinistre(String text) {
        initComponents();
        this.test = text;
        txtemployee.setText(text);
         txtetat.enable(false);
        txtcompensation.enable(false);
        RechercheClient();
        TableSiniste();
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
    private void RechercheClient() {   
         try {
            Connect();
            pst = con.prepareStatement("select * from client order by matricule ");
            rs = pst.executeQuery();
            while (rs.next()) {
                String nom = rs.getString("matricule");
                txtmat.addItem(nom);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtprenom = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtproblemec = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtpaiement = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtmarque = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtcin = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtmatricule = new javax.swing.JTextField();
        Actualiser = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtcompensation = new javax.swing.JTextField();
        txtetat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        ref1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtmat = new javax.swing.JComboBox<>();
        rech = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        txtemployee = new javax.swing.JLabel();
        ref = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Déclarer sinistre");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel13.setText("Prenom");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, 30));

        txtprenom.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtprenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprenomActionPerformed(evt);
            }
        });
        jPanel6.add(txtprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 260, 30));

        jLabel14.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel14.setText("Paiement");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 110, 31));

        txtnumero.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jPanel6.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 260, 30));

        jLabel15.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel15.setText("Probléme");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 110, 30));

        txtproblemec.setColumns(20);
        txtproblemec.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtproblemec.setRows(5);
        jScrollPane3.setViewportView(txtproblemec);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 400, 160));

        jButton3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton3.setText("Entrer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 690, 160, 40));

        jLabel16.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel16.setText("Numero");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 110, 31));

        txtpaiement.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpaiement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaiementActionPerformed(evt);
            }
        });
        jPanel6.add(txtpaiement, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 240, 30));

        jLabel18.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel18.setText("Nom");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 50, 30));

        txtnom.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        jPanel6.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 260, 30));

        jLabel19.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel19.setText("Marque");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 110, 30));

        txtmarque.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtmarque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarqueActionPerformed(evt);
            }
        });
        jPanel6.add(txtmarque, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 260, 30));

        jLabel20.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel20.setText("CIN");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 50, 30));

        txtcin.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtcin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcinActionPerformed(evt);
            }
        });
        jPanel6.add(txtcin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 260, 30));

        jLabel21.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel21.setText("Matricule");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 110, 30));

        txtmatricule.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtmatricule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatriculeActionPerformed(evt);
            }
        });
        jPanel6.add(txtmatricule, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 260, 30));

        Actualiser.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        Actualiser.setText("actualiser");
        Actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualiserActionPerformed(evt);
            }
        });
        jPanel6.add(Actualiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, 160, 40));

        jLabel22.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel22.setText("Etat dossier");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 150, -1));

        jLabel23.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel23.setText("Compensation");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 160, 31));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 450, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 450, -1));

        txtcompensation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcompensation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcompensationActionPerformed(evt);
            }
        });
        jPanel6.add(txtcompensation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 240, 30));

        txtetat.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtetat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "demande", "Accepter", "en attend", "refus" }));
        jPanel6.add(txtetat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 240, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 470, 750));

        table.setAutoCreateRowSorter(true);
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
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setDropMode(javax.swing.DropMode.ON);
        table.setRowHeight(20);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 1160, 690));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setBackground(new java.awt.Color(51, 51, 255));
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assurance/logoa.png"))); // NOI18N
        jPanel2.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 380, 80));

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recherche par LOGIN\n", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 24))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ref1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ref1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ref1KeyReleased(evt);
            }
        });
        jPanel12.add(ref1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 40));

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 300, 110));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
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
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 20, 180, 50));

        txtmat.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jPanel2.add(txtmat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 240, 40));

        rech.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        rech.setText("Recherche");
        rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechActionPerformed(evt);
            }
        });
        jPanel2.add(rech, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 150, 40));

        jButton12.setBackground(new java.awt.Color(255, 204, 153));
        jButton12.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton12.setText("Accueil");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, 180, 50));

        txtemployee.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        txtemployee.setForeground(new java.awt.Color(204, 204, 255));
        txtemployee.setText("jLabel1");
        jPanel2.add(txtemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 100));

        ref.setBackground(new java.awt.Color(204, 204, 255));
        ref.setColumns(1);
        ref.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });
        ref.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                refKeyReleased(evt);
            }
        });
        jPanel1.add(ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 310, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 910));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try { 
            Connect();
            pst = con.prepareStatement("insert into sinistre (cin,nom,prenom,numero,matricule,marque,paiement,etat,compensation,probleme)values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, txtcin.getText());
            pst.setString(2, txtnom.getText());
            pst.setString(3, txtprenom.getText());
            pst.setString(4, txtnumero.getText());
            pst.setString(5, txtmatricule.getText());
            pst.setString(6, txtmarque.getText());
            pst.setString(7, txtpaiement.getText());
            pst.setString(8, txtetat.getSelectedItem().toString());
            pst.setString(9, txtcompensation.getText());
            pst.setString(10, txtproblemec.getText());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, " Demande Envoyer");
            TableSiniste();
            Actualiser();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();

        }
    }//GEN-LAST:event_jButton3ActionPerformed
   private void showData(String x) throws SQLException{                 
        Connect();
        String sql = "select * from sinistre where cin like '" + x + "%' or nom like '" + x + "%' or matricule like '" + x + "%'";
        pst  = con.prepareStatement(sql);
        rs = pst.executeQuery();
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnIdentifiers(new String[]  {"CIN","NOM","PRENOM","NUMERO","MATRICULE","MARQUE","PAIEMENT", "ETAT","COMPENSATION", "PROBLEME"});
        try {
          while(rs.next()){
               m.addRow(new String[] {rs.getString("cin"),rs.getString("nom"),rs.getString("prenom"),rs.getString("numero"),rs.getString("matricule") ,rs.getString("marque"),rs.getString("paiement"),rs.getString("etat"),rs.getString("compensation"),rs.getString("probleme")});
          }  
        } 
        catch (SQLException e) {}
        table.setModel(m);
    }
    
    private void Actualiser() {

        txtmat.setSelectedItem(null);
        txtmarque.setText("");
        txtcin.setText("");
        txtnom.setText("");
        txtprenom.setText("");
        txtnumero.setText("");
        txtmarque.setText("");
        txtmatricule.setText("");
        txtcompensation.setText("");        
        txtproblemec.setText("");
        txtpaiement.setText("");
    }
     public void TableSiniste() {
                      Connect();
                      DefaultTableModel modele = new DefaultTableModel();
        modele.setColumnIdentifiers(new String[]  {"CIN","NOM","PRENOM","NUMERO","MATRICULE","MARQUE","PAIEMENT", "ETAT","COMPENSATION", "PROBLEME"});
                      String sql = "select * from sinistre";
            try {
          
                pst  = con.prepareStatement(sql);
                rs = pst.executeQuery();
            while (rs.next()) {
               modele.addRow(new String[] {rs.getString("cin"),rs.getString("nom"),rs.getString("prenom"),rs.getString("numero"),rs.getString("matricule") ,rs.getString("marque"),rs.getString("paiement"),rs.getString("etat"),rs.getString("compensation"),rs.getString("probleme")});
            }     
                       table.setModel(modele);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
     
    
    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
       
        int select  = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        txtcin.setText(model.getValueAt(select, 0).toString());  
        txtnom.setText(model.getValueAt(select, 1).toString());       
        txtprenom.setText(model.getValueAt(select, 2).toString());       
        txtnumero.setText(model.getValueAt(select, 3).toString());
        txtmatricule.setText(model.getValueAt(select, 4).toString());
        txtmarque.setText(model.getValueAt(select, 5).toString());
        txtpaiement.setText(model.getValueAt(select,6).toString());
        txtetat.setSelectedItem(model.getValueAt(select,7).toString());
        txtcompensation.setText(model.getValueAt(select,8).toString());
        txtproblemec.setText(model.getValueAt(select, 9).toString());
  
    }//GEN-LAST:event_tableMouseReleased

    private void txtpaiementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaiementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaiementActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        super.dispose();
        Login meconnecter = new Login();
        meconnecter.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechActionPerformed

         try {
            Connect();
            pst = con.prepareStatement("select cin,nom,prenom,numero,matricule,marque from client where matricule=?");
            pst.setString(1, txtmat.getSelectedItem().toString());
            rs = pst.executeQuery();
            while (rs.next()) {
                String cin = rs.getString("cin");
                txtcin.setText(cin);
                txtcin.enable(false); 
                
                 String nom = rs.getString("nom");
                txtnom.setText(nom);
                txtnom.enable(false); 
                
                String prenom = rs.getString("prenom");
                txtprenom.setText(prenom);
                txtprenom.enable(false); 
                
                String numero = rs.getString("numero");
                txtnumero.setText(numero);
                txtnumero.enable(false); 
                
                String matricule = rs.getString("matricule");
                txtmatricule.setText(matricule);
                txtmatricule.enable(false); 
                
                String marque = rs.getString("marque");
                txtmarque.setText(marque);  
                txtmarque.enable(false); 
                
                txtproblemec.setText("");
                txtpaiement.setText("");
                txtetat.enable(false); 
                txtcompensation.enable(false);
           
                         
            }
            con.close();
            TableSiniste();


        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_rechActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

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
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void txtmarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarqueActionPerformed

    private void txtcinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcinActionPerformed

    private void txtmatriculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatriculeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatriculeActionPerformed

    private void refKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_refKeyReleased
        try {
            showData(ref.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Em_Sinistre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refKeyReleased

    private void ref1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ref1KeyReleased

    }//GEN-LAST:event_ref1KeyReleased

    private void refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refActionPerformed

    private void ActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualiserActionPerformed

         Actualiser();
    }//GEN-LAST:event_ActualiserActionPerformed

    private void txtprenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprenomActionPerformed

    private void txtcompensationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcompensationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcompensationActionPerformed

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
            java.util.logging.Logger.getLogger(Em_Sinistre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Em_Sinistre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Em_Sinistre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Em_Sinistre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Em_Sinistre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualiser;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton rech;
    private javax.swing.JTextField ref;
    private javax.swing.JTextField ref1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtcin;
    private javax.swing.JTextField txtcompensation;
    private javax.swing.JLabel txtemployee;
    private javax.swing.JComboBox<String> txtetat;
    private javax.swing.JTextField txtmarque;
    private javax.swing.JComboBox<String> txtmat;
    private javax.swing.JTextField txtmatricule;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpaiement;
    private javax.swing.JTextField txtprenom;
    private javax.swing.JTextArea txtproblemec;
    // End of variables declaration//GEN-END:variables
}
