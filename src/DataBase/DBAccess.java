/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class DBAccess {
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luan
 */

    private Connection con;
    private Statement stmt;
    public DBAccess(){
        try {
            MyConnect mycon = new MyConnect();
            con = mycon.getConnect();
            stmt = con.createStatement();
        }catch(Exception e){
            
        }
    }
    public int Update(String str){
        try{
            int i = stmt.executeUpdate(str);
            return i;
        }catch(Exception e){
            return -1;
        }
    }
    public ResultSet Query(String srt){
        try{
            ResultSet rs=stmt.executeQuery(srt);
            return rs;
            
        }catch(Exception e){
            return null;
        }
    }
    public void InsertNV(String IDNV, String HoTen, String SDT, String GioiTinh, String IDCV, String Email,String DiaChi) throws SQLException{
        Statement st = con.createStatement();
        if(IDCV.equals("Thu ngân")){
           IDCV="CV01";
        }
        else{
            if(IDCV.equals("Quản lí nhân sự")){
                IDCV="CV02";
            }else {
                IDCV="CV03";
            }
        }
        String sql = "insert into QLNhanVien values('"+IDNV+"',N'"+HoTen+"','"+SDT+"',N'"+GioiTinh+"','"+IDCV+"',N'"+Email+"' ,N'"+DiaChi+"')  ";
        st.executeUpdate(sql); 
    }
    public void UpdateNV(String IDNV, String HoTen, String SDT, String IDCV, String DiaChi, String Email,String GioiTinh) throws SQLException{
        Statement st = con.createStatement();
        if(IDCV.equals("Thu ngân")){
           IDCV="CV01";
        }
        else{
            if(IDCV.equals("Quản lí nhân sự")){
                IDCV="CV02";
            }else {
                IDCV="CV03";
            }
        }
        String sql = "update QLNhanVien set HoTen = N'"+HoTen+"',SDT = '"+SDT+"',GioiTinh = '"+GioiTinh+"',IDCV = '"+IDCV+"',Email = N'"+Email+"',DiaChi = N'"+DiaChi+"' where IDNV = '"+IDNV+"'  ";
        st.executeUpdate(sql); 
    }

    public void UpdateCN(String IDCN, String HoTen,String GioiTinh, String SDT, String IDCVCN, String DiaChi) throws SQLException{
        Statement st = con.createStatement();
        if(IDCVCN.equals("Công nhân thời vụ")){
           IDCVCN="CN01";
        }
        else{
            if(IDCVCN.equals("Giám sát công trường")){
                IDCVCN="CN02";
            }else {
                IDCVCN="CN03";
            }
        }
        String sql = "update QLCongNhan set HoTen = N'"+HoTen+"',GioiTinh = N'"+GioiTinh+"',SDT = '"+SDT+"',IDCVCN = '"+IDCVCN+"',DiaChi = N'"+DiaChi+"' where IDCN = '"+IDCN+"'  ";
        st.executeUpdate(sql); 
    }
    public void InsertCN(String IDCN, String HoTen,String GioiTinh, String SDT, String IDCVCN, String DiaChi) throws SQLException{
        Statement st = con.createStatement();
        if(IDCVCN.equals("Công nhân thời vụ")){
           IDCVCN="CN01";
        }
        else{
            if(IDCVCN.equals("Giám sát công trường")){
                IDCVCN="CN02";
            }else {
                IDCVCN="CN03";
            }
        }
        String sql = "insert into QLCongNhan values ('"+IDCN+"',N'"+HoTen+"',N'"+GioiTinh+"','"+SDT+"','"+IDCVCN+"',N'"+DiaChi+"')";
        st.executeUpdate(sql); 
    }
}
