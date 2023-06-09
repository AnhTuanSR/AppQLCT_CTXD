/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_DuAn;

import DataBase.DBAccess;
import FileEX.TTxuatCPK;
import static QL_DuAn.BangPhanCong.MaDA;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Administrator
 */
public class ChiPhiKhac extends javax.swing.JFrame {
    public ResultSet rs = null;

    /**
     * Creates new form ChiPhiKhac
     */
    public ChiPhiKhac() {
        initComponents();
        LoadData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPhiphatsinh = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtTongCP = new javax.swing.JTextField();
        spinSoluong = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhichu = new javax.swing.JTextPane();
        txtDonvi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thống kê chi phí khác");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Loại chi phí khác");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        tabPhiphatsinh.setBackground(new java.awt.Color(255, 255, 51));
        tabPhiphatsinh.setForeground(new java.awt.Color(0, 0, 204));
        tabPhiphatsinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên chi phí", "Đơn vị", "Số lượng", "Tổng chi phí", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        tabPhiphatsinh.getTableHeader().setReorderingAllowed(false);
        tabPhiphatsinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPhiphatsinhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPhiphatsinh);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 206, 824, 170));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Add_16x16.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 407, -1, -1));

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Edit_16x16.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 407, -1, -1));

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Delete_16x16.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 407, -1, -1));

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Refresh_16x16.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 407, -1, -1));

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Undo_16x16.png"))); // NOI18N
        btnThoat.setText("Exit");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 407, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Tên chi phí");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Tổng chi phí");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        getContentPane().add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 160, -1));
        getContentPane().add(txtTongCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 123, -1));

        spinSoluong.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        getContentPane().add(spinSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Số lượng");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Đơn vị");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Ghi chú");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        jScrollPane2.setViewportView(txtGhichu);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 190, 40));
        getContentPane().add(txtDonvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 111, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chiphikhac.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void LoadData () 
    {
        DBAccess acc = new DBAccess();
        try { 
            rs = acc.Query("select * from PhiPhatSinh where IDDA = '"+MaDA+"'");
            String [] arr = {"Tên chi phí","Đơn vị","Số lượng","Tổng chi phí","Ghi chú"};
            DefaultTableModel model = new DefaultTableModel(arr,0);
            while(rs.next())
            {
                Vector vec = new Vector();
                vec.add(rs.getString("TenPhatSinh"));
                vec.add(rs.getString("DonVi"));
                vec.add(rs.getInt("SoLuong"));
                vec.add(rs.getInt("TongTien"));
                vec.add(rs.getString("GhiChu"));
                
                model.addRow(vec);
                
                TTxuatCPK.Tencp=rs.getString("TenPhatSinh");
                TTxuatCPK.Donvi=rs.getString("DonVi");
                TTxuatCPK.Soluong=rs.getInt("SoLuong");
                TTxuatCPK.Tongchiphi=rs.getInt("TongTien");
                TTxuatCPK.Ghichu=rs.getString("GhiChu");
            }
            tabPhiphatsinh.setModel(model);
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChiPhiKhac.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnSua.setEnabled(false);
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        DBAccess acc = new DBAccess();
        if(txtTen.getText().equals("") || txtDonvi.getText().equals("") || txtGhichu.getText().equals("") || txtTongCP.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin !!");
        }else{
            if(spinSoluong.getValue().hashCode() <= 0 ){
                JOptionPane.showMessageDialog(this, "Số lượng sản phẩm phải lớn hơn 0 !!!");
                spinSoluong.setValue(1);
            }else{
                String Tenchiphi = txtTen.getText();
                String ghichu = txtGhichu.getText();
                String Donvi = txtDonvi.getText();
                int SoLuong = (int) spinSoluong.getValue();
                int tongtien = Integer.parseInt(txtTongCP.getText());
                rs = acc.Query("select TenPhatSinh from PhiPhatSinh where TenPhatSinh = N'"+Tenchiphi+"' and IDDA = '"+MaDA+"'");
                try {if(rs.next())
                    {
                        JOptionPane.showMessageDialog(this, "Tên chi phí đã tồn tại !!!");
                    }else{
                        acc.Update("insert into PhiPhatSinh values(N'"+Tenchiphi+"',N'"+Donvi+"','"+SoLuong+"','"+tongtien+"',N'"+ghichu+"','"+MaDA+"')");     
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ChiPhiKhac.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } 
        LoadData();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        DBAccess acc = new DBAccess();
        int remove = tabPhiphatsinh.getSelectedRow();
        if(remove == -1){
            JOptionPane.showMessageDialog(null, "vui lòng chọn 1 dòng để sửa !!!");
        }else{
            if(txtDonvi.getText().equals("") || txtGhichu.getText().equals("") || txtTongCP.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin !!");
            }else{
                if(spinSoluong.getValue().hashCode() <= 0 ){
                    JOptionPane.showMessageDialog(this, "Số lượng sản phẩm phải lớn hơn 0 !!!");
                    spinSoluong.setValue(1);
                }else{
                    String Tenchiphi = txtTen.getText();
                    String ghichu = txtGhichu.getText();
                    String Donvi = txtDonvi.getText();
                    int SoLuong = (int) spinSoluong.getValue();
                    int tongtien = Integer.parseInt(txtTongCP.getText());
                    acc.Update("update PhiPhatSinh set  DonVi = N'"+Donvi+"',SoLuong = '"+SoLuong+"',TongTien = '"+tongtien+"',GhiChu = N'"+ghichu+"' where TenPhatSinh = N'"+Tenchiphi+"' and IDDA = '"+MaDA+"'");
                }
            } 
            LoadData();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        DBAccess acc = new DBAccess();
        int remove = tabPhiphatsinh.getSelectedRow();
        if(remove == -1){
            JOptionPane.showMessageDialog(null, "vui lòng chọn 1 dòng để xóa !!!");
        }else{
            String Tenchiphi = txtTen.getText();
            acc.Update("DELETE from PhiPhatSinh where TenPhatSinh = N'"+Tenchiphi+"' and IDDA = '"+MaDA+"' ");
        }
        LoadData();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        txtTen.setText("");
        txtDonvi.setText("");
        spinSoluong.setValue(1);
        txtTongCP.setText("");
        txtGhichu.setText("");
        btnSua.setEnabled(false);
        txtTen.setEditable(true);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        GiaoDienQLCT frm = new GiaoDienQLCT();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tabPhiphatsinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPhiphatsinhMouseClicked
        // TODO add your handling code here:
        int i = tabPhiphatsinh.getSelectedRow();
        TableModel model = tabPhiphatsinh.getModel();
        spinSoluong.setValue(model.getValueAt(i, 2).hashCode());
        txtTen.setText(model.getValueAt(i, 0).toString());
        txtTongCP.setText(model.getValueAt(i, 3).toString());
        txtDonvi.setText(model.getValueAt(i, 1).toString()); 
        txtGhichu.setText(model.getValueAt(i, 4).toString());
        btnSua.setEnabled(true);
        txtTen.setEditable(false);
    }//GEN-LAST:event_tabPhiphatsinhMouseClicked

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
            java.util.logging.Logger.getLogger(ChiPhiKhac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiPhiKhac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiPhiKhac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiPhiKhac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiPhiKhac().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spinSoluong;
    private javax.swing.JTable tabPhiphatsinh;
    private javax.swing.JTextField txtDonvi;
    private javax.swing.JTextPane txtGhichu;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTongCP;
    // End of variables declaration//GEN-END:variables
}
