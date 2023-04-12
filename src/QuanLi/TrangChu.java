/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLi;

import Admin.Login;
import TaiKhoan.TaikhoanNV;
import java.awt.Frame;
/**
 *
 * @author Administrator
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNhanvien = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang chủ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNhanvien.setBackground(new java.awt.Color(255, 204, 255));
        btnNhanvien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnNhanvien.setForeground(new java.awt.Color(51, 51, 51));
        btnNhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User_16x16.png"))); // NOI18N
        btnNhanvien.setText("Nhân viên");
        btnNhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanvienActionPerformed(evt);
            }
        });
        getContentPane().add(btnNhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 260, 40));

        btnAdmin.setBackground(new java.awt.Color(255, 204, 255));
        btnAdmin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(51, 51, 51));
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User_16x16.png"))); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 260, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("CÔNG TY XÂY DỰNG");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/trangch.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanvienActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TaikhoanNV tk = new TaikhoanNV();
        tk.setVisible(true);
    }//GEN-LAST:event_btnNhanvienActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnNhanvien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
