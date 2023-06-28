package proiect.magazinbiciclete;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Horatiu
 */
public class InregistrareAngajat extends javax.swing.JFrame {
    int storeID;
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    int Key = 0;
    int PNumber;
    
   
    public InregistrareAngajat() {
        initComponents();
        ShowItems();
    }
    
    public InregistrareAngajat(int storeID) {
        this.storeID = storeID;
        initComponents();
        ShowItems();
    }
    
    private void CountItems() {
        try {
            St = Con.createStatement();
            Rs = St.executeQuery("select MAX(angajatID) from angajat");
            Rs.next();
            PNumber = Rs.getInt(1) + 1;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void ShowItems() {
        try {
            System.out.println(this.storeID);
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
            St = Con.createStatement();
            Rs = St.executeQuery("""
                                 select angajatID, magazin.*, nume, prenume, varsta, username, parola 
                                 from magazinbiciclete.angajat
                                 join magazinbiciclete.magazin on
                                 magazinbiciclete.angajat.magazinID = magazinbiciclete.magazin.magazinID
                                 having magazinID ='""" + this.storeID +"'"
                                 + "order by angajatID");
            EmployeeListTb.setModel(DbUtils.resultSetToTableModel(Rs));
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
        FirstNameLabel = new javax.swing.JLabel();
        FirstNameTA = new javax.swing.JTextField();
        SecondNameLabel = new javax.swing.JLabel();
        SecondNameTA = new javax.swing.JTextField();
        AgeLabel = new javax.swing.JLabel();
        AgeTA = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        UsernameTA = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        AddEmpBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeListTb = new javax.swing.JTable();
        DeleteEmpBtn = new javax.swing.JButton();
        EditEmpBtn = new javax.swing.JButton();
        PasswordTA = new javax.swing.JPasswordField();
        GoToMenuBtn = new javax.swing.JLabel();
        PhoneBtn = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JLabel();
        BikeBtn = new javax.swing.JLabel();
        GoToStoreBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Adăugare Angajat");

        FirstNameLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        FirstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        FirstNameLabel.setText("Nume");

        SecondNameLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        SecondNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        SecondNameLabel.setText("Prenume");

        AgeLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        AgeLabel.setForeground(new java.awt.Color(255, 255, 255));
        AgeLabel.setText("Vârstă");

        UsernameLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setText("Utilizator");

        UsernameTA.setPreferredSize(new java.awt.Dimension(64, 33));

        PasswordLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Parolă");

        AddEmpBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        AddEmpBtn.setText("Adaugă");
        AddEmpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddEmpBtnMouseClicked(evt);
            }
        });

        EmployeeListTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        EmployeeListTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeListTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeListTb);

        DeleteEmpBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DeleteEmpBtn.setText("Șterge");
        DeleteEmpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteEmpBtnMouseClicked(evt);
            }
        });

        EditEmpBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        EditEmpBtn.setText("Editează");
        EditEmpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditEmpBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(AddEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(EditEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PasswordTA)
                            .addComponent(UsernameTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FirstNameTA)
                            .addComponent(FirstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SecondNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SecondNameTA, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AgeTA)
                            .addComponent(UsernameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(FirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(FirstNameTA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SecondNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SecondNameTA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgeTA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsernameTA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PasswordTA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(EditEmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        GoToMenuBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        GoToMenuBtn.setForeground(new java.awt.Color(153, 0, 153));
        GoToMenuBtn.setText("Meniu");
        GoToMenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToMenuBtnMouseClicked(evt);
            }
        });

        PhoneBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        PhoneBtn.setForeground(new java.awt.Color(153, 0, 153));
        PhoneBtn.setText("Contact");
        PhoneBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhoneBtnMouseClicked(evt);
            }
        });

        LogoutBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(153, 0, 153));
        LogoutBtn.setText("Deconectare");
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
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

        GoToStoreBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        GoToStoreBtn.setForeground(new java.awt.Color(153, 0, 153));
        GoToStoreBtn.setText("Magazin");
        GoToStoreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToStoreBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(GoToMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PhoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BikeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(GoToStoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(GoToStoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GoToMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(BikeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PhoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoToMenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToMenuBtnMouseClicked
        // TODO add your handling code here:
        try {
            new AngajatiSiBicicleteSiContact(this.storeID).setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_GoToMenuBtnMouseClicked

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

    private void PhoneBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhoneBtnMouseClicked
        // TODO add your handling code here:
        try {
            new AdaugareContact(this.storeID).setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_PhoneBtnMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        // TODO add your handling code here:
        try {
            new Magazin().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void AddEmpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddEmpBtnMouseClicked
        // TODO add your handling code here:
        if (FirstNameTA.getText().isEmpty() || SecondNameTA.getText().isEmpty() || AgeTA.getText().isEmpty() || UsernameTA.getText().isEmpty() || PasswordTA.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
                CountItems();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
                PreparedStatement Pst = Con.prepareStatement("insert into angajat(magazinID, nume, prenume, varsta, username, parola, dataAngajare) values(?,?,?,?,?,?,?)");
                Pst.setInt(1, this.storeID);
                Pst.setString(2, FirstNameTA.getText());
                Pst.setString(3, SecondNameTA.getText());
                Pst.setInt(4, Integer.parseInt(AgeTA.getText()));
                Pst.setString(5, UsernameTA.getText());
                Pst.setString(6, Arrays.toString(PasswordTA.getPassword()));
                DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDateTime now = LocalDateTime.now();
                Pst.setString(7, now.toString().substring(1,10));
                Pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Item adaugat!");
                Con.close();
                ShowItems();
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                System.out.println(e + "");
            }
        }
    }//GEN-LAST:event_AddEmpBtnMouseClicked

    private void DeleteEmpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteEmpBtnMouseClicked
        // TODO add your handling code here:
        if (FirstNameTA.getText().isEmpty() || SecondNameTA.getText().isEmpty() || AgeTA.getText().isEmpty() || UsernameTA.getText().isEmpty() || PasswordTA.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
                CountItems();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
                PreparedStatement Pst = Con.prepareStatement("delete from angajat where angajatID = ?");
                Pst.setInt(1, Key);
                Pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Item sters!");
                Con.close();
                ShowItems();
           } catch (HeadlessException | SQLException e) {
                System.out.println(e + "");
            }
        }
    }//GEN-LAST:event_DeleteEmpBtnMouseClicked

    private void EditEmpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditEmpBtnMouseClicked
        // TODO add your handling code here:
        if (FirstNameTA.getText().isEmpty() || SecondNameTA.getText().isEmpty() || AgeTA.getText().isEmpty() || UsernameTA.getText().isEmpty() || PasswordTA.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
                CountItems();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
                PreparedStatement Pst = Con.prepareStatement("update angajat set  nume=?, prenume=?, varsta=?, username=?, parola=? where angajatID=?");
                Pst.setInt(6, Key);
                Pst.setString(1, FirstNameTA.getText());
                Pst.setString(2, SecondNameTA.getText());
                Pst.setInt(3, Integer.parseInt(AgeTA.getText()));
                Pst.setString(4, UsernameTA.getText());
                Pst.setString(5, Arrays.toString(PasswordTA.getPassword()));
                Pst.executeUpdate();
                Con.close();
                ShowItems();
                JOptionPane.showMessageDialog(this,  "Item editat!");
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_EditEmpBtnMouseClicked

    private void EmployeeListTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeListTbMouseClicked
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) EmployeeListTb.getModel();
            int MyIndex = EmployeeListTb.getSelectedRow();
            Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
            FirstNameTA.setText(model.getValueAt(MyIndex, 5).toString());
            SecondNameTA.setText(model.getValueAt(MyIndex, 6).toString());
            AgeTA.setText(model.getValueAt(MyIndex, 7).toString());
            UsernameTA.setText(model.getValueAt(MyIndex, 8).toString());
            
        } catch (NumberFormatException e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_EmployeeListTbMouseClicked

    private void GoToStoreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToStoreBtnMouseClicked
        // TODO add your handling code here:
         try {
            new ConectareMagazin().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_GoToStoreBtnMouseClicked

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
            java.util.logging.Logger.getLogger(InregistrareAngajat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InregistrareAngajat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InregistrareAngajat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InregistrareAngajat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InregistrareAngajat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmpBtn;
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField AgeTA;
    private javax.swing.JLabel BikeBtn;
    private javax.swing.JButton DeleteEmpBtn;
    private javax.swing.JButton EditEmpBtn;
    private javax.swing.JTable EmployeeListTb;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameTA;
    private javax.swing.JLabel GoToMenuBtn;
    private javax.swing.JLabel GoToStoreBtn;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordTA;
    private javax.swing.JLabel PhoneBtn;
    private javax.swing.JLabel SecondNameLabel;
    private javax.swing.JTextField SecondNameTA;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
