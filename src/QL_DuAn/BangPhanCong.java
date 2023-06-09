/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_DuAn;

import DataBase.DBAccess;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.ResultSet;
import static TaiKhoan.DangNhap.IDNV;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import FileEX.TTxuatBPC;

/**
 *
 * @author Administrator
 */
public class BangPhanCong extends javax.swing.JFrame {
    public ResultSet rs = null,rs1 = null ;
    public static String MaDA = null;

    /**
     * Creates new form BangPhanCong
     */
    public BangPhanCong() {
        initComponents();
        LoadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void LoadData () 
    {
        DBAccess acc = new DBAccess();
        try{
            rs = acc.Query("select QLPhanCong.IDDA,TenDA,HoTenKH,QLThongTinKH.SDT,DiaDiem,NgayNhan,DatCoc,TienDo\n" +
                            "from QLNhanVien,QLPhanCong,DuAn,QLThongTinKH\n" +
                            "where QLNhanVien.IDNV = QLPhanCong.IDNV and QLPhanCong.IDDA = DuAn.IDDA \n" +
                            "and QLThongTinKH.IDKH = DuAn.IDKH and QLPhanCong.IDNV = N'"+IDNV+"' ");
            String [] arr = {"Mã dự án","Tên dự án","Tên khách hàng","Số điện thoại","Địa điểm","Ngày nhận dự án","Đặt cọc","Tiến độ"};
            DefaultTableModel model = new DefaultTableModel(arr,0);
            while(rs.next())
            {
                Vector vec = new Vector();
                vec.add(rs.getString("IDDA"));
                vec.add(rs.getString("TenDA"));
                vec.add(rs.getString("HoTenKH"));
                vec.add(rs.getString("SDT"));
                vec.add(rs.getString("DiaDiem")); 
                vec.add(rs.getString("NgayNhan"));
                vec.add(rs.getInt("DatCoc"));
                vec.add(rs.getString("TienDo")); 
                
                model.addRow(vec);
                
                TTxuatBPC.IDDA=rs.getString("IDDA");
                TTxuatBPC.TenDA=rs.getString("TenDA");
                TTxuatBPC.HoTenKH=rs.getString("HoTenKH");
                TTxuatBPC.SDT=rs.getString("SDT");
                TTxuatBPC.DiaDiem=rs.getString("DiaDiem");
                TTxuatBPC.NgayNhan=rs.getString("NgayNhan");
                TTxuatBPC.DatCoc=rs.getInt("DatCoc");
                TTxuatBPC.TienDo=rs.getString("TienDo");
            }
            tabPhancong.setModel(model);
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(BangPhanCong.class.getName()).log(Level.SEVERE, null, ex);
        }
        setColumn();
        btnChitiet.setEnabled(false);
    }
    public void setColumn()
    {
        tabPhancong.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabPhancong.getColumnModel().getColumn(1).setPreferredWidth(200);
        tabPhancong.getColumnModel().getColumn(2).setPreferredWidth(70);
        tabPhancong.getColumnModel().getColumn(3).setPreferredWidth(40);
        tabPhancong.getColumnModel().getColumn(4).setPreferredWidth(200);
        tabPhancong.getColumnModel().getColumn(5).setPreferredWidth(50);
        tabPhancong.getColumnModel().getColumn(6).setPreferredWidth(40);
        tabPhancong.getColumnModel().getColumn(7).setPreferredWidth(50);
        tabPhancong.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabPhancong = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabKhachhang = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        btnChitiet = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bảng phân công dự án");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabPhancong.setBackground(new java.awt.Color(255, 255, 102));
        tabPhancong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dự án", "Tên dự án", "Khách hàng", "Số điện thoại", "Địa điểm", "Ngày nhận DA", "Đặt cọc", "Tiến độ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabPhancong.setGridColor(new java.awt.Color(255, 0, 0));
        tabPhancong.setSelectionBackground(new java.awt.Color(204, 0, 0));
        tabPhancong.getTableHeader().setReorderingAllowed(false);
        tabPhancong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPhancongMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabPhancong);
        if (tabPhancong.getColumnModel().getColumnCount() > 0) {
            tabPhancong.getColumnModel().getColumn(5).setHeaderValue("Ngày nhận DA");
            tabPhancong.getColumnModel().getColumn(6).setHeaderValue("Đặt cọc");
            tabPhancong.getColumnModel().getColumn(7).setHeaderValue("Tiến độ");
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 104, 1148, 182));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Bảng phân công");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        tabKhachhang.setBackground(new java.awt.Color(255, 255, 102));
        tabKhachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Giới tính", "Địa chỉ"
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
        tabKhachhang.setGridColor(new java.awt.Color(255, 0, 0));
        tabKhachhang.setSelectionBackground(new java.awt.Color(204, 0, 0));
        tabKhachhang.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tabKhachhang);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 1148, 94));

        btnThoat.setBackground(new java.awt.Color(255, 255, 0));
        btnThoat.setForeground(new java.awt.Color(0, 0, 204));
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Undo_16x16.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 470, -1, -1));

        btnChitiet.setBackground(new java.awt.Color(255, 255, 0));
        btnChitiet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnChitiet.setForeground(new java.awt.Color(0, 0, 204));
        btnChitiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Information_16x16.png"))); // NOI18N
        btnChitiet.setText("Chi tiết");
        btnChitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChitietActionPerformed(evt);
            }
        });
        getContentPane().add(btnChitiet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 300, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bangphancong2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1205, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabPhancongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPhancongMouseClicked
        // TODO add your handling code here:    
        DBAccess acc = new DBAccess();
        int i = tabPhancong.getSelectedRow();
        if(i == -1){
            btnChitiet.setEnabled(false);
        }else{
            btnChitiet.setEnabled(true);
        }
        TableModel model = tabPhancong.getModel();
        MaDA = model.getValueAt(i, 0).toString();
        String MaKH = "";
        rs = acc.Query("select * from DuAn where IDDA = '"+MaDA+"'");
        try {
            while(rs.next())
            {
                MaKH = rs.getString("IDKH");
            }
            rs1 = acc.Query("select * from QLThongTinKH where IDKH = '"+MaKH+"'");
            String [] arr = {"Mã khách hàng","Họ tên","Giới tính","Số điện thoại","Địa chỉ"};
            DefaultTableModel model1 = new DefaultTableModel(arr,0);
            while(rs1.next())
            {
                Vector vec = new Vector();
                vec.add(rs1.getString("IDKH"));
                vec.add(rs1.getString("HoTenKH"));
                vec.add(rs1.getString("GioiTinh"));
                vec.add(rs1.getString("SDT"));
                vec.add(rs1.getString("DiaChi")); 
                                  
                model1.addRow(vec);
            }
            tabKhachhang.setModel(model1);
            rs1.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(BangPhanCong.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tabPhancongMouseClicked

    private void btnChitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChitietActionPerformed
        // TODO add your handling code here:
        GiaoDienQLCT frm = new GiaoDienQLCT();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnChitietActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        TrangChuDangNhapNV frm = new TrangChuDangNhapNV();
        frm.setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(BangPhanCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BangPhanCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BangPhanCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BangPhanCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BangPhanCong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChitiet;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabKhachhang;
    private javax.swing.JTable tabPhancong;
    // End of variables declaration//GEN-END:variables
}
