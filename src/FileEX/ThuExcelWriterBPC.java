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
import static FileEX.TTxuatBPC.*;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
/**
 *
 * @author thuan
 */
public class ThuExcelWriterBPC {
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
        TTxuatBPC src = new TTxuatBPC(IDDA,TenDA,HoTenKH,SDT,DiaDiem,NgayNhan,DatCoc,TienDo);
        
        ArrayList<TTxuatBPC> list = new ArrayList<>();
        list.add(src);
        
        int rownum = 0;
        Cell cell;
        Row row;
        
        HSSFCellStyle style = createStyleForTitle(workbook);
        row = sheet.createRow(rownum);
        HSSFRow A = sheet.createRow(0);
        A.createCell(0).setCellValue(new HSSFRichTextString("ABC"));
        
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Mã dự án");
        cell.setCellStyle(style);
        
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Tên dự án");
        cell.setCellStyle(style);
        
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Họ tên khách hàng");
        cell.setCellStyle(style);
        
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Số điện thoại");
        cell.setCellStyle(style);
        
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Địa điểm");
        cell.setCellStyle(style);
        
        cell = row.createCell(5, CellType.STRING);
        cell.setCellValue("Ngày nhận");
        cell.setCellStyle(style);
        
        cell = row.createCell(6, CellType.STRING);
        cell.setCellValue("Đặt cọc");
        cell.setCellStyle(style);
        
        cell = row.createCell(7, CellType.STRING);
        cell.setCellValue("Tiến độ");
        cell.setCellStyle(style);       
        
        //---------data-----------------------------
        // dư liêu trong cơ sơ lieu đươc đưa voà 
        for(TTxuatBPC s : list){
           rownum++;
           row=sheet.createRow(rownum);
           cell = row.createCell(0, CellType.STRING);
           cell.setCellValue(s.getIDDA());        
           cell = row.createCell(1, CellType.STRING);          
           cell.setCellValue(s.getTenDA());     
           cell = row.createCell(2, CellType.STRING);
           cell.setCellValue(s.getHotenKH());
           cell = row.createCell(3, CellType.STRING);
           cell.setCellValue(s.getSDT());
           cell = row.createCell(4, CellType.STRING);
           cell.setCellValue(s.getDiaDiem());
           cell = row.createCell(5, CellType.STRING);
           cell.setCellValue(s.getNgayNhan());
           cell = row.createCell(6, CellType.STRING);
           cell.setCellValue(s.getDatCoc());
           cell = row.createCell(7, CellType.STRING);
           cell.setCellValue(s.getTienDo());
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
