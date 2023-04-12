/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaiKhoan;

import DataBase.DBAccess;
import javax.swing.JOptionPane;
import java.util.regex.Pattern; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import static TaiKhoan.DangNhap.TenTaiKhoan;


public class Quenpass extends javax.swing.JFrame {
    static String saltvalue = TaiKhoan.PassBasedEnc.getSaltvalue(30);
    public ResultSet rs = null;
    
    public Quenpass() {
        initComponents();
        txtTenTK.setText(TenTaiKhoan);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPassmoi = new javax.swing.JPasswordField();
        txtNhaplaiMK = new javax.swing.JPasswordField();
        txtTenTK = new javax.swing.JTextField();
        btnCapnhat = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        ckcShowpass = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quên password");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Cập Nhật Mật Khẩu Mới");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 220, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên tài khoản");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mật Khẩu Mới");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nhập Lại Mật Khẩu Mới");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 160, -1, -1));
        getContentPane().add(txtPassmoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 117, 171, -1));
        getContentPane().add(txtNhaplaiMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 157, 171, -1));
        getContentPane().add(txtTenTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 77, 171, -1));

        btnCapnhat.setBackground(new java.awt.Color(255, 255, 102));
        btnCapnhat.setForeground(new java.awt.Color(0, 0, 204));
        btnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Upload_16x16.png"))); // NOI18N
        btnCapnhat.setText("Cập nhật");
        btnCapnhat.setActionCommand("DangKi");
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatActionPerformed(evt);
            }
        });
        getContentPane().add(btnCapnhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        btnThoat.setBackground(new java.awt.Color(255, 255, 102));
        btnThoat.setForeground(new java.awt.Color(0, 0, 204));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Undo_16x16.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        ckcShowpass.setText("Hiện Mật khẩu");
        ckcShowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckcShowpassActionPerformed(evt);
            }
        });
        getContentPane().add(ckcShowpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hinh-nen-trang-ban-do-the-gioi_104325245.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 287));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
        Pattern pattern = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20}");
        String TenTK = txtTenTK.getText();
        String Matkhau = new String(txtPassmoi.getPassword());
        String NhaplaiMK = new String(txtNhaplaiMK.getPassword());    
        
        pattern.matcher(Matkhau).matches();

        if(pattern.matcher(Matkhau).matches()==true){
            if(Matkhau.compareTo(NhaplaiMK) == 0){
                String encryptedpassword = PassBasedEnc.generateSecurePassword(Matkhau, saltvalue);
                DBAccess acc = new DBAccess();
                rs = acc.Query("select TenTaiKhoan from TaiKhoanNV where TenTaiKhoan = '"+TenTK+"' ");
                try {
                    if(rs.next() ){
                        acc.Update("Update TaiKhoanNV set MatKhau = N'"+encryptedpassword+"', saltvalue = N'"+saltvalue+"' where TenTaiKhoan = '"+TenTK+"' ");  
                        JOptionPane.showMessageDialog(null,"Cập nhật mât khẩu thành công");
                        DangNhap frm = new DangNhap();
                        frm.setVisible(true);
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(null,"Tên tài khoản không đúng !!!");
                    }
                }catch (SQLException ex) {
                    Logger.getLogger(Quenpass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                txtNhaplaiMK.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Nhập lại mật khẩu sai !!");
            }   
        }else{
            DangKi.infoBox("Mật khẩu không hợp lệ hoặc không đủ mạnh, hãy chọn mật khẩu mới ( có thể có chữ viết hoa hoặc những kí tự đặt biệt )", "THÔNG BÁO");
        }  
    }//GEN-LAST:event_btnCapnhatActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        DangNhap dn = new DangNhap();
        dn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void ckcShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckcShowpassActionPerformed
        // TODO add your handling code here:
        if (ckcShowpass.isSelected()) {
            txtPassmoi.setEchoChar((char)0);
            txtNhaplaiMK.setEchoChar((char)0);
        } else {
            txtPassmoi.setEchoChar('*');
            txtNhaplaiMK.setEchoChar('*');
        }
    }//GEN-LAST:event_ckcShowpassActionPerformed

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
            java.util.logging.Logger.getLogger(Quenpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quenpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quenpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quenpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Quenpass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnThoat;
    private javax.swing.JCheckBox ckcShowpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtNhaplaiMK;
    private javax.swing.JPasswordField txtPassmoi;
    private javax.swing.JTextField txtTenTK;
    // End of variables declaration//GEN-END:variables
}
