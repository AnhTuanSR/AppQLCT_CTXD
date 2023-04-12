 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLi;
import DataBase.DBAccess;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.ButtonGroup;
/**
 *
 * @author ASUS
 */
public class QLThongTinKhachHang extends javax.swing.JFrame {
    public ResultSet rs = null ;
    
    public QLThongTinKhachHang() {
        initComponents();
        ButtonGroup group = new ButtonGroup();
        group.add(rdbNu);
        group.add(rdbNam);
        LoadData();
        rdbNu.setSelected(true);
    }
    public void LoadData () 
    {
        DBAccess acc = new DBAccess();
        try { 
            rs = acc.Query("select * from QLThongTinKH");
            String [] arr = {"Mã khách hàng","Họ tên","Giới tính","Số điện thoại","Địa chỉ"};
            DefaultTableModel model = new DefaultTableModel(arr,0);
            while(rs.next())
            {
                Vector vec = new Vector();
                vec.add(rs.getString("IDKH"));
                vec.add(rs.getString("HoTenKH"));
                vec.add(rs.getString("GioiTinh"));
                vec.add(rs.getString("SDT"));
                vec.add(rs.getString("DiaChi"));
                                  
                model.addRow(vec);
            }
            tabKhachhang.setModel(model);
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLThongTinKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabKhachhang = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rdbNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí nhân viên");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 0));
        jLabel1.setText("DANH SÁCH KHÁCH HÀNG");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Delete_16x16.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Edit_16x16.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Add_16x16.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Mã khách hàng");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Họ tên");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Số điện thoại");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Địa chỉ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));
        getContentPane().add(txtHoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 170, -1));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 74, 170, -1));
        getContentPane().add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 170, -1));

        tabKhachhang.setBackground(new java.awt.Color(255, 255, 51));
        tabKhachhang.setForeground(new java.awt.Color(0, 0, 204));
        tabKhachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ tên", "Giới tính", "Số điện thoại", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabKhachhang.getTableHeader().setReorderingAllowed(false);
        tabKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabKhachhangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabKhachhang);
        if (tabKhachhang.getColumnModel().getColumnCount() > 0) {
            tabKhachhang.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 770, 230));

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Undo_16x16.png"))); // NOI18N
        btnThoat.setText("Exit");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 350, -1, -1));

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Refresh_16x16.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("Giới tính");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        rdbNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbNam.setForeground(new java.awt.Color(255, 51, 255));
        rdbNam.setText("Nam");
        getContentPane().add(rdbNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        rdbNu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdbNu.setForeground(new java.awt.Color(255, 51, 255));
        rdbNu.setText("Nữ");
        getContentPane().add(rdbNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jScrollPane3.setViewportView(txtDiachi);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 170, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nenQL.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 413));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        txtHoten.setText("");
        txtSDT.setText("");
        txtDiachi.setText("");
        txtID.setEnabled(true);    
        rdbNu.setSelected(true);
        txtID.setEditable(true);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        DBAccess acc = new DBAccess();
        if(txtID.getText().equals("") || txtSDT.getText().equals("") || txtHoten.getText().equals("") || txtDiachi.getText().equals("")){
            JOptionPane.showMessageDialog(this, "vui lòng điền đầy đủ thông tin");
        }else{
            ButtonGroup group = new ButtonGroup();
            group.add(rdbNu);
            group.add(rdbNam);
            String IDKH = txtID.getText();
            String HoTenKH = txtHoten.getText();
            String GioiTinh;
            if(rdbNu.isSelected() == true){
                GioiTinh = rdbNu.getText();
            }else{
                GioiTinh = rdbNam.getText();
            }           
            String SDT = txtSDT.getText();
            String DiaChi = txtDiachi.getText();
            rs = acc.Query("select IDKH from QLThongTinKH where IDKH = '"+IDKH+"'");
            try {
                if(rs.next()){
                    JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại !!!");
                }else{
                    acc.Update("insert into QLThongTinKH values('"+IDKH+"',N'"+HoTenKH+"',N'"+GioiTinh+"','"+SDT+"',N'"+DiaChi+"')");
                }
            }catch (SQLException ex) {
                Logger.getLogger(QLThongTinKhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }
            LoadData();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tabKhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabKhachhangMouseClicked
        // TODO add your handling code here:
        ButtonGroup group = new ButtonGroup();
        group.add(rdbNu);
        group.add(rdbNam);
        int i = tabKhachhang.getSelectedRow();
        TableModel model = tabKhachhang.getModel();
        txtID.setText(model.getValueAt(i, 0).toString());
        txtHoten.setText(model.getValueAt(i, 1).toString());
        txtSDT.setText(model.getValueAt(i, 3).toString());
        txtDiachi.setText(model.getValueAt(i, 4).toString());   
        if(model.getValueAt(i, 2).toString().equals("Nữ")){
            rdbNu.setSelected(true);
            rdbNam.setSelected(false);
        }else{
            rdbNam.setSelected(true);
            rdbNu.setSelected(false);  
        }
        txtID.setEditable(false);
    }//GEN-LAST:event_tabKhachhangMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        DBAccess acc = new DBAccess();
        if(txtSDT.getText().equals("") || txtHoten.getText().equals("") || txtDiachi.getText().equals("")){
            JOptionPane.showMessageDialog(this, "vui lòng điền đầy đủ thông tin");
        }else
        {
            ButtonGroup group = new ButtonGroup();
            group.add(rdbNu);
            group.add(rdbNam);
            String GioiTinh;
            if(rdbNu.isSelected() == true){
                GioiTinh = rdbNu.getText();
            }else{
                GioiTinh = rdbNam.getText();
            }
            String IDKH = txtID.getText();
            String HoTen = txtHoten.getText();
            String SDT = txtSDT.getText();
            String DiaChi  = txtDiachi.getText();
            acc.Update("update QLThongTinKH set HoTenKH = N'"+HoTen+"',SDT = '"+SDT+"',GioiTinh = N'"+GioiTinh+"',DiaChi = N'"+DiaChi+"' where IDKH = '"+IDKH+"' ");
            LoadData();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        DBAccess acc = new DBAccess();
        int remove = tabKhachhang.getSelectedRow();
        if(remove == -1){
            JOptionPane.showMessageDialog(null, "vui lòng chọn 1 dòng để xóa !!!");
        }else{
            String IDKH = txtID.getText();
            acc.Update("DELETE from QLThongTinKH where IDKH = '"+IDKH+"' ");
        }
        LoadData();
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(QLThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLThongTinKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QLThongTinKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    private javax.swing.JTable tabKhachhang;
    private javax.swing.JTextPane txtDiachi;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
