/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assurance;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Image;
import com.itextpdf.text.*;

import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPHeaderCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.scenario.effect.ImageData;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author khayatti
 */
public class Attestation extends javax.swing.JFrame {

     Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public Attestation() {
        initComponents();
        RechercheClient();        
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
      private void RechercheClient(){  
         try {
            Connect();
            pst = con.prepareStatement("select * from client order by matricule");
            rs = pst.executeQuery();
            while (rs.next()) {
                String nom = rs.getString("matricule");
                txtmat.addItem(nom);
            }
            con.close();
        }catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtpolice = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtmarque = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtmatricule = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtreste = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtpaiement = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        date_deffet = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        txtdatee = new com.toedter.calendar.JDateChooser();
        jLabel25 = new javax.swing.JLabel();
        txtheure = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        txtperiode = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtprix = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        ref1 = new javax.swing.JTextField();
        txtmat = new javax.swing.JComboBox<>();
        rech = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        txtemployee = new javax.swing.JLabel();
        image1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtprint = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attestation d'assurance");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpolice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpolice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpoliceActionPerformed(evt);
            }
        });
        jPanel6.add(txtpolice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 260, 30));

        jLabel17.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel17.setText("N°Police");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 100, 30));

        jLabel18.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel18.setText("Nom Complet");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 30));

        txtnom.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });
        jPanel6.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 260, 30));

        jLabel19.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel19.setText("Marque");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, 30));

        txtmarque.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtmarque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarqueActionPerformed(evt);
            }
        });
        jPanel6.add(txtmarque, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 260, 30));

        jLabel21.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel21.setText("Matricule");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 110, 30));

        txtmatricule.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtmatricule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatriculeActionPerformed(evt);
            }
        });
        jPanel6.add(txtmatricule, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 260, 30));

        jLabel22.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel22.setText("Reste");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 100, 30));

        txtreste.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtreste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresteActionPerformed(evt);
            }
        });
        jPanel6.add(txtreste, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 260, 30));

        jLabel23.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel23.setText("Prix");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 100, 30));

        txtpaiement.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpaiement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaiementActionPerformed(evt);
            }
        });
        txtpaiement.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpaiementKeyReleased(evt);
            }
        });
        jPanel6.add(txtpaiement, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 260, 30));

        image.setBackground(new java.awt.Color(51, 51, 255));
        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assurance/logoa.png"))); // NOI18N
        jPanel6.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 390, 80));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 450, 10));

        jLabel20.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel20.setText("Date d'effet");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 130, 30));

        date_deffet.setDateFormatString("dd/MM/yyyy");
        date_deffet.setMaxSelectableDate(null);
        date_deffet.setMinSelectableDate(null);
        jPanel6.add(date_deffet, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 200, 30));

        jLabel24.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel24.setText("Date d'échéance");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 180, 30));

        txtdatee.setDateFormatString("dd/MM/yyyy");
        jPanel6.add(txtdatee, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 200, 30));

        jLabel25.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel25.setText("Heure");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 70, 30));

        txtheure.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtheure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00H", "01H", "02H", "03H", "04H", "05H", "06H", "07H", "08H", "09H", "10H", "11H", "12H", "13H", "14H", "15H", "16H", "17H", "18H", "19H", "20H", "21H", "22H", "23H" }));
        jPanel6.add(txtheure, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 100, 30));

        jLabel26.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel26.setText("Période");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 90, 30));

        txtperiode.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtperiode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1mois", "3mois", "6mois", "1ans" }));
        txtperiode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtperiodeActionPerformed(evt);
            }
        });
        jPanel6.add(txtperiode, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 100, 30));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel14.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jLabel14.setText("Paiement");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 110, 31));

        txtprix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtprix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprixActionPerformed(evt);
            }
        });
        txtprix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprixKeyReleased(evt);
            }
        });
        jPanel6.add(txtprix, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 260, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 470, 630));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        txtmat.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jPanel2.add(txtmat, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 240, 40));

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
        jPanel2.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 20, 180, 50));

        txtemployee.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        txtemployee.setForeground(new java.awt.Color(204, 204, 255));
        txtemployee.setText("jLabel1");
        jPanel2.add(txtemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, -1, -1));

        image1.setBackground(new java.awt.Color(51, 51, 255));
        image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assurance/logoa.png"))); // NOI18N
        jPanel2.add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 360, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 100));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enregistrement", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 24))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton1.setText("Attestation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 170, 50));

        jButton2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton2.setText("Actualiser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 170, 50));

        jButton3.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton3.setText("Afficher");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 170, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 250, 280));

        txtprint.setBackground(new java.awt.Color(255, 255, 153));
        txtprint.setColumns(20);
        txtprint.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        txtprint.setRows(5);
        jScrollPane1.setViewportView(txtprint);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, 600, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1570, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtprixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprixActionPerformed

    private void txtmarqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarqueActionPerformed

    private void txtmatriculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatriculeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatriculeActionPerformed

    private void ref1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ref1KeyReleased

    }//GEN-LAST:event_ref1KeyReleased

    private void rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechActionPerformed

        try {
            Connect();
            pst = con.prepareStatement("select nom,prenom,matricule,marque,police,date_effet,date_échéance,paiement,heure,période,prix,reste from client where matricule=?");
            pst.setString(1, txtmat.getSelectedItem().toString());
            rs = pst.executeQuery();
            while (rs.next()) {
                String nomc = rs.getString("nom")+" "+rs.getString("prenom");
                txtnom.setText(nomc);
                txtnom.enable(false);
                
                String matricule = rs.getString("matricule");
                txtmatricule.setText(matricule);
                txtmatricule.enable(false);
                
                String marque = rs.getString("marque");
                txtmarque.setText(marque);
                txtmarque.enable(false);

                                
                String police = rs.getString("police");
                txtpolice.setText(police);
                txtpolice.enable(false);
   
               Date date_effet = new SimpleDateFormat("dd/MM/yyyy").parse((String)rs.getString("date_effet").toString());
               date_deffet.setDate(date_effet);
               date_deffet.enable();
               
               Date date_échéance = new SimpleDateFormat("dd/MM/yyyy").parse((String)rs.getString("date_échéance").toString());
               txtdatee.setDate(date_échéance);
               txtdatee.enable(false);
               
               String heure = rs.getString("heure");
                txtheure.setSelectedItem(heure);
                txtheure.enable(false);
                
                String période = rs.getString("période");
                txtperiode.setSelectedItem(période);
                txtperiode.enable(false); 
                
                 String prix = rs.getString("prix");
                txtpaiement.setText(prix);
                txtpaiement.enable(false); 
                
                String paiement = rs.getString("paiement");
                txtprix.setText(paiement);
                txtprix.enable(false); 
                
                
                 String reste = rs.getString("reste");
                txtreste.setText(reste);
                txtreste.enable(false); 
            }
            con.close();
            

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

    private void txtpoliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpoliceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpoliceActionPerformed

    private void txtresteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresteActionPerformed

    private void txtpaiementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaiementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaiementActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void txtperiodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtperiodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtperiodeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

                  SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
     
        txtprint.append(
                       "                        "+"Assurance ALLIANZ"      +"\n" 
                       +"                                                    \n"  
                       +"Nom Complet :" +"  " +txtnom.getText()            +"\n"  
                       +"Matricule :"+"   "  +txtmatricule.getText()       +"\n"  
                       +"Marque :"+"   "  +txtmarque.getText()             +"\n"  
                       +"N°police :" +"   " +txtpolice.getText()           +"\n"  
                       +"    " +"-----------------------------------------------------\n"  
                       +"date d'effet :"+"  "  +df.format(date_deffet.getDate())     +"\n" 
                       +"Date d'échéance :"+"  "  +df.format(txtdatee.getDate())    +"\n"         
                       +"   " +" -----------------------------------------------------\n"  
                       +"heure :"+"   " + txtheure.getSelectedItem()       +"\n"
                       +"période :"+"   " + txtperiode.getSelectedItem()   +"\n" 
                       +"    " +"-----------------------------------------------------\n"  
                       +"prix :"+"   "  +txtpaiement.getText()             +"\n"
                       +"paiement :"+"   "  +txtprix.getText()             +"\n"   
                       +"reste:"+"    "  +txtreste.getText()               +"\n"
        
                       +"                                                 ");
       



    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtprixKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprixKeyReleased

     

    }//GEN-LAST:event_txtprixKeyReleased

    private void txtpaiementKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaiementKeyReleased
 
        int prix =Integer.parseInt(txtprix.getText());
       int paiement =Integer.parseInt(txtpaiement.getText());
       int reste = prix-paiement ;
       txtreste.setText(String.valueOf(reste));

    }//GEN-LAST:event_txtpaiementKeyReleased
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        LocalDateTime now = LocalDateTime.now();
        Document doc = new Document();

       
        if (txtprint.getText().trim().equals("")) {
            txtprint.requestFocus();
            JOptionPane.showMessageDialog(this, "ATTESTATION VIDE", "ERREUR", JOptionPane.ERROR_MESSAGE);
        } 
        else {
            try {
                PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\khayatti\\Desktop\\rapport\\rapport.pdf"));
                doc.open();
                 
                Paragraph pp = new Paragraph("\n");
                doc.add(pp);
                
                Font font = FontFactory.getFont(FontFactory.TIMES_BOLD, 20, BaseColor.DARK_GRAY);
                Chunk chunk = new Chunk("   "+"Attestation d'assurance khayatti", font);
            
                   
                Image img = Image.getInstance("C:\\Users\\khayatti\\Desktop\\Assurance\\src\\assurance\\logo.png");
                img.scaleAbsoluteWidth(200);               
                img.scaleAbsoluteHeight(40);
                img.setAlignment(Image.ALIGN_BOTTOM);
                doc.add(chunk);
                doc.add(img);
               
                Paragraph par1 = new Paragraph("\n");
                doc.add(par1);
                Font font1 = FontFactory.getFont(FontFactory.TIMES, 15, BaseColor.BLACK);
                Chunk chunk1 = new Chunk("                      "+      "Générer Le " + dtf.format(now), font1);
                doc.add(chunk1);
                Paragraph par = new Paragraph("\n");
                doc.add(par);
                Paragraph pr = new Paragraph("\n");
                doc.add(pr);
                PdfPTable table = new PdfPTable(2);
                PdfPCell cell= new PdfPCell(new Paragraph("USAGE" +" : "+"TOURISME "));
                cell.setColspan(13);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(cell);
                
                table.addCell("NOM COMPLET");
                table.addCell(txtnom.getText());
                table.addCell("MATRICULE");
                table.addCell(txtmatricule.getText());
                table.addCell("MARQUE");
                table.addCell(txtmarque.getText());
                table.addCell("N°POLICE");
                table.addCell(txtpolice.getText());
               
                PdfPCell c= new PdfPCell(new Paragraph("DATE & TIME"));
                c.setColspan(13);
                c.setHorizontalAlignment(Element.ALIGN_CENTER);
                c.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(c);

                table.addCell("DATE D'EFFET");
                table.addCell(df.format(date_deffet.getDate()));
                table.addCell("DATE D'ECHEANCE");
                table.addCell(df.format(txtdatee.getDate()));           
                table.addCell("HEURE DEBUT");
                table.addCell((String) txtheure.getSelectedItem()); 
                table.addCell("PERIODE");
                table.addCell((String) txtperiode.getSelectedItem());
                
                PdfPCell cl= new PdfPCell(new Paragraph("PAIEMENT"));
                cl.setColspan(13);
                cl.setHorizontalAlignment(Element.ALIGN_CENTER);
                cl.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(cl);
                
                table.addCell("PRIX");
                table.addCell(txtprix.getText());
                table.addCell("PAIEMENT");
                table.addCell(txtpaiement.getText());
                table.addCell("RESTE");
                table.addCell(txtreste.getText());
                doc.add(table);
 
                Paragraph f = new Paragraph("\n");
                doc.add(f);
                Paragraph r = new Paragraph("                                           "+"                                               SIGNATURE :");
                doc.add(r);
               
                doc.close();
                JOptionPane.showMessageDialog(this, "ATTESTATION CREE", "ATTESTATION", JOptionPane.INFORMATION_MESSAGE);
                Desktop.getDesktop().open(new File ("C:\\Users\\khayatti\\Desktop\\rapport\\rapport.pdf"));

            } catch (DocumentException ex) {
                Logger.getLogger(Attestation.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Attestation.class.getName()).log(Level.SEVERE, null, ex);
            }            }

        


               
                   
                    
             



    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


        txtheure.setSelectedItem(null);
        txtperiode.setSelectedItem(null);
        txtdatee.setDate(null);
        date_deffet.setDate(null);
        txtnom.setText("");
        txtpaiement.setText("");
        txtmatricule.setText("");
        txtreste.setText("");
        txtmarque.setText("");
        txtpolice.setText("");
        txtpaiement.setText("");
    
        txtprint.setText("");


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Attestation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attestation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attestation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attestation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attestation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date_deffet;
    private javax.swing.JLabel image;
    private javax.swing.JLabel image1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rech;
    private javax.swing.JTextField ref1;
    private com.toedter.calendar.JDateChooser txtdatee;
    private javax.swing.JLabel txtemployee;
    private javax.swing.JComboBox<String> txtheure;
    private javax.swing.JTextField txtmarque;
    private javax.swing.JComboBox<String> txtmat;
    private javax.swing.JTextField txtmatricule;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpaiement;
    private javax.swing.JComboBox<String> txtperiode;
    private javax.swing.JTextField txtpolice;
    private javax.swing.JTextArea txtprint;
    private javax.swing.JTextField txtprix;
    private javax.swing.JTextField txtreste;
    // End of variables declaration//GEN-END:variables

   
}
