
package proiect.magazinbiciclete;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Horatiu
 */
public class AdaugareBicicleta extends javax.swing.JFrame {
    int storeID;
    Connection Con = null;
    ResultSet Rs = null;
    int PNumber;
    int Key = 0;
    Statement St = null;

    public AdaugareBicicleta() {
        initComponents();
        
    }
    
    public AdaugareBicicleta(int storeID) {
        this.storeID = storeID;
        initComponents();
        ShowItems();
    }
    
    private void CountItems() {
        try {
            St = Con.createStatement();
            Rs = St.executeQuery("select MAX(bicicletaID) from bicicleta");
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
                                 select bicicletaID, magazin.*, producator, model, tip, culoare, pret from
                                 magazinbiciclete.magazin 
                                  join magazinbiciclete.bicicleta
                                 on magazinbiciclete.magazin.magazinID = magazinbiciclete.bicicleta.magazinID
                                 group by magazinbiciclete.bicicleta.bicicletaID
                                 having magazinbiciclete.magazin.magazinID ='""" + this.storeID + "'"
                                 + "order by bicicletaID");
            BikeListTb.setModel(DbUtils.resultSetToTableModel(Rs));
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
        ProducerLabel = new javax.swing.JLabel();
        ProducerTA = new javax.swing.JTextField();
        ModelLabel = new javax.swing.JLabel();
        ModelTA = new javax.swing.JTextField();
        TypeLabel = new javax.swing.JLabel();
        TypeTA = new javax.swing.JTextField();
        ColorLabel = new javax.swing.JLabel();
        ColorTA = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        PriceTA = new javax.swing.JTextField();
        AddBikeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BikeListTb = new javax.swing.JTable();
        DeleteBikeBtn = new javax.swing.JButton();
        EditBikeBtn = new javax.swing.JButton();
        MenuBtn = new javax.swing.JLabel();
        EmpBtn = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JLabel();
        ContactBtn = new javax.swing.JLabel();
        StoreBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Adăugare Bicicletă");

        ProducerLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        ProducerLabel.setForeground(new java.awt.Color(255, 255, 255));
        ProducerLabel.setText("Producător");

        ModelLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        ModelLabel.setForeground(new java.awt.Color(255, 255, 255));
        ModelLabel.setText("Model");

        TypeLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        TypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TypeLabel.setText("Tip");

        ColorLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        ColorLabel.setForeground(new java.awt.Color(255, 255, 255));
        ColorLabel.setText("Culoare");

        ColorTA.setPreferredSize(new java.awt.Dimension(64, 33));

        PriceLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        PriceLabel.setText("Preț");

        PriceTA.setPreferredSize(new java.awt.Dimension(64, 33));

        AddBikeBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        AddBikeBtn.setText("Adaugă");
        AddBikeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBikeBtnMouseClicked(evt);
            }
        });

        BikeListTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        BikeListTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BikeListTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BikeListTb);

        DeleteBikeBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DeleteBikeBtn.setText("Șterge");
        DeleteBikeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBikeBtnMouseClicked(evt);
            }
        });

        EditBikeBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        EditBikeBtn.setText("Editează");
        EditBikeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBikeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ProducerTA)
                            .addComponent(ProducerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ModelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ModelTA, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(TypeTA)
                            .addComponent(ColorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ColorTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PriceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PriceTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(AddBikeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteBikeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(EditBikeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(ProducerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ProducerTA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ModelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ModelTA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TypeTA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ColorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ColorTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PriceTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBikeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBikeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(EditBikeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        MenuBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        MenuBtn.setForeground(new java.awt.Color(153, 0, 153));
        MenuBtn.setText("Meniu");
        MenuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBtnMouseClicked(evt);
            }
        });

        EmpBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        EmpBtn.setForeground(new java.awt.Color(153, 0, 153));
        EmpBtn.setText("Angajați");
        EmpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpBtnMouseClicked(evt);
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

        ContactBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        ContactBtn.setForeground(new java.awt.Color(153, 0, 153));
        ContactBtn.setText("Contact");
        ContactBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactBtnMouseClicked(evt);
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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(MenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContactBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(StoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ContactBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void MenuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBtnMouseClicked
        // TODO add your handling code here:
        try {
            new AngajatiSiBicicleteSiContact(this.storeID).setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_MenuBtnMouseClicked

    private void EmpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpBtnMouseClicked
        // TODO add your handling code here:
         try {
            new InregistrareAngajat(this.storeID).setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_EmpBtnMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        // TODO add your handling code here:
         try {
            new Magazin().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void AddBikeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBikeBtnMouseClicked
        // TODO add your handling code here:
        if (PriceTA.getText().isEmpty() || ProducerTA.getText().isEmpty() || ModelTA.getText().isEmpty() || TypeLabel.getText().isEmpty() || ColorTA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
                CountItems();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
                PreparedStatement Pst = Con.prepareStatement("insert into bicicleta(magazinID, producator, model, tip, culoare, pret) "
                        + "values(?,?,?,?,?,?)");
                Pst.setInt(1, this.storeID);
                Pst.setString(2, ProducerTA.getText());
                Pst.setString(3, ModelTA.getText());
                Pst.setString(4, TypeTA.getText());
                Pst.setString(5, ColorTA.getText());
                Pst.setDouble(6, Double.parseDouble(PriceTA.getText()));
                Pst.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Item adaugat!");
                Con.close();
                ShowItems();
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                System.out.println(e + "");
            }
        }
    }//GEN-LAST:event_AddBikeBtnMouseClicked

    private void DeleteBikeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBikeBtnMouseClicked
        // TODO add your handling code here:
        if (PriceTA.getText().isEmpty() || ProducerTA.getText().isEmpty() || ModelTA.getText().isEmpty() || TypeLabel.getText().isEmpty() || ColorTA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
                CountItems();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
                PreparedStatement Pst = Con.prepareStatement("delete from bicicleta where bicicletaID = ?");
                Pst.setInt(1, Key);
                Pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Item sters!");
                Con.close();
                ShowItems();
           } catch (HeadlessException | SQLException e) {
                System.out.println(e + "");
            }
        }
    }//GEN-LAST:event_DeleteBikeBtnMouseClicked

    private void EditBikeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBikeBtnMouseClicked
        // TODO add your handling code here:
        if (PriceTA.getText().isEmpty() || ProducerTA.getText().isEmpty() || ModelTA.getText().isEmpty() || TypeLabel.getText().isEmpty() || ColorTA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
                CountItems();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
                PreparedStatement Pst = Con.prepareStatement("update bicicleta set  producator=?, model=?, tip=?, culoare=?, pret=? where bicicletaID=?");
                Pst.setInt(6, Key);
                Pst.setString(1, ProducerTA.getText());
                Pst.setString(2, ModelTA.getText());
                Pst.setString(3, TypeTA.getText());
                Pst.setString(4, ColorTA.getText());
                Pst.setDouble(5, Double.parseDouble(PriceTA.getText()));
                Pst.executeUpdate();
                Con.close();
                ShowItems();
                JOptionPane.showMessageDialog(this,  "Item editat!");
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_EditBikeBtnMouseClicked

    private void BikeListTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BikeListTbMouseClicked
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) BikeListTb.getModel();
            int MyIndex = BikeListTb.getSelectedRow();
            Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
            ProducerTA.setText(model.getValueAt(MyIndex, 5).toString());
            ModelTA.setText(model.getValueAt(MyIndex, 6).toString());
            TypeTA.setText(model.getValueAt(MyIndex, 7).toString());
            ColorTA.setText(model.getValueAt(MyIndex, 8).toString());
            PriceTA.setText(model.getValueAt(MyIndex, 9).toString());
        } catch (NumberFormatException e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_BikeListTbMouseClicked

    private void ContactBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactBtnMouseClicked
        // TODO add your handling code here:
        try {
            new AdaugareContact(this.storeID).setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_ContactBtnMouseClicked

    private void StoreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StoreBtnMouseClicked
        // TODO add your handling code here:
        try {
            new ConectareMagazin();
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
            java.util.logging.Logger.getLogger(AdaugareBicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdaugareBicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdaugareBicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdaugareBicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdaugareBicicleta().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBikeBtn;
    private javax.swing.JTable BikeListTb;
    private javax.swing.JLabel ColorLabel;
    private javax.swing.JTextField ColorTA;
    private javax.swing.JLabel ContactBtn;
    private javax.swing.JButton DeleteBikeBtn;
    private javax.swing.JButton EditBikeBtn;
    private javax.swing.JLabel EmpBtn;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JLabel MenuBtn;
    private javax.swing.JLabel ModelLabel;
    private javax.swing.JTextField ModelTA;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JTextField PriceTA;
    private javax.swing.JLabel ProducerLabel;
    private javax.swing.JTextField ProducerTA;
    private javax.swing.JLabel StoreBtn;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JTextField TypeTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private double Double(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setStoreID(int storeID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
