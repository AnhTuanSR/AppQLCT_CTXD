/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaiKhoan;

import DataBase.DBAccess;
import QL_DuAn.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ASUS
 */
public class DangNhap extends javax.swing.JFrame {
    public static String IDNV = null;
    public static String TenTaiKhoan = null;

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
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

        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenTK = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        ckcShowpass = new javax.swing.JCheckBox();
        btnDangnhap = new javax.swing.JButton();
        btnQuenMK = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setBackground(new java.awt.Color(255, 255, 0));
        setName("formDangnhap"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Tên tài khoản");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel3.setText("Mật khẩu");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));
        getContentPane().add(txtTenTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 170, -1));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 170, -1));

        ckcShowpass.setText("Hiện Mật khẩu");
        ckcShowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckcShowpassActionPerformed(evt);
            }
        });
        getContentPane().add(ckcShowpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        btnDangnhap.setBackground(new java.awt.Color(255, 255, 153));
        btnDangnhap.setForeground(new java.awt.Color(0, 0, 102));
        btnDangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Next_16x16.png"))); // NOI18N
        btnDangnhap.setText("Đăng nhập");
        btnDangnhap.setName("formD"); // NOI18N
        btnDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangnhapActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 130, 30));

        btnQuenMK.setBackground(new java.awt.Color(204, 255, 255));
        btnQuenMK.setForeground(new java.awt.Color(204, 0, 0));
        btnQuenMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Refresh_16x16.png"))); // NOI18N
        btnQuenMK.setText("Quên mật khẩu!");
        btnQuenMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuenMKActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuenMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        btnThoat.setBackground(new java.awt.Color(204, 255, 255));
        btnThoat.setForeground(new java.awt.Color(0, 0, 102));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Undo_16x16.png"))); // NOI18N
        btnThoat.setText("Exit");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, 28));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 153));
        jPanel1.setEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User-icon.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, 100));

        jLabel1.setText("Tài khoản nhân viên");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 340));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Đăng nhập");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hinh-nen-trang-ban-do-the-gioi_104325245.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 323, 340));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ckcShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckcShowpassActionPerformed
        // TODO add your handling code here:
        if (ckcShowpass.isSelected()) {
            txtPass.setEchoChar((char)0);
        } else {
            txtPass.setEchoChar('*');
        }
    }//GEN-LAST:event_ckcShowpassActionPerformed

    private void btnDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangnhapActionPerformed

        if(txtTenTK.getText().equals("") || txtPass.getPassword().equals(""))
        {
            JOptionPane.showMessageDialog(this, "vui lòng điền đầy đủ thông tin");
        }
        else
        {
            try{
                TenTaiKhoan = txtTenTK.getText();
                String MatKhau = new String (txtPass.getPassword());

                /* generates an encrypted password. It can be stored in a database.*/
                DBAccess acc = new DBAccess();
                ResultSet sr = acc.Query("select TenTaiKhoan,MatKhau,IDNV,saltvalue from TaiKhoanNV where TenTaiKhoan = N'"+TenTaiKhoan+"'  ");
                if(sr.next()){
                    boolean status = TaiKhoan.PassBasedEnc.verifyUserPassword(MatKhau,sr.getString(2),sr.getString(4));
                    if(status == true)
                    {
                        JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                        IDNV = sr.getString("IDNV");
                        TrangChuDangNhapNV frm = new TrangChuDangNhapNV();
                        this.setVisible(false);
                        frm.setVisible(true);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Mật khẩu không đúng !!!"
                            +"\n"+ "Vui lòng kiểm tra lại .");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Không tìm thấy tên tài khoản cần đăng nhập !!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDangnhapActionPerformed

    private void btnQuenMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuenMKActionPerformed
        // TODO add your handling code here:
        Emailvacode frm = new Emailvacode();
        frm.setVisible(true);
    }//GEN-LAST:event_btnQuenMKActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TaikhoanNV tk = new TaikhoanNV();
        tk.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    
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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangnhap;
    private javax.swing.JButton btnQuenMK;
    private javax.swing.JButton btnThoat;
    private javax.swing.JCheckBox ckcShowpass;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTenTK;
    // End of variables declaration//GEN-END:variables
}