/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileEX;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import java.util.*;
import static FileEX.TTxuatNVL.*;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
/**
 *
 * @author thuan
 */
public class ThuExcelWriterNVL {
     private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }
    public static void ghifileexle(String linkfile) throws FileNotFoundException, IOException{
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Employees sheet");
        TTxuatNVL src = new TTxuatNVL(IDNVL,TenNVL,NoiCungCap,SoLuong,Donvitinh,Dongia,Tongtien);
        
        ArrayList<TTxuatNVL> list = new ArrayList<>();
        list.add(src);
        
        int rownum = 0;
        Cell cell;
        Row row;
        
        HSSFCellStyle style = createStyleForTitle(workbook);
        row = sheet.createRow(rownum);
        
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Mã nguyên liệu");
        cell.setCellStyle(style);
        
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Tên nguyên liệu");
        cell.setCellStyle(style);
        
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Nơi cung cấp");
        cell.setCellStyle(style);
        
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Số lượng");
        cell.setCellStyle(style);
        
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Đơn vị tính");
        cell.setCellStyle(style);
        
        cell = row.createCell(6, CellType.STRING);
        cell.setCellValue("Đơn giá");
        cell.setCellStyle(style);
        
        cell = row.createCell(7, CellType.STRING);
        cell.setCellValue("Tổng tiền");
        cell.setCellStyle(style);
        
        //---------data-----------------------------
        // dư liêu trong cơ sơ lieu đươc đưa voà 
        for(TTxuatNVL s : list){
           rownum++;
           row=sheet.createRow(rownum);
           cell = row.createCell(1, CellType.STRING);
           cell.setCellValue(s.getIDNVL());      
           cell = row.createCell(2, CellType.STRING);  
           cell.setCellValue(s.getTenNVL());   
           cell = row.createCell(3, CellType.STRING);
           cell.setCellValue(s.getNoiCungCap());
           cell = row.createCell(4, CellType.STRING);
           cell.setCellValue(s.getSoLuong());
           cell = row.createCell(5, CellType.STRING);
           cell.setCellValue(s.getDonvitinh());
           cell = row.createCell(6, CellType.STRING);
           cell.setCellValue(s.getDongia());
           cell = row.createCell(7, CellType.STRING);
           cell.setCellValue(s.getTongtien());
          
        } 
        File file=new File(linkfile);
        file.getParentFile().mkdirs();
        try (FileOutputStream outFile = new FileOutputStream(file)) {
             workbook.write(outFile);
             System.out.println("Created file: " + file.getAbsolutePath());
             outFile.close();
        } 
    }
}
