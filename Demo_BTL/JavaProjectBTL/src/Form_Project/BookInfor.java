/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_Project;

import Sach_Thu_Vien.Functions_Sach;
import Sach_Thu_Vien.Sach;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daovi
 */
public class BookInfor extends javax.swing.JFrame {
    public static FunctionForm fc = new FunctionForm();
    DefaultTableModel tableSach;
    List<Sach> Sach = new ArrayList<>();
    public BookInfor() {
        initComponents();
        tableSach = (DefaultTableModel) tabSach.getModel();
        showDuLieuSach();
        showSach();
        this.setVisible(false);
        this.setSize(800, 830);
        this.setLocationRelativeTo(null);
    }

    //Hiển thị toàn bộ thông tin sách trong thư viện
    public void showSach(){
        Sach = Functions_Sach.showAllSach();
        tableSach.setRowCount(0);
        for(Sach sach: Sach){
            tableSach.addRow(new Object[]{sach.getMaSach(),sach.getTenSach(),sach.getGiaSach(),sach.getKeSo(),sach.getTheLoai(),sach.getNhaXuatBan(),sach.getNamXuatBan()});
        }
    }
    public void showDuLieuSach(){
        try {
           tabSach.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
               @Override
               public void valueChanged(ListSelectionEvent e) {
                    if (tabSach.getSelectedRow() >= 0) {
                        txtMaSach.setText(tabSach.getValueAt(tabSach.getSelectedRow(), 0) + "");
                        txtTenSach.setText(tabSach.getValueAt(tabSach.getSelectedRow(), 1) + "");
                        txtGiaSach.setText(tabSach.getValueAt(tabSach.getSelectedRow(), 2) + "");
                        txtKeSo.setText(tabSach.getValueAt(tabSach.getSelectedRow(), 3) + "");
                        txtTheLoai.setText(tabSach.getValueAt(tabSach.getSelectedRow(), 4) + "");
                        txtNhaXB.setText(tabSach.getValueAt(tabSach.getSelectedRow(), 5) + "");
                        txtNamXB.setText(tabSach.getValueAt(tabSach.getSelectedRow(), 6) + "");
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        txtMaSach = new javax.swing.JTextField();
        txtTenSach = new javax.swing.JTextField();
        txtGiaSach = new javax.swing.JTextField();
        txtKeSo = new javax.swing.JTextField();
        txtTheLoai = new javax.swing.JTextField();
        txtNhaXB = new javax.swing.JTextField();
        txtNamXB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabSach = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/RedLine.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(2, 42, 6, 50);

        jLabel2.setFont(new java.awt.Font("Space Mono", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 37, 83));
        jLabel2.setText("THÔNG TIN SÁCH");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(26, 50, 230, 30);

        jLabel4.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel4.setText("Mã Sách");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 160, 80, 15);

        jLabel5.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel5.setText("Tên Sách");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 220, 80, 15);

        jLabel6.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel6.setText("Kệ Số");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 350, 70, 20);

        jLabel7.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel7.setText("Thể Loại");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(330, 160, 80, 15);

        jLabel8.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel8.setText("Nhà Xuất Bản");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(330, 220, 90, 15);

        jLabel9.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel9.setText("Năm Xuất Bản");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(330, 290, 110, 15);

        jLabel10.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel10.setText("Giá Sách");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(100, 290, 80, 15);

        jTextField8.setBorder(null);
        jTextField8.setFocusable(false);
        jPanel1.add(jTextField8);
        jTextField8.setBounds(240, 170, 20, 240);

        jTextField9.setBorder(null);
        jTextField9.setFocusable(false);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(470, 180, 20, 170);

        txtMaSach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        txtMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSachActionPerformed(evt);
            }
        });
        jPanel1.add(txtMaSach);
        txtMaSach.setBounds(100, 180, 150, 30);

        txtTenSach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtTenSach);
        txtTenSach.setBounds(100, 250, 150, 30);

        txtGiaSach.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtGiaSach);
        txtGiaSach.setBounds(100, 310, 150, 30);

        txtKeSo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtKeSo);
        txtKeSo.setBounds(100, 370, 150, 30);

        txtTheLoai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtTheLoai);
        txtTheLoai.setBounds(330, 180, 150, 30);

        txtNhaXB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtNhaXB);
        txtNhaXB.setBounds(330, 250, 150, 30);

        txtNamXB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel1.add(txtNamXB);
        txtNamXB.setBounds(330, 310, 150, 30);

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

        tabSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Giá sách", "Kệ số", "Thể loại", "Nhà xuất bản", "Năm xuất bản"
            }
        ));
        jScrollPane1.setViewportView(tabSach);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSachActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        fc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
       txtMaSach.setText("");
       txtTenSach.setText("");
       txtGiaSach.setText("");
       txtKeSo.setText("");
       txtTheLoai.setText("");
       txtNhaXB.setText("");
       txtNamXB.setText("");
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        int ch = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (ch != JOptionPane.YES_OPTION){
            return;
        }
        String maSach = txtMaSach.getText();
        String tenSach = txtTenSach.getText();
        int giaSach = Integer.parseInt(txtGiaSach.getText());
        String keSo = txtKeSo.getText();
        String theLoai = txtTheLoai.getText();
        String nhaXB = txtNhaXB.getText();
        int namXB = Integer.parseInt(txtNamXB.getText());
        Sach sach = new Functions_Sach(maSach,tenSach,giaSach,keSo,theLoai,nhaXB,namXB);
        Functions_Sach.insertSach(sach);
        showSach();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int select = tabSach.getSelectedRow();
        if (select >= 0){
            Sach sach = Sach.get(select);
            int xoa = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?","Xác nhận", JOptionPane.YES_NO_OPTION);
            if (xoa == 0){
                Functions_Sach.deleteSach(sach.getMaSach());
                JOptionPane.showMessageDialog(this, "Đã xóa");
                showSach();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       int ch = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (ch != JOptionPane.YES_OPTION){
            return;
        }
        String maSach = txtMaSach.getText();
        String tenSach = txtTenSach.getText();
        int giaSach = Integer.parseInt(txtGiaSach.getText());
        String keSo = txtKeSo.getText();
        String theLoai = txtTheLoai.getText();
        String nhaXB = txtNhaXB.getText();
        int namXB = Integer.parseInt(txtNamXB.getText());
        Sach sach = new Functions_Sach(maSach,tenSach,giaSach,keSo,theLoai,nhaXB,namXB);
        Functions_Sach.updateSach(sach);
        showSach();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String search = txtTimKiem.getText();
        if(search.length() > 0){
            Sach = Functions_Sach.searchSach(search);
            tableSach.setRowCount(0);
            for(Sach sach : Sach){
              tableSach.addRow(new Object[]{sach.getMaSach(),sach.getTenSach(),sach.getGiaSach(),sach.getKeSo(),sach.getTheLoai(),sach.getNhaXuatBan(),sach.getNamXuatBan()});
            }
        }else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã sách tìm kiếm");
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
            java.util.logging.Logger.getLogger(BookInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookInfor().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tabSach;
    private javax.swing.JTextField txtGiaSach;
    private javax.swing.JTextField txtKeSo;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNamXB;
    private javax.swing.JTextField txtNhaXB;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTheLoai;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
