/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anand
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconn {
    
    Connection conn;
    public static Connection connecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\anand\\Documents\\NetBeansProjects\\Libary System\\LibManager.sqlite");
            return conn; 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
