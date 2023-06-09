/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaiKhoan;
import org.apache.commons.validator.routines.EmailValidator;
import DataBase.DBAccess;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger; 
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ASUS
 */
public class DangKi extends javax.swing.JFrame {
    static String saltvalue = PassBasedEnc.getSaltvalue(30);
    private int randomCode;
    public ResultSet rs = null ;
    /**
     * Creates new form DangKi
     * @param infoMessage
     * @param titleBar
     */ 
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    public DangKi() {
        initComponents();
        txtPass.setEnabled(false);
        txtNhaplai.setEnabled(false);
        txtTenTK.setEnabled(false);
    }
    public static boolean isValidEmail(String email) {
       // create the EmailValidator instance
       EmailValidator validator = EmailValidator.getInstance();
       // check for valid email addresses using isValid method
       return validator.isValid(email);
   }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDangki = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        txtHoten = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ckcShowpass = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtTenTK = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMaxacnhan = new javax.swing.JTextField();
        btnKiemtra = new javax.swing.JButton();
        btnGuima = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNhaplai = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng kí tài khoản");
        setMinimumSize(new java.awt.Dimension(340, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDangki.setBackground(new java.awt.Color(255, 0, 0));
        btnDangki.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDangki.setForeground(new java.awt.Color(255, 255, 255));
        btnDangki.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Favorites_16x16.png"))); // NOI18N
        btnDangki.setText("Đăng kí");
        btnDangki.setActionCommand("DangKi");
        btnDangki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangkiActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangki, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 376, 100, 30));

