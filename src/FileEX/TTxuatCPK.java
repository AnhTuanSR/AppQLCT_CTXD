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
public class TTxuatCPK {
    public static String Tencp;
    public static String Donvi;
    public static int Soluong;
    public static int Tongchiphi;
    public static String Ghichu;
    
    public TTxuatCPK(){
        super();
    }
    public TTxuatCPK(String ten,String dv,int sl,int tcp,String gc){
        super();
        Tencp = ten;
        Donvi = dv;
        Soluong = sl;
        Tongchiphi = tcp;
        Ghichu = gc;
    }

    public String getTencp() {
        return Tencp;
    }

    public String getDonvi() {
        return Donvi;
    }

    public int getSoluong() {
        return Soluong;
    }

    public int getTongchiphi() {
        return Tongchiphi;
    }

    public String getGhichu() {
        return Ghichu;
    }
    
}
