package proiect.magazinbiciclete;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Horatiu
 */
public class AdaugareMagazin extends javax.swing.JFrame {

   Statement St = null;
   Connection Con = null;
   ResultSet Rs;
   int PNumber;
   int Key = 0;
   
    public AdaugareMagazin() {
        initComponents();
        ShowItems();
    }
    
    private void CountItems() {
        try {
            St = Con.createStatement();
            Rs = St.executeQuery("select MAX(magazinID) from magazin");
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
            Rs = St.executeQuery("select * from magazin");
            StoreListTb.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        StoreNameLabel = new javax.swing.JLabel();
        StoreNameTA = new javax.swing.JTextField();
        AddressLabel = new javax.swing.JLabel();
        AddressTA = new javax.swing.JTextField();
        OpenDateLabel = new javax.swing.JLabel();
        OpenDateTA = new javax.swing.JTextField();
        AddStoreBtn = new javax.swing.JButton();
        DeleteStoreBtn = new javax.swing.JButton();
        EditStoreBtn = new javax.swing.JButton();
        StoreAddLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StoreListTb = new javax.swing.JTable();
        StoreBtn = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        StoreNameLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        StoreNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        StoreNameLabel.setText("Nume");

        AddressLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        AddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddressLabel.setText("Adresă");

        OpenDateLabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        OpenDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        OpenDateLabel.setText("Dată deschidere");

        AddStoreBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        AddStoreBtn.setText("Adaugă");
        AddStoreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStoreBtnMouseClicked(evt);
            }
        });

        DeleteStoreBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DeleteStoreBtn.setText("Șterge");
        DeleteStoreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteStoreBtnMouseClicked(evt);
            }
        });

        EditStoreBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        EditStoreBtn.setText("Editează");
        EditStoreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditStoreBtnMouseClicked(evt);
            }
        });

        StoreAddLabel.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        StoreAddLabel.setForeground(new java.awt.Color(255, 255, 255));
        StoreAddLabel.setText("Adăugare Magazin");

        StoreListTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        StoreListTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StoreListTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StoreListTb);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(StoreAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(AddStoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(DeleteStoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(StoreNameTA, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(StoreNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddressTA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(OpenDateTA, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(OpenDateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(EditStoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(StoreAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StoreNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpenDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StoreNameTA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressTA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpenDateTA, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AddStoreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(DeleteStoreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditStoreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StoreBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        StoreBtn.setForeground(new java.awt.Color(153, 0, 153));
        StoreBtn.setText("Conectare");
        StoreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StoreBtnMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StoreBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(StoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void StoreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StoreBtnMouseClicked
        // TODO add your handling code here:
        try {
            new ConectareMagazin().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_StoreBtnMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        // TODO add your handling code here:
        try {
            new Magazin().setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void AddStoreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStoreBtnMouseClicked
        // TODO add your handling code here:
        if (StoreNameTA.getText().isEmpty() || AddressTA.getText().isEmpty() || OpenDateTA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
                CountItems();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
                PreparedStatement Pst = Con.prepareStatement("insert into magazin(numeMagazin, adresaMagazin, dataDeschidere) values(?,?,?)");
                Pst.setString(1, StoreNameTA.getText());
                Pst.setString(2, AddressTA.getText());
                Pst.setString(3, OpenDateTA.getText());
                Pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Item adaugat!");
                Con.close();
                ShowItems();
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                System.out.println(e + "");
            }
        }
    }//GEN-LAST:event_AddStoreBtnMouseClicked
    
    
    private void DeleteStoreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteStoreBtnMouseClicked
        // TODO add your handling code here:
        if (StoreNameTA.getText().isEmpty() || AddressTA.getText().isEmpty() || OpenDateTA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
                CountItems();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
                PreparedStatement Pst = Con.prepareStatement("delete from magazin where magazinID = ?");
                Pst.setInt(1, Key);
                Pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Item sters!");
                Con.close();
                ShowItems();
           } catch (HeadlessException | SQLException e) {
                System.out.println(e + "");
            }
        }
    }//GEN-LAST:event_DeleteStoreBtnMouseClicked

    private void EditStoreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditStoreBtnMouseClicked
        // TODO add your handling code here:
        if (StoreNameTA.getText().isEmpty() || AddressTA.getText().isEmpty() || OpenDateTA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
            System.out.println(evt);
        } else {
            try {
                CountItems();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/magazinbiciclete", "root", "HoratiuMySQL2001@");
                PreparedStatement Pst = Con.prepareStatement("update magazin set  numeMagazin=?, adresaMagazin=?, dataDeschidere=? where magazinID=?");
                Pst.setInt(4, Key);
                Pst.setString(1, StoreNameTA.getText());
                Pst.setString(2, AddressTA.getText());
                Pst.setString(3, OpenDateTA.getText());
                Pst.executeUpdate();
                Con.close();
                ShowItems();
                JOptionPane.showMessageDialog(this,  "Item editat!");
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_EditStoreBtnMouseClicked

    private void StoreListTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StoreListTbMouseClicked
        // TODO add your handling code here:
         try {
            DefaultTableModel model = (DefaultTableModel) StoreListTb.getModel();
            int MyIndex = StoreListTb.getSelectedRow();
            Key = Integer.parseInt(model.getValueAt(MyIndex, 0).toString());
            StoreNameTA.setText(model.getValueAt(MyIndex, 1).toString());
            AddressTA.setText(model.getValueAt(MyIndex, 2).toString());
            OpenDateTA.setText(model.getValueAt(MyIndex, 3).toString());
        } catch (NumberFormatException e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_StoreListTbMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdaugareMagazin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       //</editor-fold>
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdaugareMagazin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStoreBtn;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField AddressTA;
    private javax.swing.JButton DeleteStoreBtn;
    private javax.swing.JButton EditStoreBtn;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JLabel OpenDateLabel;
    private javax.swing.JTextField OpenDateTA;
    private javax.swing.JLabel StoreAddLabel;
    private javax.swing.JLabel StoreBtn;
    private javax.swing.JTable StoreListTb;
    private javax.swing.JLabel StoreNameLabel;
    private javax.swing.JTextField StoreNameTA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