        btnThoat.setBackground(new java.awt.Color(204, 204, 204));
        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(153, 0, 153));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Undo_16x16.png"))); // NOI18N
        btnThoat.setText("Exit");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 376, -1, -1));
        jPanel1.add(txtHoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 63, 170, -1));

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassKeyTyped(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 266, 173, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mật khẩu");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 269, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tên nhân viên");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 66, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 113, 170, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 116, -1, -1));

        ckcShowpass.setText("Hiện Mật khẩu");
        ckcShowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckcShowpassActionPerformed(evt);
            }
        });
        jPanel1.add(ckcShowpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 336, 120, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên tài khoản");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtTenTK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenTKKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTenTKKeyTyped(evt);
            }
        });
        jPanel1.add(txtTenTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 223, 173, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Mã xác nhận");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 166, 80, -1));
        jPanel1.add(txtMaxacnhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 163, 173, -1));

        btnKiemtra.setBackground(new java.awt.Color(255, 255, 204));
        btnKiemtra.setForeground(new java.awt.Color(255, 51, 51));
        btnKiemtra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Check_16x16.png"))); // NOI18N
        btnKiemtra.setText("Kiểm tra");
        btnKiemtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiemtraActionPerformed(evt);
            }
        });
        jPanel1.add(btnKiemtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 162, -1, -1));

        btnGuima.setBackground(new java.awt.Color(255, 255, 204));
        btnGuima.setForeground(new java.awt.Color(255, 51, 51));
        btnGuima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Send_16x16.png"))); // NOI18N
        btnGuima.setText("Gửi mã");
        btnGuima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuimaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuima, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 112, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nhập lại mật khẩu");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 309, -1, -1));
        jPanel1.add(txtNhaplai, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 306, 173, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã nhân viên");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 27, -1, -1));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 24, 173, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dangki.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        TaikhoanNV frm = new TaikhoanNV();
        this.setVisible(false);
        frm.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed
    private Pattern pattern = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20}");
      
    private void btnDangkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangkiActionPerformed
        String MaNV = txtID.getText();
        String TenTK = txtTenTK.getText();
        String password = new String(txtPass.getPassword());
        String nhaplaipass = new String(txtNhaplai.getPassword());
        
        pattern.matcher(password).matches();
        
        if(txtID.getText().equals("") || txtHoten.getText().equals("") || txtEmail.getText().equals("") || txtMaxacnhan.getText().equals("") || 
                txtTenTK.getText().equals("") || txtPass.getPassword().equals("") || txtNhaplai.getPassword().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin !!");
        }else{
            if(pattern.matcher(password).matches()==true){
                String encryptedpassword = PassBasedEnc.generateSecurePassword(password, saltvalue);  
                DBAccess acc = new DBAccess();
                if(password.compareTo(nhaplaipass) == 0){
                    rs = acc.Query("select IDNV from TaiKhoanNV where IDNV = '"+MaNV+"'");                       
                    try {
                        if(rs.next()){
                            JOptionPane.showMessageDialog(null,"Nhân viên này đã có tài khoản !!"
                                    + "Vui lòng tạo tài khoản với nhân viên khác !!");
                        } else{
                            int kq = acc.Update("insert into TaiKhoanNV values('"+TenTK+"','"+encryptedpassword+"','"+MaNV+"','"+saltvalue+"')  ");
                            if(kq!=0){
                                JOptionPane.showMessageDialog(this,"Đăng kí thành công");
                                DangNhap frm = new DangNhap();
                                frm.setVisible(true);
                                dispose();
                            }else{
                                JOptionPane.showMessageDialog(null,"Tên tài khoản đã tồn tại !!");
                            }
                        }      
                    } catch (SQLException ex) {
                        Logger.getLogger(DangKi.class.getName()).log(Level.SEVERE, null, ex);
                    }    
                }else{
                    txtNhaplai.setBackground(Color.red);
                    JOptionPane.showMessageDialog(null, "Nhập lại mật khẩu sai !!");
                }   
            }else{
                DangKi.infoBox("Mật khẩu cần chữ in hoa,chữ thường ,số và kí tự đặt biệt, hãy chọn mật khẩu mới !", "THÔNG BÁO"); 
            }
        }
    }//GEN-LAST:event_btnDangkiActionPerformed

    private void txtPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyTyped
        if ((txtPass.getText() + evt.getKeyChar()).length() > 30) {
        evt.consume();
            JOptionPane.showMessageDialog(null, "Mật khẩu quá dài, phải dưới 30 kí tự !");
        }
    }//GEN-LAST:event_txtPassKeyTyped

    private void ckcShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckcShowpassActionPerformed
        // TODO add your handling code here:
        if (ckcShowpass.isSelected()) {
            txtPass.setEchoChar((char)0);
            txtNhaplai.setEchoChar((char)0);
        }else {
            txtPass.setEchoChar('*');
            txtNhaplai.setEchoChar('*');
        }
    }//GEN-LAST:event_ckcShowpassActionPerformed

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
    if ((txtPass.getText() + evt.getKeyChar()).length() > 30) {
            evt.consume();
        }        
    }//GEN-LAST:event_txtPassKeyReleased

    private void btnKiemtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiemtraActionPerformed
        String x = txtMaxacnhan.getText();
        Pattern patter = Pattern.compile("\\d*");
        Matcher matcher = patter.matcher(x);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Mã xác nhận phải là 1 số !");
        } else {
            if(Integer.valueOf(txtMaxacnhan.getText())==randomCode)
            {
                JOptionPane.showMessageDialog(null, "Mã xác nhận chính xác !");
                txtPass.setEnabled(true);
                txtNhaplai.setEnabled(true);
                txtTenTK.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "Mã xác nhận không chính xác !");
            }
        }
    }//GEN-LAST:event_btnKiemtraActionPerformed

    private void btnGuimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuimaActionPerformed
        // TODO add your handling code here:
        DBAccess acc = new DBAccess();
        String Hoten = txtHoten.getText();
        String manv = txtID.getText();
        String email = txtEmail.getText();
        rs = acc.Query("select Email from QLNhanVien where Email = N'"+email+"' and IDNV = '"+manv+"' and HoTen = N'"+Hoten+"'");
        try {
            if(rs.next()){
                try{
                    Random rand = new Random();
                    randomCode=rand.nextInt(999999);
                    String host = "smtp.gmail.com";
                    String user ="daylaemaildein555@gmail.com";
                    String pass="spmhbmhqmvaqdgyq";
                    String to = txtEmail.getText();
                    String subject="Reseting Code";
                    String message ="Your reset code is "+randomCode;
                    boolean sessionDebug = false;
                    Properties pros = System.getProperties();

                    pros.put("mail.smtp.starttls.enable", "true");
                    pros.put("mail.smtp.host", "host");
                    pros.put("mail.smtp.port","25");
                    pros.put("mail.smtp.auth","true");
                    pros.put("mail.smtp.EnableSSL.enable","true");

                    pros.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                    pros.setProperty("mail.smtp.socketFactory.fallback", "false");
                    pros.setProperty("mail.smtp.port", "465");
                    pros.setProperty("mail.smtp.socketFactory.port", "465");

                    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

                    Authenticator authenticator = new Authenticator () {
                        @Override
                        public PasswordAuthentication getPasswordAuthentication(){
                            return new PasswordAuthentication("user","pass");
                        }
                    };

                    Session mailSession = Session.getDefaultInstance( pros , authenticator);

                    mailSession.setDebug(sessionDebug);
                    Message msg = new MimeMessage(mailSession);
                    msg.setFrom(new InternetAddress(user));
                    InternetAddress [] address = {new InternetAddress(to)};
                    msg.setRecipients(Message.RecipientType.TO, address);
                    msg.setSubject(subject);
                    msg.setText(message);
                    Transport transport = mailSession.getTransport("smtp");
                    transport.connect(host, user, pass);
                    transport.sendMessage(msg, msg.getAllRecipients());
                    transport.close();
                    JOptionPane.showMessageDialog(null, "Mã xác nhận đã gửi đến email của bạn"
                        + "\nVui lòng kiểm tra !!");
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(rootPane, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng thông tin nhân viên đã cung cấp trước đó !!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangKi.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_btnGuimaActionPerformed

    private void txtTenTKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenTKKeyTyped
        // TODO add your handling code here:
        if ((txtTenTK.getText() + evt.getKeyChar()).length() > 30) {
        evt.consume();
        JOptionPane.showMessageDialog(null, "Tên quá dài, phải dưới 30 kí tự !");
        }
    }//GEN-LAST:event_txtTenTKKeyTyped

    private void txtTenTKKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenTKKeyReleased
        // TODO add your handling code here:
        if ((txtTenTK.getText() + evt.getKeyChar()).length() > 30) {
        evt.consume();
        }
    }//GEN-LAST:event_txtTenTKKeyReleased
   
    
    /**
     * @param args the command line arguments
     */
       public static void main(String args[]) 
       {
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
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DangKi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangki;
    private javax.swing.JButton btnGuima;
    private javax.swing.JButton btnKiemtra;
    private javax.swing.JButton btnThoat;
    private javax.swing.JCheckBox ckcShowpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMaxacnhan;
    private javax.swing.JPasswordField txtNhaplai;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTenTK;
    // End of variables declaration//GEN-END:variables
}
