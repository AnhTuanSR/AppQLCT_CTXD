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
import static FileEX.TTxuatCPK.*;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
/**
 *
 * @author thuan
 */
public class ThuExcelWriterCPK {
     private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {
        HSSFFont font = workbook.createFont();
        font.setBold(true);//
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }
    public static void ghifileexle(String linkfile) throws FileNotFoundException, IOException{
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Employees sheet");
        TTxuatCPK src = new TTxuatCPK(Tencp,Donvi,Soluong,Tongchiphi,Ghichu);
        
        ArrayList<TTxuatCPK> list = new ArrayList<>();
        list.add(src);
        
        int rownum = 0;
        Cell cell;
        Row row;
        
        HSSFCellStyle style = createStyleForTitle(workbook);
        row = sheet.createRow(rownum);
        HSSFRow A = sheet.createRow(0);
        A.createCell(0).setCellValue(new HSSFRichTextString("ABC"));
        
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Tên chi phí");
        cell.setCellStyle(style);
        
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Đơn vị");
        cell.setCellStyle(style);
        
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Số lượng");
        cell.setCellStyle(style);
        
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Tổng chi phí");
        cell.setCellStyle(style);
        
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Ghi chú");
        cell.setCellStyle(style);      
        
        //---------data-----------------------------
        // dư liêu trong cơ sơ lieu đươc đưa voà 
        for(TTxuatCPK s : list){
           rownum++;
           row=sheet.createRow(rownum);
           cell = row.createCell(0, CellType.STRING);
           cell.setCellValue(s.getTencp());          
           cell = row.createCell(1, CellType.STRING);        
           cell.setCellValue(s.getDonvi());           
           cell = row.createCell(2, CellType.STRING);
           cell.setCellValue(s.getSoluong());
           cell = row.createCell(3, CellType.STRING);
           cell.setCellValue(s.getTongchiphi());
           cell = row.createCell(4, CellType.STRING);
           cell.setCellValue(s.getGhichu());  
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
