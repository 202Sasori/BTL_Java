/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form_Project;

import java.awt.Color;

/**
 *
 * @author daovi
 */
public class FunctionForm extends javax.swing.JFrame {
    public static LoginForm loginForm = new LoginForm();
    public BookInfor bkInfor = new BookInfor();
    public ReaderForm rd = new ReaderForm();
    public MuonTraForm mtr = new MuonTraForm();
    /**
     * Creates new form FunctionForm
     */
    public FunctionForm() {
        initComponents();
        this.setVisible(false);
        this.setSize(850, 570);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/daynoi.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 140, 40, 250);

        jButton1.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jButton1.setText("S??ch");
        jButton1.setActionCommand("");
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 150, 150, 40);

        jButton2.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jButton2.setText("?????c Gi???");
        jButton2.setActionCommand("");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(150, 220, 150, 40);

        jButton3.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jButton3.setText("M?????n Tr???");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(150, 280, 150, 40);

        jButton5.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jButton5.setText("????ng Xu???t");
        jButton5.setFocusPainted(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(150, 350, 150, 40);

        jLabel4.setFont(new java.awt.Font("Space Mono", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(237, 37, 83));
        jLabel4.setText("INTRODUCE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 90, 150, 20);

        jLabel2.setFont(new java.awt.Font("Space Mono", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 37, 83));
        jLabel2.setText("CH???C N??NG");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 80, 130, 40);

        jLabel7.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel7.setText("+ Tr???n ?????c Ti???n       MSV: 20200781");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 320, 310, 10);

        jLabel8.setFont(new java.awt.Font("Space Mono", 0, 12)); // NOI18N
        jLabel8.setText("Tr?????ng ?????i H???c C??ng Ngh??? ????ng ??");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(470, 180, 280, 22);

        jLabel10.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(237, 37, 83));
        jLabel10.setText("Work Place");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(450, 160, 90, 15);

        jLabel9.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel9.setText("+ ??inh Kh???c Ho???t      MSV: 20200184");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(470, 340, 300, 20);

        jLabel6.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel6.setText("+ ????o Vi???t B???o        MSV: 20200910");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(470, 290, 310, 20);

        jLabel11.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel11.setText("Khoa: C??ng Ngh??? Th??ng Tin");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(470, 210, 190, 15);

        jLabel12.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel12.setText("L???p: CNTT3");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(470, 240, 80, 15);

        jLabel13.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(237, 37, 83));
        jLabel13.setText("Team Member");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(450, 270, 90, 15);

        jLabel14.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(237, 37, 83));
        jLabel14.setText("Contact");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(450, 370, 50, 15);

        jLabel15.setFont(new java.awt.Font("Space Mono", 0, 11)); // NOI18N
        jLabel15.setText("Gmail: 20200184@gmail.com");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(470, 390, 190, 15);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/FunctionForm.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(28, 19, 385, 481);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/FunctionForm.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 20, 410, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        loginForm.setVisible(true);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        loginForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        bkInfor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        rd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mtr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FunctionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FunctionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FunctionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FunctionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FunctionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
