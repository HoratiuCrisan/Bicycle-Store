package proiect.magazinbiciclete;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Horatiu
 */
public class AdaugareContact extends javax.swing.JFrame {
    int storeID;
    Connection Con = null;
    ResultSet Rs = null;
    int PNumber;
    int Key = 0;
    Statement St = null;
    
    public AdaugareContact() {
        initComponents();
        ShowItems();
    }
    
    public AdaugareContact(int storeID) {
        this.storeID = storeID;
        initComponents();
        ShowItems();
    }
    
    private void CountItems() {
        try {
            St = Con.createStatement();
            Rs = St.executeQuery("select MAX(contactID) from contact");
            Rs.next();
            PNumber = Rs.getInt(1) + 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void ShowItems() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
            St = Con.createStatement();
            Rs = St.executeQuery("""
                                 select contactID, magazin.*, telefon, email 
                                 from magazinbiciclete.contact
                                 join magazinbiciclete.magazin on
                                 magazinbiciclete.contact.magazinID = magazinbiciclete.magazin.magazinID
                                 having magazinID ='""" + this.storeID + "'"
                                 + "order by contactID");
            PhoneListTb.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PhoneNumberLabel = new javax.swing.JLabel();
        PhoneNumberTA = new javax.swing.JTextField();
        AddPhoneBtn = new javax.swing.JButton();
        DeletePhoneBtn = new javax.swing.JButton();
        EditPhoneBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PhoneListTb = new javax.swing.JTable();
        EmailLabel = new javax.swing.JLabel();
        EmailTA = new javax.swing.JTextField();
        LogoutBtn = new javax.swing.JLabel();
        MenuBtn = new javax.swing.JLabel();
        EmployeeBtn = new javax.swing.JLabel();
        BikeBtn = new javax.swing.JLabel();
        StoreBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Adăugare Contact");

        PhoneNumberLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        PhoneNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumberLabel.setText("Număr telefon");

        AddPhoneBtn.setText("Adaugă");
        AddPhoneBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddPhoneBtnMouseClicked(evt);
            }
        });

        DeletePhoneBtn.setText("Șterge");
        DeletePhoneBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletePhoneBtnMouseClicked(evt);
            }
        });

        EditPhoneBtn.setText("Editează");
        EditPhoneBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditPhoneBtnMouseClicked(evt);
            }
        });

        PhoneListTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        PhoneListTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhoneListTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PhoneListTb);

        EmailLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("Email");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddPhoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(DeletePhoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PhoneNumberTA, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditPhoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailTA, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumberTA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddPhoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeletePhoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditPhoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        LogoutBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(153, 0, 153));
        LogoutBtn.setText("Deconectare");
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });

        MenuBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        MenuBtn.setForeground(new java.awt.Color(153, 0, 153));
        MenuBtn.setText("Meniu");
        MenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBtnMouseClicked(evt);
            }
        });

        EmployeeBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        EmployeeBtn.setForeground(new java.awt.Color(153, 0, 153));
        EmployeeBtn.setText("Angajați");
        EmployeeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeBtnMouseClicked(evt);
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

        StoreBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        StoreBtn.setForeground(new java.awt.Color(153, 0, 153));
        StoreBtn.setText("Magazin");
        StoreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StoreBtnMouseClicked(evt);
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
                    .addComponent(MenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmployeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BikeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StoreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(StoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BikeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

    private void MenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBtnMouseClicked
        // TODO add your handling code here:
        try {
            new AngajatiSiBicicleteSiContact(this.storeID).setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_MenuBtnMouseClicked

    private void EmployeeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeBtnMouseClicked
        // TODO add your handling code here:
        try {
            new InregistrareAngajat(this.storeID).setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_EmployeeBtnMouseClicked

    private void BikeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BikeBtnMouseClicked
        // TODO add your handling code here:
        try {
            new AdaugareBicicleta(this.storeID).setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_BikeBtnMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        // TODO add your handling code here:
        try {
            new Magazin().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void AddPhoneBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPhoneBtnMouseClicked
        // TODO add your handling code here:
        if (PhoneNumberTA.getText().isEmpty() && EmailTA.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
                CountItems();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
                PreparedStatement Pst = Con.prepareStatement("insert into contact(magazinID,telefon, email) values(?,?,?)");
                Pst.setInt(1, this.storeID);
                Pst.setString(2, PhoneNumberTA.getText());
                Pst.setString(3, EmailTA.getText());
                Pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Item adaugat!");
                Con.close();
                ShowItems();
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                System.out.println(e + "");
            }
        }
    }//GEN-LAST:event_AddPhoneBtnMouseClicked

    private void DeletePhoneBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletePhoneBtnMouseClicked
        // TODO add your handling code here:
        if (PhoneNumberTA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
                CountItems();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
                PreparedStatement Pst = Con.prepareStatement("delete from contact where contactID = ?");
                Pst.setInt(1, Key);
                Pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Item sters!");
                Con.close();
                ShowItems();
           } catch (HeadlessException | SQLException e) {
                System.out.println(e + "");
            }
        }
    }//GEN-LAST:event_DeletePhoneBtnMouseClicked

    private void EditPhoneBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditPhoneBtnMouseClicked
        // TODO add your handling code here:
        if (PhoneNumberTA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
                CountItems();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
                PreparedStatement Pst = Con.prepareStatement("update contact set  telefon=?, email=?  where contactID=?");
                Pst.setInt(3, Key);
                Pst.setString(1, PhoneNumberTA.getText());
                Pst.setString(2, EmailTA.getText());
                Pst.executeUpdate();
                Con.close();
                ShowItems();
                JOptionPane.showMessageDialog(this,  "Item editat!");
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_EditPhoneBtnMouseClicked

    private void PhoneListTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhoneListTbMouseClicked
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) PhoneListTb.getModel();
            int MyIndex = PhoneListTb.getSelectedRow();
            Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
            PhoneNumberTA.setText(model.getValueAt(MyIndex, 5).toString());
            EmailTA.setText(model.getValueAt(MyIndex, 6).toString());
        } catch (NumberFormatException e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_PhoneListTbMouseClicked

    private void StoreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StoreBtnMouseClicked
        // TODO add your handling code here:
        try {
            new ConectareMagazin().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_StoreBtnMouseClicked

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
            java.util.logging.Logger.getLogger(AdaugareContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdaugareContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdaugareContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdaugareContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdaugareContact().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPhoneBtn;
    private javax.swing.JLabel BikeBtn;
    private javax.swing.JButton DeletePhoneBtn;
    private javax.swing.JButton EditPhoneBtn;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailTA;
    private javax.swing.JLabel EmployeeBtn;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JLabel MenuBtn;
    private javax.swing.JTable PhoneListTb;
    private javax.swing.JLabel PhoneNumberLabel;
    private javax.swing.JTextField PhoneNumberTA;
    private javax.swing.JLabel StoreBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
