package proiect.magazinbiciclete;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Horatiu
 */
public class AngajatiSiBicicleteSiContact extends javax.swing.JFrame {
    int storeID;
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
   
    public AngajatiSiBicicleteSiContact() {
        initComponents();
        
    }
    
    public AngajatiSiBicicleteSiContact(int storeID) {
        this.storeID = storeID;
        initComponents();
        ShowEmp();
        ShowBike();
        ShowContact();
    }

    public void setStoreID(int number) {
        this.storeID = number;
    }
    
    private void ShowEmp() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
            St = Con.createStatement();
            Rs = St.executeQuery("select magazinID, nume, prenume, varsta, username from angajat where magazinID ='" + this.storeID + "'"
                    + "order by angajatID");
            EmpTb.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    
    
    private void ShowBike() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
            St = Con.createStatement();
            Rs = St.executeQuery("select magazinID, producator, model, tip, culoare, pret from bicicleta where magazinID ='" + this.storeID + "'"
                    + "order by bicicletaID");
            BikeTb.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private void ShowContact() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
            St = Con.createStatement();
            Rs = St.executeQuery("select magazinID, contactID, telefon, email from contact where magazinID ='" + this.storeID + "'"
                    + "order by contactID");
            PhoneNumberTb.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpTb = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        PhoneNumberTb = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        BikeTb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EmpNameLabel = new javax.swing.JLabel();
        EmpNameTA = new javax.swing.JTextField();
        EmpNameBtn = new javax.swing.JButton();
        BikeNameLabel = new javax.swing.JLabel();
        BikeNameTA = new javax.swing.JTextField();
        BikeNameBtn = new javax.swing.JButton();
        PhoneNumberLabel = new javax.swing.JLabel();
        PhoneNumberTA = new javax.swing.JTextField();
        PhoneNumberBtn = new javax.swing.JButton();
        ResetEmpBtn = new javax.swing.JButton();
        ResetBikeBtn = new javax.swing.JButton();
        ResetPhoneBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JLabel();
        StoreBtn = new javax.swing.JLabel();
        BikeBtn = new javax.swing.JLabel();
        EmpBtn1 = new javax.swing.JLabel();
        ContactBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        EmpTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        EmpTb.setEnabled(false);
        jScrollPane1.setViewportView(EmpTb);

        PhoneNumberTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        PhoneNumberTb.setEnabled(false);
        jScrollPane2.setViewportView(PhoneNumberTb);

        BikeTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        BikeTb.setEnabled(false);
        jScrollPane3.setViewportView(BikeTb);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detalii Magazin");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Angajați");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Biciclete");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact");

        EmpNameLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        EmpNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmpNameLabel.setText("Nume:");

        EmpNameBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        EmpNameBtn.setText("Caută");
        EmpNameBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpNameBtnMouseClicked(evt);
            }
        });

        BikeNameLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        BikeNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        BikeNameLabel.setText("Producător:");

        BikeNameBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        BikeNameBtn.setText("Caută");
        BikeNameBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BikeNameBtnMouseClicked(evt);
            }
        });

        PhoneNumberLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        PhoneNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberLabel.setText("Telefon:");

        PhoneNumberBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        PhoneNumberBtn.setText("Caută");
        PhoneNumberBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhoneNumberBtnMouseClicked(evt);
            }
        });

        ResetEmpBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        ResetEmpBtn.setText("Resetează");
        ResetEmpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetEmpBtnMouseClicked(evt);
            }
        });

        ResetBikeBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        ResetBikeBtn.setText("Resetează");
        ResetBikeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBikeBtnMouseClicked(evt);
            }
        });

        ResetPhoneBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        ResetPhoneBtn.setText("Resetează");
        ResetPhoneBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetPhoneBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmpNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(EmpNameTA, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EmpNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ResetEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(256, 256, 256)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BikeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BikeNameTA, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BikeNameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ResetBikeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PhoneNumberTA, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PhoneNumberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ResetPhoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BikeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BikeNameTA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BikeNameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(ResetBikeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(EmpNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmpNameTA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpNameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResetEmpBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneNumberTA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNumberBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(ResetPhoneBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        LogoutBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(153, 0, 153));
        LogoutBtn.setText("Deconectare");
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });

        StoreBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        StoreBtn.setForeground(new java.awt.Color(153, 0, 153));
        StoreBtn.setText("Magazin");
        StoreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StoreBtnMouseClicked(evt);
            }
        });

        BikeBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        BikeBtn.setForeground(new java.awt.Color(153, 0, 153));
        BikeBtn.setText("Biciclete");
        BikeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BikeBtnMouseClicked(evt);
            }
        });

        EmpBtn1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        EmpBtn1.setForeground(new java.awt.Color(153, 0, 153));
        EmpBtn1.setText("Aangajați");
        EmpBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpBtn1MouseClicked(evt);
            }
        });

        ContactBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        ContactBtn.setForeground(new java.awt.Color(153, 0, 153));
        ContactBtn.setText("Contact");
        ContactBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StoreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BikeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmpBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContactBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(StoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EmpBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BikeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ContactBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StoreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StoreBtnMouseClicked
        // TODO add your handling code here:
        try {
            new ConectareMagazin().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_StoreBtnMouseClicked

    private void BikeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BikeBtnMouseClicked
        // TODO add your handling code here:
        try {
            AdaugareBicicleta obj = new AdaugareBicicleta(this.storeID);
            obj.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_BikeBtnMouseClicked

    private void EmpBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpBtn1MouseClicked
        // TODO add your handling code here:
        try {
            new InregistrareAngajat(this.storeID).setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_EmpBtn1MouseClicked

    private void ContactBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactBtnMouseClicked
        // TODO add your handling code here:
        try {
            new AdaugareContact(this.storeID).setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_ContactBtnMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        // TODO add your handling code here:
        try {
            new Magazin().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void EmpNameBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpNameBtnMouseClicked
        // TODO add your handling code here:
        if (EmpNameTA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
            St = Con.createStatement();
            Rs = St.executeQuery("select magazinID, nume, prenume, varsta, username from angajat where magazinID ='" + this.storeID + "'"
                    + "having nume = '" + EmpNameTA.getText() +"'"
                    + "order by angajatID");
                EmpTb.setModel(DbUtils.resultSetToTableModel(Rs));
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_EmpNameBtnMouseClicked

    private void ResetEmpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetEmpBtnMouseClicked
        // TODO add your handling code here:
        try {
            ShowEmp();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_ResetEmpBtnMouseClicked

    private void BikeNameBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BikeNameBtnMouseClicked
        // TODO add your handling code here:
        if (BikeNameTA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
            St = Con.createStatement();
            Rs = St.executeQuery("select magazinID, producator, model, tip, culoare, pret from bicicleta where magazinID ='" + this.storeID + "'"
                    + "having LOWER(producator) = '" + BikeNameTA.getText().toLowerCase() +"'"
                    + "order by bicicletaID");
                BikeTb.setModel(DbUtils.resultSetToTableModel(Rs));
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_BikeNameBtnMouseClicked

    private void ResetBikeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBikeBtnMouseClicked
        // TODO add your handling code here:
        try {
            ShowBike();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_ResetBikeBtnMouseClicked

    private void PhoneNumberBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhoneNumberBtnMouseClicked
        // TODO add your handling code here:
        if (PhoneNumberTA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
            St = Con.createStatement();
            Rs = St.executeQuery("select magazinID, contactID, telefon, email from contact where magazinID ='" + this.storeID + "'"
                    + "having telefon = '" + PhoneNumberTA.getText() +"'"
                    + "order by contactID");
                PhoneNumberTb.setModel(DbUtils.resultSetToTableModel(Rs));
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_PhoneNumberBtnMouseClicked

    private void ResetPhoneBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetPhoneBtnMouseClicked
        // TODO add your handling code here:
        try {
            ShowContact();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_ResetPhoneBtnMouseClicked

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
            java.util.logging.Logger.getLogger(AngajatiSiBicicleteSiContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AngajatiSiBicicleteSiContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AngajatiSiBicicleteSiContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AngajatiSiBicicleteSiContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AngajatiSiBicicleteSiContact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BikeBtn;
    private javax.swing.JButton BikeNameBtn;
    private javax.swing.JLabel BikeNameLabel;
    private javax.swing.JTextField BikeNameTA;
    private javax.swing.JTable BikeTb;
    private javax.swing.JLabel ContactBtn;
    private javax.swing.JLabel EmpBtn1;
    private javax.swing.JButton EmpNameBtn;
    private javax.swing.JLabel EmpNameLabel;
    private javax.swing.JTextField EmpNameTA;
    private javax.swing.JTable EmpTb;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JButton PhoneNumberBtn;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JTextField PhoneNumberTA;
    private javax.swing.JTable PhoneNumberTb;
    private javax.swing.JButton ResetBikeBtn;
    private javax.swing.JButton ResetEmpBtn;
    private javax.swing.JButton ResetPhoneBtn;
    private javax.swing.JLabel StoreBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
