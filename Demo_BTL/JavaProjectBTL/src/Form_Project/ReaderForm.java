/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_Project;


import Ban_Doc.Ban_Doc;
import Ban_Doc.Functions;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class ReaderForm extends javax.swing.JFrame {
    public static FunctionForm fc = new FunctionForm();
    DefaultTableModel tableBD;
    List<Ban_Doc> BD = new ArrayList<>();
    
    public ReaderForm() {
        initComponents();
        tableBD = (DefaultTableModel) tabBanDoc.getModel();
        showBD();
        showDuLieuBanDoc();
        this.setVisible(false);
        this.setSize(800, 830);
        this.setLocationRelativeTo(null);
    }

    // Hiển thị dữ liệu bạn đọc trong thư viện
    public void showBD(){
        BD = Functions.showBanDoc();
        tableBD.setRowCount(0);;
        for(Ban_Doc bd : BD){
            tableBD.addRow(new Object[]{bd.getMaBD(),bd.getTenBD(),bd.getSDT(),bd.getDiaChiBD(),bd.getGioiTinh(),bd.getSachMuon()});
        }
    }
    public void showDuLieuBanDoc(){
        try {
           tabBanDoc.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
               @Override
               public void valueChanged(ListSelectionEvent e) {
                    if (tabBanDoc.getSelectedRow() >= 0) {
                        txtMaBD.setText(tabBanDoc.getValueAt(tabBanDoc.getSelectedRow(), 0) + "");
                        txtTenBD.setText(tabBanDoc.getValueAt(tabBanDoc.getSelectedRow(), 1) + "");
                        txtSDT.setText(tabBanDoc.getValueAt(tabBanDoc.getSelectedRow(), 2) + "");
                        txtDiaChi.setText(tabBanDoc.getValueAt(tabBanDoc.getSelectedRow(), 3) + "");
                        txtGioiTinh.setText(tabBanDoc.getValueAt(tabBanDoc.getSelectedRow(), 4) + "");
                        txtSachMuon.setText(tabBanDoc.getValueAt(tabBanDoc.getSelectedRow(), 5) + "");
                    }
               }
           }); 
        } catch (Exception e) {
             System.out.println(e.toString());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        txtMaBD = new javax.swing.JTextField();
        txtTenBD = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        txtSachMuon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabBanDoc = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/RedLine.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(2, 42, 6, 50);

        jLabel2.setFont(new java.awt.Font("Space Mono", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 37, 83));
        jLabel2.setText("THÔNG TIN ĐỌC GIẢ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(26, 50, 250, 30);

        jLabel4.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel4.setText("Mã Đọc Giả");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 190, 80, 15);

        jLabel5.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel5.setText("Tên Đọc Giả");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 250, 80, 15);

        jLabel7.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel7.setText("Quê Quán");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(330, 190, 80, 15);

        jLabel8.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel8.setText("Giới Tính");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(330, 250, 90, 15);

        jLabel9.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel9.setText("Sách Mượn");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(330, 320, 110, 15);

        jLabel10.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel10.setText("Điện Thoại");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(100, 320, 80, 15);

        jTextField8.setBorder(null);
        jTextField8.setFocusable(false);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(240, 170, 20, 240);

        jTextField9.setBorder(null);
        jTextField9.setFocusable(false);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(470, 200, 20, 170);

        txtMaBD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        txtMaBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaBDActionPerformed(evt);
            }
        });
        jPanel1.add(txtMaBD);
        txtMaBD.setBounds(100, 210, 150, 30);

        txtTenBD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtTenBD);
        txtTenBD.setBounds(100, 280, 150, 30);

        txtSDT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtSDT);
        txtSDT.setBounds(100, 340, 150, 30);

        txtDiaChi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtDiaChi);
        txtDiaChi.setBounds(330, 210, 150, 30);

        txtGioiTinh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtGioiTinh);
        txtGioiTinh.setBounds(330, 280, 150, 30);

        txtSachMuon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtSachMuon);
        txtSachMuon.setBounds(330, 340, 150, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/BookForm.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 120, 455, 330);

        btnThem.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setFocusPainted(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem);
        btnThem.setBounds(600, 170, 90, 30);

        btnXoa.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setFocusPainted(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa);
        btnXoa.setBounds(600, 220, 90, 30);

        btnSua.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setFocusPainted(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua);
        btnSua.setBounds(600, 270, 90, 30);

        btnThoat.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setFocusPainted(false);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btnThoat);
        btnThoat.setBounds(600, 370, 90, 30);

        btnThemMoi.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        btnThemMoi.setText("Thêm Mới");
        btnThemMoi.setFocusPainted(false);
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnThemMoi);
        btnThemMoi.setBounds(600, 320, 90, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/functionEvent.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(560, 140, 180, 290);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabBanDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã bạn đọc", "Tên bạn đọc", "SDT", "Địa chỉ", "Giới tính", "Sách mượn"
            }
        ));
        jScrollPane1.setViewportView(tabBanDoc);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 520, 680, 220);

        jLabel12.setFont(new java.awt.Font("Space Mono", 0, 14)); // NOI18N
        jLabel12.setText("Tìm Kiếm:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(60, 460, 80, 30);
        jPanel1.add(txtTimKiem);
        txtTimKiem.setBounds(150, 460, 260, 30);

        btnTimKiem.setText("Search");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel1.add(btnTimKiem);
        btnTimKiem.setBounds(440, 460, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaBDActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
                fc.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        txtMaBD.setText("");
        txtTenBD.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        txtGioiTinh.setText("");
        txtSachMuon.setText("");
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
       int ch = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
       if (ch != JOptionPane.YES_OPTION){
           return;
       }
       String maBD = txtMaBD.getText();
       String tenBD = txtTenBD.getText();
       String SDT = txtSDT.getText();
       String diaChi = txtDiaChi.getText();
       String gioiTinh = txtGioiTinh.getText();
       String sachMuon = txtSachMuon.getText();
       Ban_Doc bd = new Functions(maBD, tenBD, SDT, diaChi, gioiTinh, sachMuon);
       Functions.insertBD(bd);
       showBD();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       int ch = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
       if (ch != JOptionPane.YES_OPTION){
           return;
       }
       String maBD = txtMaBD.getText();
       String tenBD = txtTenBD.getText();
       String SDT = txtSDT.getText();
       String diaChi = txtDiaChi.getText();
       String gioiTinh = txtGioiTinh.getText();
       String sachMuon = txtSachMuon.getText();
       Ban_Doc bd = new Functions(maBD, tenBD, SDT, diaChi, gioiTinh, sachMuon);
       Functions.updateBD(bd);
       showBD();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int select = tabBanDoc.getSelectedRow();
        if (select >= 0){
            Ban_Doc bd = BD.get(select);
            int xoa = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?","Xác nhận", JOptionPane.YES_NO_OPTION);
            if (xoa == 0){
                Functions.deleteBD(bd.getMaBD());
                JOptionPane.showMessageDialog(this, "Đã xóa");
                showBD();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String search = txtTimKiem.getText();
        if(search.length() > 0){
            BD = Functions.searchBD(search);
            tableBD.setRowCount(0);
            for(Ban_Doc bd : BD){
              tableBD.addRow(new Object[]{bd.getMaBD(),bd.getTenBD(),bd.getSDT(),bd.getDiaChiBD(),bd.getGioiTinh(),bd.getSachMuon()});
            }
        }else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã bạn đọc tìm kiếm");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(ReaderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReaderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReaderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReaderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReaderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tabBanDoc;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtMaBD;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSachMuon;
    private javax.swing.JTextField txtTenBD;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
