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
public class TTxuatNC {
    public static String IDNC;
    public static String HoTen;
    public static String GioiTinh;
    public static String SDT;
    public static String Chucvu;
    public static int Songaylam;
    public static int Luongcoban;
    public static int thuong;
    public static int tongluong;
    
    public TTxuatNC(){
        super();
    }
    public TTxuatNC(String ID,String HT,String gt,String sdt,String chucvu,int songaylam,int luongcb,int t,int tl){
        super();
        IDNC = ID;
        HoTen = HT;
        GioiTinh = gt;
        SDT = sdt;
        Chucvu = chucvu;
        Songaylam = songaylam;
        Luongcoban = luongcb;
        thuong = t;
        tongluong = tl;
    }

    public String getIDNC() {
        return IDNC;
    }

    public  String getHoTen() {
        return HoTen;
    }

    public  String getGioiTinh() {
        return GioiTinh;
    }

    public  String getSDT() {
        return SDT;
    }

    public  String getChucvu() {
        return Chucvu;
    }

    public  int getSongaylam() {
        return Songaylam;
    }

    public  int getLuongcoban() {
        return Luongcoban;
    }

    public  int getThuong() {
        return thuong;
    }

    public  int getTongluong() {
        return tongluong;
    }
    
    
}
