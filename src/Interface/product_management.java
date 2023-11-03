/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import database.connect;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class product_management extends javax.swing.JFrame {
    private DefaultTableModel menuList;
    database.connect DB = new database.connect();
    private String SQL;
    Connection con;
    Statement stat;
    public ResultSet rs;
    
    //menampilkan data menu didalam jtable
    public void showMenuList(){
        menuList = new DefaultTableModel();
        menuList.addColumn("Id");
        menuList.addColumn("Produk");
        menuList.addColumn("Harga");
        menuList.addColumn("Stok");
        
        jTable_menu.setModel(menuList);
        DB.config();
        con=DB.con;
        stat=DB.stm;
        menuList.getDataVector().removeAllElements();
        try {
            java.sql.Statement stmt = con.createStatement();
            SQL = "SELECT * FROM products";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()){
                menuList.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("product"),
                    res.getString("price"),
                    res.getString("stock")
                });
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }
    
    public product_management() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.showMenuList();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_product = new javax.swing.JTextField();
        jTextField_price = new javax.swing.JTextField();
        jTextField_stock = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_menu = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextSearch = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_code = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton_back_to_dashboard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("WELCOME TO");

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("CAFELINE");

        jLabel3.setForeground(new java.awt.Color(255, 204, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/java.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)))
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 0));
        jLabel7.setText("DAFTAR PRODUK");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 0));
        jLabel5.setText("Harga Produk");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 0));
        jLabel8.setText("Stok Produk");

        jTextField_product.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_productActionPerformed(evt);
            }
        });

        jTextField_price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_priceActionPerformed(evt);
            }
        });

        jTextField_stock.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_stockActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 102, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 204, 153));
        jButton2.setLabel("HAPUS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 102, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 204, 153));
        jButton4.setLabel("UBAH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable_menu.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jTable_menu.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_menuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_menu);

        jLabel9.setBackground(new java.awt.Color(153, 102, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 0));
        jLabel9.setText("MANAJEMEN PRODUK");

        jTextSearch.setToolTipText("");
        jTextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchActionPerformed(evt);
            }
        });
        jTextSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextSearchKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 0));
        jLabel10.setText("Nama Produk");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 0));
        jLabel4.setText("Cari Produk");

        jTextField_code.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_codeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 0));
        jLabel11.setText("Kode Produk");

        jButton1.setBackground(new java.awt.Color(204, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 204, 153));
        jButton1.setText("TAMBAH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Cari berdasarkan kode produk atau nama produk");

        jButton_back_to_dashboard.setBackground(new java.awt.Color(255, 204, 153));
        jButton_back_to_dashboard.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_back_to_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N
        jButton_back_to_dashboard.setText("Kembali");
        jButton_back_to_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_back_to_dashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(416, 416, 416))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextSearch)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextField_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField_product, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(159, 159, 159)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_code, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton_back_to_dashboard)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_back_to_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_product, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jTextField_code, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        jLabel12.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_codeActionPerformed

    private void jTextSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSearchKeyReleased
        // TODO add your handling code here:
        String key = jTextSearch.getText();
        if (!"".equals(key)) {
            searchMenu(key);
        } else {
            showMenuList();
        }
    }//GEN-LAST:event_jTextSearchKeyReleased

    private void jTextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchActionPerformed
        JTextField search = new JTextField();
//        search.setForeground(Color.GRAY);
        search.setText("Masukkan teks di sini");
    }//GEN-LAST:event_jTextSearchActionPerformed

   //mengambil satu data menu dari tabel
    private void jTable_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_menuMouseClicked
        int row = jTable_menu.getSelectedRow();
        jTextField_code.setText(menuList.getValueAt(row, 0).toString());
        jTextField_product.setText(menuList.getValueAt(row, 1).toString());
        jTextField_price.setText(menuList.getValueAt(row, 2).toString());
        jTextField_stock.setText(menuList.getValueAt(row, 3).toString());
    }//GEN-LAST:event_jTable_menuMouseClicked

    //mengupdate menu 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            java.sql.Statement stmt = con.createStatement();
            String value0 = jTextField_code.getText();
            String value1=jTextField_product.getText();
            String value2=jTextField_price.getText();
            String value3=jTextField_stock.getText();
            int row = jTable_menu.getSelectedRow();

            String edit= "UPDATE `products` SET id='"+value0+"',product='"+value1+"',price='"+value2+"',stock='"+value3+"' WHERE id='"+menuList.getValueAt(row, 0)+"'";
            PreparedStatement stm = con.prepareStatement(edit);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil mengubah produk");
            showMenuList();
            jTextField_code.setText("");
            jTextField_product.setText("");
            jTextField_price.setText("");
            jTextField_stock.setText("");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Pilih produk terlebih dahulu");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //menghapus menu dari tabel
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        database.connect DB = new database.connect();
        String product = jTextField_code.getText();
        if(product.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pilih produk terlebih dahulu");
        } else {
            int confirm = JOptionPane.showConfirmDialog(null,"Hapus Data?","Konfirmasi", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    java.sql.PreparedStatement stm=con.prepareStatement("DELETE FROM products WHERE product='"+jTextField_product.getText()+"'");
                    stm.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Data deleted");
                    showMenuList();
                    jTextField_code.setText("");
                    jTextField_product.setText("");
                    jTextField_price.setText("");
                    jTextField_stock.setText("");
                } catch(SQLException e) {
                    JOptionPane.showMessageDialog(null, "Gagal" +e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_stockActionPerformed

    private void jTextField_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_priceActionPerformed

    private void jTextField_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_productActionPerformed

    }//GEN-LAST:event_jTextField_productActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            database.connect DB = new database.connect();
            DB.config();
            con=DB.con;
            stat=DB.stm;
            String q = "INSERT INTO products (id,product,price,stock) VALUES ('"+jTextField_code.getText()+"','"+jTextField_product.getText()+"','"+jTextField_price.getText()+"','"+jTextField_stock.getText()+"')";
            java.sql.PreparedStatement stat = con.prepareStatement(q);
            stat.execute();
            JOptionPane.showMessageDialog(null, "Berhasil menambahkan produk");
            showMenuList();
            jTextField_code.setText("");
            jTextField_product.setText("");
            jTextField_price.setText("");
            jTextField_stock.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Masukkan data terlebih dahulu");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_back_to_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_back_to_dashboardActionPerformed
        dashboard start = new dashboard();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_back_to_dashboardActionPerformed
    //mencari data menu
    private void searchMenu(String key) {
        try {
            menuList = new DefaultTableModel();
            menuList.addColumn("Id");
            menuList.addColumn("Product");
            menuList.addColumn("Price");
            menuList.addColumn("Stock");
            
            jTable_menu.setModel(menuList);
            database.connect DB = new database.connect();
            DB.config();
            con=DB.con;
            stat=DB.stm;
            menuList.getDataVector().removeAllElements();
            
            java.sql.Statement stmt = con.createStatement();
            SQL = "SELECT * FROM products WHERE id LIKE '%"+key+"%' OR product LIKE '%"+key+"%' OR price LIKE '%"+key+"%'";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()){
                menuList.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("product"),
                    res.getString("price"),
                    res.getString("stock")
                });
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Failed");
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
            java.util.logging.Logger.getLogger(product_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product_management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_back_to_dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_menu;
    private javax.swing.JTextField jTextField_code;
    private javax.swing.JTextField jTextField_price;
    private javax.swing.JTextField jTextField_product;
    private javax.swing.JTextField jTextField_stock;
    private javax.swing.JTextField jTextSearch;
    // End of variables declaration//GEN-END:variables
}
