/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileEX;


/**
 *
 * @author thuan
 */
public class TTxuatBPC {
    public static String IDDA;
    public static String TenDA;
    public static String HoTenKH;
    public static String SDT;
    public static String DiaDiem;
    public static String NgayNhan;
    public static int DatCoc;
    public static String TienDo;
    
    public TTxuatBPC(){
        super();
    }
    public TTxuatBPC(String ID,String Ten,String KH,String S,String DD,String NN,int DC,String TD){
        super();
        IDDA = ID;
        TenDA = Ten;
        HoTenKH = KH;
        SDT = S;
        DiaDiem = DD;
        NgayNhan = NN;
        DatCoc = DC;
        TienDo = TD;
    }
    public String getIDDA(){
        return IDDA;
    }
    public String getTenDA(){
        return TenDA;
    }
    public String getHotenKH(){
       return HoTenKH;
    }
    public String getSDT(){
        return SDT;
    }
    public String getDiaDiem(){
        return DiaDiem;
    }
    public String getNgayNhan(){
        return NgayNhan;
    }
    public int getDatCoc(){
        return DatCoc;
    } 
    public String getTienDo(){
        return TienDo;
    }
    
}
