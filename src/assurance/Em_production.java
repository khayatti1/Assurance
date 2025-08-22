
package assurance;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Em_production extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public Em_production() {
        initComponents();

         
                Table();
                 Actualiser();
                 txtreste.enable(false);
    }
String test;
    Em_production(String text) {
        initComponents();
        this.test = text;
        txtemployee.setText(text);
           Table();
                 Actualiser();
                   txtreste.enable(false);
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
        panagenda = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtnom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprenom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtadresse = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcin = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        txtmatricule = new javax.swing.JTextField();
        txtmarque = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtchevaux = new javax.swing.JComboBox<>();
        txtcarburant = new javax.swing.JComboBox<>();
        txtpolice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtperiode = new javax.swing.JComboBox<>();
        txtdatee = new com.toedter.calendar.JDateChooser();
        date_deffet = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtheure = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtprix = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtpaiement = new javax.swing.JTextField();
        txtreste = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtetat = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        imagee = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        ref1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        ref = new javax.swing.JTextField();
        txtemployee = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gérer production");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panagenda.setBackground(new java.awt.Color(204, 204, 255));
        panagenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personnel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 24))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnom.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txtnom.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 260, 30));

        jLabel4.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel4.setText("CIN");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 40, 30));

        jLabel5.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel5.setText("Prenom");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 90, 30));

        txtprenom.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txtprenom.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 260, 30));

        jLabel7.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel7.setText("Adresse");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 30));

        txtadresse.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txtadresse.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel5.add(txtadresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 260, 30));

        jLabel9.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel9.setText("Numero");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 90, 30));

        txtnumero.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txtnumero.setPreferredSize(new java.awt.Dimension(6, 30));
        txtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroActionPerformed(evt);
            }
        });
        jPanel5.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 260, 30));

        jLabel6.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel6.setText("Nom");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 90, 30));

        txtcin.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txtcin.setPreferredSize(new java.awt.Dimension(6, 30));
        txtcin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcinActionPerformed(evt);
            }
        });
        jPanel5.add(txtcin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 260, 30));

        panagenda.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 410, 260));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicule", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 24))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtmatricule.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txtmatricule.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel8.add(txtmatricule, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 190, 30));

        txtmarque.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txtmarque.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel8.add(txtmarque, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 190, 30));

        jLabel8.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel8.setText("Matricule");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 30));

        jLabel11.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel11.setText("Carburant");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, 30));

        jLabel13.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel13.setText("Marque");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 90, 30));

        jLabel10.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel10.setText("N° chevaux ");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, 30));

        txtchevaux.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtchevaux.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        txtchevaux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchevauxActionPerformed(evt);
            }
        });
        jPanel8.add(txtchevaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 190, 30));

        txtcarburant.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtcarburant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasoil", "Diesel" }));
        jPanel8.add(txtcarburant, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 190, 30));

        txtpolice.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txtpolice.setPreferredSize(new java.awt.Dimension(6, 30));
        jPanel8.add(txtpolice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 190, 30));

        jLabel14.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel14.setText("N° Police");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, 30));

        panagenda.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 400, 260));

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Durée", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 24))); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel18.setText("Période d'assurace");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, 30));

        txtperiode.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtperiode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1mois", "3mois", "6mois", "1ans" }));
        txtperiode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtperiodeActionPerformed(evt);
            }
        });
        jPanel9.add(txtperiode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 180, 30));

        txtdatee.setDateFormatString("dd/MM/yyyy");
        jPanel9.add(txtdatee, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 180, 30));

        date_deffet.setDateFormatString("dd/MM/yyyy");
        jPanel9.add(date_deffet, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 180, 30));

        jLabel17.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel17.setText("Date d'effet");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 130, 30));

        jLabel19.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel19.setText("Heure démarer");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 30));

        txtheure.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtheure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00H", "01H", "02H", "03H", "04H", "05H", "06H", "07H", "08H", "09H", "10H", "11H", "12H", "13H", "14H", "15H", "16H", "17H", "18H", "19H", "20H", "21H", "22H", "23H" }));
        jPanel9.add(txtheure, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 180, 30));

        jLabel20.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel20.setText("Date d'échéance");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 30));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 390, 10));

        panagenda.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 20, 430, 260));
        panagenda.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, -1, -1));

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

        panagenda.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 1650, 370));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Paiement", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 24))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actions", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 24))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setBackground(new java.awt.Color(255, 255, 153));
        jButton10.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton10.setText("Attestation");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 160, 50));

        jButton13.setBackground(new java.awt.Color(153, 255, 153));
        jButton13.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton13.setText("Modifier");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 160, 50));

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jButton5.setText("Deconnecter");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, -1, 50));

        jButton14.setBackground(new java.awt.Color(153, 153, 255));
        jButton14.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton14.setText("Enregistrer");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 160, 50));

        jButton15.setBackground(new java.awt.Color(255, 204, 153));
        jButton15.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton15.setText("Accueil");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 160, 50));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 960, 110));

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actions", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 24))); // NOI18N
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton16.setBackground(new java.awt.Color(255, 255, 153));
        jButton16.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton16.setText("Attestation");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 160, 50));

        jButton17.setBackground(new java.awt.Color(153, 255, 153));
        jButton17.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton17.setText("Modifier");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 160, 50));

        jButton6.setBackground(new java.awt.Color(255, 102, 102));
        jButton6.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jButton6.setText("Deconnecter");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, -1, 50));

        jButton18.setBackground(new java.awt.Color(153, 153, 255));
        jButton18.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton18.setText("Enregistrer");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 160, 50));

        jButton19.setBackground(new java.awt.Color(255, 204, 153));
        jButton19.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton19.setText("Accueil");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 160, 50));

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actions", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 24))); // NOI18N
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton20.setBackground(new java.awt.Color(255, 255, 153));
        jButton20.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton20.setText("Attestation");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 160, 50));

        jButton21.setBackground(new java.awt.Color(153, 255, 153));
        jButton21.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton21.setText("Modifier");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 160, 50));

        jButton7.setBackground(new java.awt.Color(255, 102, 102));
        jButton7.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jButton7.setText("Deconnecter");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, -1, 50));

        jButton22.setBackground(new java.awt.Color(153, 153, 255));
        jButton22.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton22.setText("Enregistrer");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 160, 50));

        jButton23.setBackground(new java.awt.Color(255, 204, 153));
        jButton23.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton23.setText("Accueil");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 160, 50));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 960, 110));

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 960, 110));

        jLabel16.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel16.setText("Prix ");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 70, -1));

        txtprix.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jPanel6.add(txtprix, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 190, 30));

        jLabel23.setFont(new java.awt.Font("Corbel Light", 1, 25)); // NOI18N
        jLabel23.setText("Paiement");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 30));

        txtpaiement.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txtpaiement.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpaiementKeyReleased(evt);
            }
        });
        jPanel6.add(txtpaiement, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 190, 30));

        txtreste.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txtreste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresteActionPerformed(evt);
            }
        });
        jPanel6.add(txtreste, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 190, 30));

        jLabel22.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel22.setText("Reste");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, -1));

        jLabel3.setFont(new java.awt.Font("Corbel Light", 1, 24)); // NOI18N
        jLabel3.setText("Etat");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 50, -1));

        txtetat.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        txtetat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accepter", "En attent" }));
        jPanel6.add(txtetat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 190, 30));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 330, 10));

        panagenda.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 20, 370, 260));

        jPanel13.setBackground(new java.awt.Color(204, 204, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Action", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 24))); // NOI18N
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setBackground(new java.awt.Color(153, 153, 255));
        jButton11.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton11.setText("Enregistrer");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 170, 50));

        jButton9.setBackground(new java.awt.Color(153, 255, 153));
        jButton9.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton9.setText("Modifier");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 170, 50));

        jButton8.setBackground(new java.awt.Color(255, 255, 153));
        jButton8.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton8.setText("Attestation");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 170, 50));

        jButton12.setBackground(new java.awt.Color(255, 204, 153));
        jButton12.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton12.setText("Accueil");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 170, 50));

        jButton24.setBackground(new java.awt.Color(255, 102, 102));
        jButton24.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 18)); // NOI18N
        jButton24.setText("Supprimer");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 160, 50));

        panagenda.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, 970, 130));

        jPanel1.add(panagenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1700, 830));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagee.setBackground(new java.awt.Color(51, 51, 255));
        imagee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assurance/logoa.png"))); // NOI18N
        jPanel2.add(imagee, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 370, 80));

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recherche par LOGIN\n", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 24))); // NOI18N
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ref1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        ref1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ref1KeyReleased(evt);
            }
        });
        jPanel12.add(ref1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 40));

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
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 20, -1, 50));

        ref.setBackground(new java.awt.Color(204, 204, 255));
        ref.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        ref.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                refKeyReleased(evt);
            }
        });
        jPanel2.add(ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 340, 40));

        txtemployee.setBackground(new java.awt.Color(204, 204, 255));
        txtemployee.setFont(new java.awt.Font("Tw Cen MT", 0, 3)); // NOI18N
        txtemployee.setForeground(new java.awt.Color(204, 204, 255));
        txtemployee.setText("jLabel1");
        jPanel2.add(txtemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 930));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtchevauxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchevauxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtchevauxActionPerformed

    private void txtperiodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtperiodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtperiodeActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        super.dispose();
        Attestation meconnecter = new Attestation();
        meconnecter.setVisible(true);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

         try {
            Connect();
                pst = con.prepareStatement("update client set nom=?, prenom=?, adresse=?,numero=?, marque=?,carburant=?,cheveux=?,date_effet=?,heure=?,période=?,date_échéance=?,prix=?,paiement=?,reste=?,etat=?,cin=? where police=? and matricule=?");
                pst.setString(1, txtnom.getText());
                pst.setString(2, txtprenom.getText());
                pst.setString(3, txtadresse.getText());
                pst.setString(4, txtnumero.getText());
                pst.setString(5, txtmarque.getText());
                pst.setString(6, txtcarburant.getSelectedItem().toString());
                pst.setString(7, txtchevaux.getSelectedItem().toString());
                pst.setString(8,((JTextField)date_deffet.getDateEditor().getUiComponent()).getText());
                pst.setString(9, txtheure.getSelectedItem().toString());
                pst.setString(10, txtperiode.getSelectedItem().toString());
                pst.setString(11,((JTextField)txtdatee.getDateEditor().getUiComponent()).getText());
                pst.setString(12, txtpaiement.getText());
                pst.setString(13, txtprix.getText());
                pst.setString(14, txtreste.getText());
                pst.setString(15, txtetat.getSelectedItem().toString());
                pst.setString(16, txtcin.getText());
                pst.setString(17, txtpolice.getText());
                pst.setString(18, txtmatricule.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null," Modifier");
            
            con.close();
            Table();
            Actualiser();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
       } 

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        super.dispose();
        Login meconnecter = new Login();
        meconnecter.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

           try {
                Connect();
                pst = con.prepareStatement("insert into client (cin,nom, prenom, adresse,numero, matricule, marque,police,carburant,cheveux,date_effet,heure,période,date_échéance,prix,paiement,reste,etat ) values (?,?,?,?, ?,?,?,?, ?,?,?,?,?,?, ?,?,?,?)");
                pst.setString(1, txtcin.getText());
                pst.setString(2, txtnom.getText());
                pst.setString(3, txtprenom.getText());
                pst.setString(4, txtadresse.getText());
                pst.setString(5, txtnumero.getText());
                pst.setString(6, txtmatricule.getText());
                pst.setString(7, txtmarque.getText());
                pst.setString(8, txtpolice.getText());
                pst.setString(9, txtcarburant.getSelectedItem().toString());
                pst.setString(10, txtchevaux.getSelectedItem().toString());
                pst.setString(11,((JTextField)date_deffet.getDateEditor().getUiComponent()).getText());
                pst.setString(12, txtheure.getSelectedItem().toString());
                pst.setString(13, txtperiode.getSelectedItem().toString());
                pst.setString(14,((JTextField)txtdatee.getDateEditor().getUiComponent()).getText());
                pst.setString(15, txtpaiement.getText());
                pst.setString(16, txtprix.getText());
                pst.setString(17, txtreste.getText());
                pst.setString(18, txtetat.getSelectedItem().toString());
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null," Ajouter");    
                Table();
                Actualiser();
                 con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                e.printStackTrace();
            }
        
    }//GEN-LAST:event_jButton11ActionPerformed

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
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
 
    }//GEN-LAST:event_tableKeyPressed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased


    }//GEN-LAST:event_tableMouseReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
 try {
        int selectioner = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        txtcin.setText(model.getValueAt(selectioner, 0).toString());
        txtnom.setText(model.getValueAt(selectioner, 1).toString());
        txtprenom.setText(model.getValueAt(selectioner, 2).toString());
        txtadresse.setText(model.getValueAt(selectioner, 3).toString());
        txtnumero.setText(model.getValueAt(selectioner, 4).toString());
        txtmatricule.setText(model.getValueAt(selectioner, 5).toString());
        txtmarque.setText(model.getValueAt(selectioner, 6).toString());
         txtpolice.setText(model.getValueAt(selectioner, 7).toString());
        txtcarburant.setSelectedItem(model.getValueAt(selectioner, 8).toString());
        txtchevaux.setSelectedItem(model.getValueAt(selectioner, 9).toString());
     
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse((String)model.getValueAt(selectioner,10).toString());  
            date_deffet.setDate(date);
       
        txtheure.setSelectedItem(model.getValueAt(selectioner, 11).toString());
        txtperiode.setSelectedItem(model.getValueAt(selectioner, 12).toString());
       
  
            Date dt = new SimpleDateFormat("dd/MM/yyyy").parse((String)model.getValueAt(selectioner,13).toString());  
            txtdatee.setDate(dt);
            
                    txtpaiement.setText(model.getValueAt(selectioner,14).toString());
                    txtprix.setText(model.getValueAt(selectioner, 15).toString());
                    txtreste.setText(model.getValueAt(selectioner, 16).toString());
                    txtetat.setSelectedItem(model.getValueAt(selectioner, 17).toString());

        } catch (ParseException ex) {
            Logger.getLogger(Em_production.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tableMouseClicked

    private void txtcinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcinActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void refKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_refKeyReleased
        try {
            showData(ref.getText());       
        } catch (SQLException ex) {
            Logger.getLogger(Em_production.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_refKeyReleased

    private void ref1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ref1KeyReleased

    }//GEN-LAST:event_ref1KeyReleased

    private void txtresteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresteActionPerformed

    private void txtpaiementKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpaiementKeyReleased

        int prix =Integer.parseInt(txtprix.getText());
        int paiement =Integer.parseInt(txtpaiement.getText());
        int reste = prix - paiement ;
        txtreste.setText(String.valueOf(reste));

    }//GEN-LAST:event_txtpaiementKeyReleased

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        try {
            Connect();
            pst = con.prepareStatement("delete  from client where matricule=?");
            pst.setString(1, txtmatricule.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, txtmatricule.getText().toString() + " Supprimer");
            Table();
            Actualiser();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton24ActionPerformed
      private void showData(String x) throws SQLException{                 
        Connect();
        String sql = "select * from client where police like '" + x + "%' or nom like '" + x + "%' or matricule like '" + x + "%'";
        pst  = con.prepareStatement(sql);
        rs = pst.executeQuery();
        DefaultTableModel m = new DefaultTableModel();
  m.setColumnIdentifiers(new String[] {"CIN", "NOM" ,"PRENOM", "ADRESSE", "NUMERO", "MATRICULE", "MARQUE","N°POLICE","CARBURANT","N°CHEVEUX","DATE D'EFFET","HEURE","PERIODE","DATE D'ECHEANCE","PRIX","PAIEMENT","RESTE","ETAT"});
        try {
          while(rs.next()){
               m.addRow(new String[] {rs.getString("cin"),rs.getString("nom"),rs.getString("prenom"), rs.getString("adresse"),rs.getString("numero"), rs.getString("matricule"),rs.getString("marque"),rs.getString("police"), rs.getString("carburant"), rs.getString("cheveux"),rs.getString("date_effet"),rs.getString("heure"),rs.getString("période"), rs.getString("date_échéance"),rs.getString("prix"),rs.getString("paiement"),rs.getString("reste"),rs.getString("etat")});
          }  
        } 
        catch (SQLException e) {}
        table.setModel(m);
    }
    
    private void Actualiser() {

        txtcarburant.setSelectedItem(null);        
        txtheure.setSelectedItem(null);
        txtchevaux.setSelectedItem(null);
        txtperiode.setSelectedItem(null);
        txtetat.setSelectedItem(null);
        txtdatee.setDate(null);
        date_deffet.setDate(null);
        txtnom.setText("");
        txtcin.setText("");
        txtprenom.setText("");
        txtadresse.setText("");
        txtmatricule.setText("");
        txtnumero.setText("");
        txtmarque.setText("");
        txtpolice.setText("");
        txtreste.setText("");
        txtpaiement.setText("");
        txtprix.setText("");
    }
   
      public void Table() {
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
            java.util.logging.Logger.getLogger(Em_production.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Em_production.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Em_production.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Em_production.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Em_production().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date_deffet;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel imagee;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panagenda;
    private javax.swing.JTextField ref;
    private javax.swing.JTextField ref1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtadresse;
    private javax.swing.JComboBox<String> txtcarburant;
    private javax.swing.JComboBox<String> txtchevaux;
    private javax.swing.JTextField txtcin;
    private com.toedter.calendar.JDateChooser txtdatee;
    private javax.swing.JLabel txtemployee;
    private javax.swing.JComboBox<String> txtetat;
    private javax.swing.JComboBox<String> txtheure;
    private javax.swing.JTextField txtmarque;
    private javax.swing.JTextField txtmatricule;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpaiement;
    private javax.swing.JComboBox<String> txtperiode;
    private javax.swing.JTextField txtpolice;
    private javax.swing.JTextField txtprenom;
    private javax.swing.JTextField txtprix;
    private javax.swing.JTextField txtreste;
    // End of variables declaration//GEN-END:variables
}
