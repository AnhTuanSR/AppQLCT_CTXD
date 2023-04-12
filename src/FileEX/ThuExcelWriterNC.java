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
import static FileEX.TTxuatNC.*;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
/**
 *
 * @author thuan
 */
public class ThuExcelWriterNC {
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
        TTxuatNC src = new TTxuatNC(IDNC,HoTen,GioiTinh,SDT,Chucvu,Songaylam,Luongcoban,thuong,tongluong);
        
        ArrayList<TTxuatNC> list = new ArrayList<>();
        list.add(src);
        
        int rownum = 0;
        Cell cell;
        Row row;
        
        HSSFCellStyle style = createStyleForTitle(workbook);
        row = sheet.createRow(rownum);
        
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Mã công nhân");
        cell.setCellStyle(style);
        
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Họ tên");
        cell.setCellStyle(style);
        
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Gioi tính");
        cell.setCellStyle(style);
        
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Số điện thoại");
        cell.setCellStyle(style);
        
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Chức vụ");
        cell.setCellStyle(style);
        
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Số ngày làm");
        cell.setCellStyle(style);
        
        cell = row.createCell(6, CellType.STRING);
        cell.setCellValue("Lương cơ bản");
        cell.setCellStyle(style);
        
        cell = row.createCell(7, CellType.STRING);
        cell.setCellValue("Thưởng");
        cell.setCellStyle(style);
        
        cell = row.createCell(8, CellType.STRING);
        cell.setCellValue("Tổng lương");
        cell.setCellStyle(style);
        
        
        //---------data-----------------------------
        // dư liêu trong cơ sơ lieu đươc đưa voà 
        for(TTxuatNC s : list){
           rownum++;
           row=sheet.createRow(rownum);
           cell = row.createCell(0, CellType.STRING);
           cell.setCellValue(s.getIDNC());  
           cell = row.createCell(1, CellType.STRING);  
           cell.setCellValue(s.getHoTen());
           cell = row.createCell(2, CellType.STRING);
           cell.setCellValue(s.getGioiTinh());  
           cell = row.createCell(3, CellType.STRING);
           cell.setCellValue(s.getSDT());
           cell = row.createCell(4, CellType.STRING);
           cell.setCellValue(s.getChucvu());
           cell = row.createCell(5, CellType.STRING);
           cell.setCellValue(s.getSongaylam());
           cell = row.createCell(6, CellType.STRING);
           cell.setCellValue(s.getLuongcoban());
           cell = row.createCell(7, CellType.STRING);
           cell.setCellValue(s.getThuong());
           cell = row.createCell(8, CellType.STRING);
           cell.setCellValue(s.getTongluong()); 
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
