package DataBase;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luan
 */
import java.sql.*;
import javax.swing.*;

public class MyConnect {
   
    public static Connection getConnect(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;Database=QLCT_CTXaydung;user=Doan;password=12345";
            Connection con = DriverManager.getConnection(url);
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString(),"Loi",JOptionPane.ERROR_MESSAGE);
            return null;
        } 
    }
}
        
