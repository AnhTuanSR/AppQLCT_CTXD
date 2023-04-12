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
public class TTxuatNVL {
    public static String IDNVL;
    public static String TenNVL;
    public static String NoiCungCap;
    public static int SoLuong;
    public static String Donvitinh;
    public static int Dongia;
    public static int Tongtien;
    
    public TTxuatNVL(){
        super();
    }
    public TTxuatNVL(String ID,String Ten,String ncc,int sl,String dvt,int dg,int tt){
        super();
        IDNVL = ID;
        TenNVL = Ten;
        NoiCungCap = ncc;
        SoLuong = sl;
        Donvitinh = dvt;
        Dongia = dg;
        Tongtien = tt;
    }

    public String getIDNVL() {
        return IDNVL;
    }

    public String getTenNVL() {
        return TenNVL;
    }

    public String getNoiCungCap() {
        return NoiCungCap;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public String getDonvitinh() {
        return Donvitinh;
    }

    public int getDongia() {
        return Dongia;
    }

    public int getTongtien() {
        return Tongtien;
    }
    
    
}
